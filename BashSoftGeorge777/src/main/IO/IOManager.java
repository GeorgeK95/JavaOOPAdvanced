package main.IO;

import main.Judge.Tester;
import main.Network.DownloadManager;
import main.Repository.RepositoryFilter;
import main.Repository.RepositorySorter;
import main.Repository.StudentsRepository;
import main.StaticData.SessionData;
import main.contracts.*;
import main.exceptions.InvalidFileNameException;
import main.exceptions.InvalidPathException;

import java.io.File;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class IOManager implements DirectoryManager {
    public static final String FORBIDDEN_SYMBOLS_CONTAINED_IN_NAME = "Forbidden symbols contained in name.";

    public void traverseDirectory(int depth) {
        Queue<File> queue = new LinkedList<>();
        String path = SessionData.currentPath;
        int initialIndentation = path.split("\\\\").length;
        queue.add(new File(path));

        while (!queue.isEmpty()) {
            File current = queue.poll();
            int currentIndentation = current.toString().split("\\\\").length - initialIndentation;

            if (depth - currentIndentation < 0) {
                break;
            }

            OutputWriter.writeMessageOnNewLine(current.toString());

            try {
                if (current.listFiles() != null) {
                    for (File file : current.listFiles()) {
                        if (file.isDirectory()) {
                            queue.add(file);
                        } else {
                            int indexOfLastSlash = file.toString().lastIndexOf("\\");
                            for (int i = 0; i < indexOfLastSlash; i++) {
                                OutputWriter.writeMessage("-");
                            }

                            OutputWriter.writeMessageOnNewLine(file.getName());
                        }
                    }
                }

            } catch (Exception err) {
                System.out.println("Error.");
            }

        }
    }

    public void createDirectoryInCurrentFolder(String name) {
        String path = getCurrentDirectoryPath() + "\\" + name;
        File f = new File(path);
        boolean wasDirMade = f.mkdir();
        if (!wasDirMade) {
            throw new InvalidFileNameException();
        }
    }

    private static String getCurrentDirectoryPath() {
        return SessionData.currentPath;
    }

    public void changeCurrentDirRelativePath(String relativePath){
        if (relativePath.equals("..")) {
            try {
                String currentPath = SessionData.currentPath;
                int lastSlashIndex = currentPath.lastIndexOf("\\");
                SessionData.currentPath = currentPath.substring(0, lastSlashIndex);
            } catch (StringIndexOutOfBoundsException sioobe) {
                throw new InvalidPathException();
            }
        } else {
            String currentPath = SessionData.currentPath;
            currentPath += "\\" + relativePath;
            changeCurrentDirAbsolute(currentPath);
        }
    }

    public void changeCurrentDirAbsolute(String absolutePath) {
        File f = new File(absolutePath);
        if (!f.exists()) {
            throw new InvalidPathException();
        }
        SessionData.currentPath = absolutePath;
    }

    public static void main(String[] args) /*throws IOException, InterruptedException*/ {
        DirectoryManager ioManager = new IOManager();
        ContentComparer tester = new Tester();
        DownloadManager downloadManager = new DownloadManager();
        DataFilter repositoryFilter = new RepositoryFilter();
        DataSorter repositorySorter = new RepositorySorter();
        Database studentsRepository = new StudentsRepository(repositoryFilter, repositorySorter);
        Interpreter commandInterpreter = new CommandInterpreter(ioManager, tester, downloadManager, studentsRepository);
        Reader inputReader = new InputReader(commandInterpreter);
        try {
            inputReader.readCommands();
        } catch (Exception e) {
            OutputWriter.writeException(e.getMessage());
        }

//        traverseDirectory("E:\\GITHUB\\JavaAdvanced");
//        main.Repository.StudentsRepository.loadData();
//        main.Repository.StudentsRepository.getStudentsByCourse("Unity");
//        String filePath_1 = "E:\\SOFTUNI\\Java Advanced - септември 2017\\BashSoft\\03. Java-Advanced-BashSoft-Lab\\test1.txt";
//        String filePath_2 = "E:\\SOFTUNI\\Java Advanced - септември 2017\\BashSoft\\03. Java-Advanced-BashSoft-Lab\\test3.txt";
//        main.Judge.Tester.compareContent(filePath_1, filePath_2);
//        main.IO.IOManager.createDirectoryInCurrentFolder("golfajiq");
    }


}
