package twitter;

import java.util.List;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class Message implements Tweet {
    private List<String> messages;

    public Message(List<String> messages) {
        this.messages = messages;
    }

    @Override
    public String retrieveMessage() {
        return this.messages.get(new IRandom.Random().nextInt(messages.size()));
    }
}
