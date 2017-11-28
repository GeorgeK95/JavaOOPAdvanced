package a_harvestingFields;

import java.lang.reflect.Field;
import java.util.stream.Stream;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public interface ICommandExecutor {
    void execute(String line);

    void printFields(Stream<Field> fieldStream);

}
