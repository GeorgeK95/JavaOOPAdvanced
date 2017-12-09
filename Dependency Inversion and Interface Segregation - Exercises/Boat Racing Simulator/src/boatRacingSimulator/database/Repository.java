package boatRacingSimulator.database;

import boatRacingSimulator.Utility.Constants;
import boatRacingSimulator.contracts.IModelable;
import boatRacingSimulator.contracts.IRepository;
import boatRacingSimulator.exeptions.DuplicateModelException;
import boatRacingSimulator.exeptions.NonExistantModelException;

import java.util.HashMap;

public class Repository<T extends IModelable> implements IRepository<T> {
    private HashMap<String, T> itemsByModel;

    Repository() {
        this.setItemsByModel(new HashMap<>());
    }

    protected HashMap<String, T> getItemsByModel() {
        return this.itemsByModel;
    }

    private void setItemsByModel(HashMap<String, T> itemsByModel) {
        this.itemsByModel = itemsByModel;
    }

    @Override
    public void Add(T item) throws DuplicateModelException {
        if (this.itemsByModel.containsKey(item.getModel())) {
            throw new DuplicateModelException(Constants.DuplicateModelMessage);
        }
        this.itemsByModel.put(item.getModel(), item);
    }

    @Override
    public T GetItem(String model) throws NonExistantModelException {
        if (!this.itemsByModel.containsKey(model)) {
            throw new NonExistantModelException(Constants.NonExistantModelMessage);
        }

        return this.itemsByModel.get(model);
    }

}
