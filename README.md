# Notable - A Simple Note-Taking Java Application

## Overview
**Notable** is a basic note-taking application developed in **Core Java**. It allows users to create, view, update, delete, and reload notes stored in a text file (`note.txt`). The application uses an interactive console interface and is ideal as a mini-project for learning file handling, ArrayLists, and modular Java programming.

---

## Features
- **Add Notes**: Create new notes with a title and content.
- **View Notes**: Display all notes stored in the `note.txt` file.
- **Update Notes**: Modify the content of an existing note.
- **Delete Notes**: Remove a note by its index.
---

## Folder Structure
```
noteable/
|-- resources/
|   |-- note.txt          # Stores all notes
|
|-- Main.java     # Entry point of the application
|-- Note.java     # Note model class
|-- NoteFileHandler.java  # Handles file operations
```

---

## Getting Started

### Prerequisites
- **Java Development Kit (JDK)** 8 or higher
- A text editor or IDE (e.g., IntelliJ IDEA, Eclipse, or VS Code)
- Command-line interface (CLI) or terminal

### How to Run
1. Clone or download the project to your local machine.
2. Navigate to the `noteable` folder.
3. Compile the Java files:
   ```
   javac *.java
   ```
4. Run the program:
   ```
   java Main.java
   ```

---

## How to Use

### Commands
1. **View Notes**:
   - Displays all notes from the `note.txt` file.
   - Command: `v`

2. **Add a Note**:
   - Prompts you to input a note title and content.
   - Saves the new note to `note.txt`.
   - Command: `a`

3. **Update a Note**:
   - Prompts you to specify the note number to update and provide new content.
   - Updates the note in `note.txt`.
   - Command: `u`

4. **Delete a Note**:
   - Prompts you to specify the note number to delete.
   - Removes the note from `note.txt`.
   - Command: `d`

5. **Exit the Program**:
   - Command: `e`

### Example Interaction
```
================Noteable================
Note Down the things which are noteable;

[v] View All Notes.
[a] Add a New Note.
[u] Update a Note.
[d] Delete a Note.
[e] Exit Noteable.
[h] Help.
[e] Exit Noteable.

.\Noteable\~ v
Note ID: 0
Note Title: Complete Task
Note Content: Complete all the task from task list today
----------------------------------------
Note ID: 1
Note Title: Drinking water
Note Content: Every human being should drink atleast 10 glass of water daily. because our body is of 70% of water     
----------------------------------------
Note ID: 2
Note Title: Java Guest Lecture
Note Content: java is multi platform oops language, very advanced language basic syntax is system.out.println("dfjdkf")
----------------------------------------
Note ID: 3
Note Title: What is Lorem Ipsum?
Note Content: Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.  
----------------------------------------

.\Noteable\~ a

Note Title:
New note 
Note Content:
Content for new note
New Note Saved Successfully!

.\Noteable\~ v
Note ID: 0
Note Title: Complete Task
Note Content: Complete all the task from task list today
----------------------------------------
Note ID: 1
Note Title: Drinking water
Note Content: Every human being should drink atleast 10 glass of water daily. because our body is of 70% of water     
----------------------------------------
Note ID: 2
Note Title: Java Guest Lecture
Note Content: java is multi platform oops language, very advanced language basic syntax is system.out.println("dfjdkf")
----------------------------------------
Note ID: 3
Note Title: What is Lorem Ipsum?
Note Content: Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.  
----------------------------------------
Note ID: 4
Note Title: New note
Note Content: Content for new note
----------------------------------------

.\Noteable\~ u
0 Complete Task
1 Drinking water
2 Java Guest Lecture
3 What is Lorem Ipsum?
4 New note

Enter Note Id to be Updated.
4
Note Title:
note updated 4
Note Content:
note was successfully updated
New Note Saved Successfully!
Note updated successfully.

.\Noteable\~ v
Note ID: 0
Note Title: Complete Task
Note Content: Complete all the task from task list today
----------------------------------------
Note ID: 1
Note Title: Drinking water
Note Content: Every human being should drink atleast 10 glass of water daily. because our body is of 70% of water     
----------------------------------------
Note ID: 2
Note Title: Java Guest Lecture
Note Content: java is multi platform oops language, very advanced language basic syntax is system.out.println("dfjdkf")
----------------------------------------
Note ID: 3
Note Title: What is Lorem Ipsum?
Note Content: Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.  
----------------------------------------
Note ID: 4
Note Title: note updated 4
Note Content: note was successfully updated
----------------------------------------

.\Noteable\~ d
0 Complete Task
1 Drinking water
2 Java Guest Lecture
3 What is Lorem Ipsum?
4 note updated 4

Enter Note Id to be Updated.
3
New Note Saved Successfully!
Note deleted successfully.

.\Noteable\~ v
Note ID: 0
Note Title: Complete Task
Note Content: Complete all the task from task list today
----------------------------------------
Note ID: 1
Note Title: Drinking water
Note Content: Every human being should drink atleast 10 glass of water daily. because our body is of 70% of water     
----------------------------------------
Note ID: 2
Note Title: Java Guest Lecture
Note Content: java is multi platform oops language, very advanced language basic syntax is system.out.println("dfjdkf")
----------------------------------------
Note ID: 4
Note Title: note updated 4
Note Content: note was successfully updated
----------------------------------------

.\Noteable\~ e
Thankyou for using Noteable!.

```

---

## Classes

### 1. `Note`
- Represents a single note.
- **Attributes**:
  - `noteId`: Unique identifier for the note.
  - `noteTitle`: Title of the note.
  - `noteContent`: Content of the note.
- **Methods**:
  - `toString()`: Returns a formatted string representation of the note.

### 2. `NoteFileHandler`
- Handles file operations like reading, writing, and syncing notes with `note.txt`.
- **Methods**:
  - `loadNotes()`: Reads notes from the file and returns them as an `ArrayList<String>`.
  - `saveNotes(ArrayList<String> notes)`: Writes the given list of notes to the file.

### 3. `Main`
- Contains the `main` method and the console interface for interacting with the user.
- Handles user commands and invokes appropriate methods from `NoteFileHandler`.

---

## Limitations
- Notes are stored in plain text, without encryption or advanced formatting.
- All operations assume the file (`note.txt`) is accessible and properly formatted.
- No concurrency control for simultaneous read/write operations.

---

## Future Enhancements
- Add support for storing notes in JSON format.
- Implement searching and filtering notes by title or content.
- Introduce a graphical user interface (GUI) using JavaFX or Swing.
- Enhance error handling and input validation.

---

## Author
Chintu Sorte

---

## License
This project is licensed under the MIT License. Feel free to use and modify it for educational or personal projects.

