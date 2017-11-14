package contracts;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public interface DirectoryChanger {
    void changeCurrentDirRelativePath(String relativePath);

    void changeCurrentDirAbsolute(String absolutePath);
}
