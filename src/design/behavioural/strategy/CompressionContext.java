package design.behavioural.strategy;

import java.io.File;
import java.util.List;

public class CompressionContext {

    private CompressionStrategy compressionstrategy;


    public void setCompressionstrategy(CompressionStrategy compressionstrategy) {
        this.compressionstrategy = compressionstrategy;
    }


    public void createArchive(List<File> files) {
        this.compressionstrategy.compressFiles(files);
    }

}
