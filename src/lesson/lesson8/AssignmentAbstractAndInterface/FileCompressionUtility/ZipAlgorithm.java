package lesson.lesson8.assignmentabstractandinterface.filecompressionutility;

public class ZipAlgorithm extends CompressionAlgorithm{

    @Override
    void compress(String inputFile, String outputFile) {
        System.out.println("Compressing into Zip File: " + inputFile + "   ->   " + outputFile );
    }
    
}
