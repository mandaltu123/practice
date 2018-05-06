package design.behavioural.strategy;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class CompressionstrategyTester {

    public static void main(String[] args) {

        CompressionContext compressionContext = new CompressionContext();
        compressionContext.setCompressionstrategy(new TarCompressionStrategy());
        File file1 = new File("test1.txt");
        File file2 = new File("test2.txt");
        File file3 = new File("test3.txt");
        File file4 = new File("test4.txt");
        File[] array = {file1, file2, file3, file4};
        List<File> files = Arrays.asList(array);
        compressionContext.createArchive(files);
    }
}
