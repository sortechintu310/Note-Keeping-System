
import java.io.*;
import java.util.*;

public class NoteFileHandler {
    private static final String FILE_PATH = "E:\\MCA\\JAVA Mini-Project\\Noteable\\resources/note.txt";

    // Save notes to the file
    public static void saveNotesToFile(List<Note> notes) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (Note note : notes) {
                writer.write(note.getNoteId() + "|" + note.getNoteTitle() + "|" + note.getNoteContent());
                writer.newLine();
            }
            System.out.println("New Note Saved Successfully!");
        } catch (IOException e) {
            System.out.println("Error saving notes to file: " + e.getMessage());
        }
    }

    // Load notes from the file
    public static List<Note> loadNotesFromFile() {
        List<Note> notes = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\|");
                if (parts.length == 3) {
                    int id = Integer.parseInt(parts[0]);
                    String title = parts[1];
                    String content = parts[2];
                    notes.add(new Note(id, title, content));
                }
            }
        } catch (IOException e) {
            System.out.println("Error loading notes from file: " + e.getMessage());
        }
        return notes;
    }

    // Update a note by ID
    public static void updateNoteById(int id, String newTitle, String newContent) {
        List<Note> notes = loadNotesFromFile();
        for (Note note : notes) {
            if (note.getNoteId() == id) {
                note.setNoteTitle(newTitle);
                note.setNoteContent(newContent);
                saveNotesToFile(notes);
                System.out.println("Note updated successfully.");
                return;
            }
        }
        System.out.println("Note with ID " + id + " not found.");
    }

    // Delete a note by ID
    public static void deleteNoteById(int id) {
        List<Note> notes = loadNotesFromFile();
        boolean removed = notes.removeIf(note -> note.getNoteId() == id);
        if (removed) {
            saveNotesToFile(notes);
            System.out.println("Note deleted successfully.");
        } else {
            System.out.println("Note with ID " + id + " not found.");
        }
    }
}
