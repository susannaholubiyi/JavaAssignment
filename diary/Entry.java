package diary;

import java.time.LocalDateTime;

public class Entry {
    private int id = 0;
    private String title;
    private String body;
    private LocalDateTime dateCreated;

    public Entry(int id, String title, String body){
        this.id = id;
        this.title= title;
        this.body = body;
    }
    public void updateTitle(String newTitle){
        this.title =newTitle;
    }
    public void updateBody(String newBody){
        this.body =newBody;
    }
    public int getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public String getBody(){
        return body;
    }
}
