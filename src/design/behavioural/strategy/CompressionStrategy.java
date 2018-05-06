package design.behavioural.strategy;

import java.io.File;
import java.util.List;

/**
 * Interface CompressionStrategy has just one method, compressFiles.
 */
public interface CompressionStrategy {

    void compressFiles(List<File> files);
}
