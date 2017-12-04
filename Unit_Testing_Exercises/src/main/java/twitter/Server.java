package twitter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class Server implements IServer {

    private List<Tweet> tweets;

    public Server() {
        this.tweets = new ArrayList<>();
    }

    @Override
    public void storeTweet(Tweet tweet) {
        this.tweets.add(tweet);
    }
}
