package contracts;

import java.io.IOException;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public interface Database {
    void loadData(String fileName) throws IOException;

    void unloadData();

}
