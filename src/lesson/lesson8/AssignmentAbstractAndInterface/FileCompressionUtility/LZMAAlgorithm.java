package lesson.lesson8.AssignmentAbstractAndInterface.FileCompressionUtility;

public class LZMAAlgorithm extends CompressionAlgorithm{

    @Override
    void compress(String inputFile, String outputFile) {
        System.out.println("Compressing into LZMA File: " + inputFile + "   ->   " + outputFile );
    }
    
}
