public class Note{

    private int noteId;
    private String noteTitle;
    private String noteContent;

    public Note(int id, String title, String content){
        this.noteId = id;
        this.noteTitle = title;
        this.noteContent = content;
    }

    public int getNoteId(){
        return noteId;
    }

    public String getNoteTitle(){
        return noteTitle;
    }

    public String getNoteContent(){
        return noteContent;
    }

    public void  setNoteTitle(String title){
        this.noteTitle = title;
    }

    public  void setNoteContent(String content){
        this.noteContent = content;
    }

    
    @Override
    public String toString(){
        return "Note ID: "+ noteId +
               "\nNote Title: "+ noteTitle +
               "\nNote Content: "+ noteContent;
    }
    
}