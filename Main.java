
import java.util.List;
import java.util.Scanner;

class InvalidNoteException extends Exception {
    public InvalidNoteException(String message) {
        super(message);
    }
}


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        NoteFileHandler nHandler = new NoteFileHandler();

        //List that will save all the notes;
        List<Note> notes = nHandler.loadNotesFromFile();
        int id = notes.size();

        System.out.println("================Noteable================");
        System.out.println("Note Down the things which are noteable;\n");

        char choice;

        System.out.println("[v] View All Notes.");
        System.out.println("[a] Add a New Note.");
        System.out.println("[u] Update a Note.");
        System.out.println("[d] Delete a Note.");
        System.out.println("[e] Exit Noteable.");
        System.out.println("[h] Help.");
        System.out.println("[e] Exit Noteable.");

        while(true) {
            System.out.print("\n.\\Noteable\\~ ");

            choice = sc.next().charAt(0);
            sc.nextLine(); //for add Consumes the leftover newline. if not used title will not be scanned by the cmnd line it will directly jump to the next nextline to fix this is the sol.

            try {

                if (choice == 'v') {
                    notes = nHandler.loadNotesFromFile();
                    if(notes.size()>0){

                        for(Note note: notes){
                            System.out.println(note);
                            System.out.println("----------------------------------------");
                        }
                    }else{
                        System.out.println("No New Notes Available.");
                    }
                }else if(choice == 'a'){
                    notes = nHandler.loadNotesFromFile();
                    

                    String title;
                    String content;

                    System.out.println("\nNote Title: ");
                    title = sc.nextLine();
                    System.out.println("Note Content: ");
                    content = sc.nextLine();

                    id = notes.size();
                    Note note = new Note(id, title, content);

                    notes.add(note);

                    nHandler.saveNotesToFile(notes);


                } else if(choice == 'u'){
                    int uId;
                    String title;
                    String content;

                    notes = nHandler.loadNotesFromFile();
                    
                    for(Note note: notes){
                        System.out.println(note.getNoteId()+" "+note.getNoteTitle());
                    }

                    System.out.println("\nEnter Note Id to be Updated.");
                    uId = sc.nextInt();
                    System.out.println("Note Title: ");
                    sc.nextLine(); // will be skiped.
                    title = sc.nextLine();
                    System.out.println("Note Content: ");
                    content = sc.nextLine();

                    Note note = new Note(id, title, content);
                    notes.set(uId, note);
                    nHandler.updateNoteById(uId, title, content);

                } else if(choice == 'd'){

                    int uId;
                    notes = nHandler.loadNotesFromFile();
                    
                    for(Note note: notes){
                        System.out.println(note.getNoteId()+" "+note.getNoteTitle());
                    }

                    System.out.println("\nEnter Note Id to be Updated.");
                    uId = sc.nextInt();

                    nHandler.deleteNoteById(uId);
                    
                } else if(choice == 'h'){
                    System.out.println("\n");
                    System.out.println("[v] View All Notes.");
                    System.out.println("[a] Add a New Note.");
                    System.out.println("[u] Update a Note.");
                    System.out.println("[d] Delete a Note.");
                    System.out.println("[h] Help.");
                    System.out.println("[e] Exit Noteable.");
                } else if(choice == 'e'){
                    System.out.println("Thankyou for using Noteable!.");
                    break;
                }else {
                    throw new InvalidNoteException(choice+" is not recognized as an internal or external command!\nPress h.");
                }

            } catch (InvalidNoteException e) {
                System.err.println("Error: "+e.getMessage());
            }

        }

    }
}
