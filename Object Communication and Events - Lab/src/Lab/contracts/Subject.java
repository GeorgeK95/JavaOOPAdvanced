package Lab.contracts;


/**
 * Created by George-Lenovo on 6/29/2017.
 */
public interface Subject {
    void register(Observer observer);

    void unregister(Observer observer);

    void notifyObservers();

}
