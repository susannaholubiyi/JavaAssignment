package diary;

import diary.exception.IncorrectPasswordException;

import java.util.ArrayList;

public class Diary {
    private boolean isLocked = true;
    private final String userName;
    private final String password;
    private int numberOfEntries = 1;
    private ArrayList<Entry> entries = new ArrayList<>();
    public Diary(String userName, String password){
        this.userName = userName;
        this.password = password;
    }
    public boolean isLocked() {
        return isLocked;
    }
    public void unlockDiary(String password) {
        if (!this.password.equals(password)){
            throw new IncorrectPasswordException("Password is incorrect, enter a correct pin");
        }        isLocked = false;
    }

    public void lockDiary() {
        isLocked = !isLocked;
    }
    public void createEntry(String title, String body) {
            Entry newEntry = new Entry(numberOfEntries, title, body);
            entries.add(newEntry);
            numberOfEntries++;

    }

    public int getNumberOfEntries() {
        return entries.size();
    }

    public void deleteEntry(int id) {
        Entry foundEntry = findEntryById(id);

        entries.remove(foundEntry);
    }

    public Entry findEntryById(int id) {
        for(Entry entry : entries) {
            if (entry.getId() == id)
                return entry;

        }
        throw new diary.exception.InvalidIdExeception("Id is invalid, enter a valid Id");
    }

    public void updateEntry(int id, String title, String body) {
        Entry foundEntry = findEntryById(id);
        foundEntry.updateTitle(title);
        foundEntry.updateBody(body);

    }

}






