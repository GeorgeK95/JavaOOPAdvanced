package warningLevels;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class Message {
    private Importance importance;
    private String content;

    public Message(String importance, String content) {
        this.importance = Importance.valueOf(importance);
        this.content = content;
    }

    public Importance getImportance() {
        return importance;
    }

    @Override
    public String toString() {
        return String.format("%s: %s", this.importance,this.content);
    }
}
