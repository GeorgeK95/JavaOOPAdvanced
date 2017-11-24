package warningLevels;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class Logger {
    private final Importance MINIMUM_IMPORTANCE;

    private List<Message> messages;

    public Logger(String importance) {
        MINIMUM_IMPORTANCE = Importance.valueOf(importance.toUpperCase());
        this.messages = new ArrayList<>();
    }

    public void addMessage(Message message) {
        if (this.MINIMUM_IMPORTANCE.compareTo(message.getImportance()) <= 0) {
            this.messages.add(message);
        }
    }

    public List<Message> getMessages() {
        return messages;
    }
}
