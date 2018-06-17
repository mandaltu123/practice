package java8.fileoperations;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class DirectoryList {

    public static void main(String[] args) throws IOException {
        List<Path> directoryList = Files.list(Paths.get("."))
                .collect(Collectors.toList());


        System.out.println(directoryList.toString());
        System.out.println("-----------------> ");

        Files.list(Paths.get("/home/tuhin/programming"))
                .filter(Files::isDirectory)
                .forEach(System.out::println);


        // Listing of all files in a given directory and its sub directory
        List<Path> filesLists = Files.list(Paths.get("/home/tuhin/programming/misc-code"))
                .collect(Collectors.toList());

        System.out.println(filesLists.toString());

        //List files of certain extention with Files.newDirectoryStream()
        Files.newDirectoryStream(Paths.get("/home/tuhin/programming/misc-code")
                , path -> path.toString().endsWith(".java"))
                .forEach(System.out::print);

        // another way of doing it::::::
        List<String> directories = Files.list(Paths.get("/home/tuhin/programming/mygits/practice"))
                .map(Path::toFile)
                .map(File::getAbsolutePath)
                .collect(Collectors.toList());

        System.out.println(directories.toString());

        final File[] files = new File(".").listFiles(file -> file.canExecute());
        for (int i = 0; i < files.length; i++) {
            System.out.println(files[i]);
        }

    }
}
