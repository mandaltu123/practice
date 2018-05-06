package design.behavioural.strategy;

import java.io.File;
import java.util.List;

public class TarCompressionStrategy implements CompressionStrategy {
    @Override
    public void compressFiles(List<File> files) {
        System.out.println("Tar compression strategy implemented");
    }
}
