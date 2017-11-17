package i_mood_3;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class Demon extends GameObject {

    Demon(String userName, String password, double points, int level) {
        super(userName, password, level, points);
    }

    @Override
    void setPassword(String password) {
        super.setPassword(String.valueOf(super.getUserName().length() * 217));
    }

    @Override
    public String toString() {
        return super.toString().concat(super.getPoints() * super.getLevel() + "");
    }

}
