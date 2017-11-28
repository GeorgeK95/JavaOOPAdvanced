package IO.commands;

import StaticData.SessionData;
import annotations.Alias;
import exceptions.InvalidInputException;

import java.awt.*;
import java.io.File;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
@Alias(value = "open")
public class OpenFileCommand extends Command {
    public OpenFileCommand(String line, String[] data) {
        super(line, data);
    }

    @Override
    public void execute() throws Exception {
        String[] data = this.getData();
        if (data.length != 2) {
            throw new InvalidInputException(this.getLine());
        }
        String fullFilePath = SessionData.currentPath + "\\" + data[1];
        File f = new File(fullFilePath);
        Desktop.getDesktop().open(f);
    }
}
