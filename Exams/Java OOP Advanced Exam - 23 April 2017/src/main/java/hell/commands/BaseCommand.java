package hell.commands;


import hell.repository.Repository;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public abstract class BaseCommand implements Executable {

    private Repository repository;

    protected BaseCommand(Repository repository) {
        this.repository = repository;
    }

    protected Repository getManager() {
        return repository;
    }
}
