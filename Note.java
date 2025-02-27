import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Note implements Serializable {
    private final String title;
    private ArrayList<String> linesOfNote;
    private String time;

    public Note(String title) {
        this.title = title;
        this.time = (new Date()).toString();
        this.linesOfNote = new ArrayList();
    }

    public String getTitle() {
        return this.title;
    }

    public ArrayList<String> getLinesOfNote() {
        return this.linesOfNote;
    }

    public String getTime() {
        return this.time;
    }

    public boolean addLine(String line) {
        return this.linesOfNote.add(line);
    }

    public void showNote() {
        System.out.println("///////////      *");
        System.out.println(this.title);
        System.out.println("*      ///////////");
    }
}