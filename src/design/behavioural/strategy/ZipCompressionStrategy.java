package design.behavioural.strategy;

import java.io.File;
import java.util.List;

public class ZipCompressionStrategy implements CompressionStrategy {

    @Override
    public void compressFiles(List<File> files) {
        System.out.println("Compression strategy being invoked is Zipping");
    }
}
