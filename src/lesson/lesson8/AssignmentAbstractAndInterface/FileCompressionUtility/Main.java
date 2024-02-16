package lesson.lesson8.assignmentabstractandinterface.FileCompressionUtility;

public class Main {
    public static void main(String[] args) {
        ZipAlgorithm zip = new ZipAlgorithm();
        zip.compress("alabama.txt", "alabama.zip");

        GZipAlgorithm gzip = new GZipAlgorithm();
        gzip.compress("aligator.txt", "aligator.gz");

        LZMAAlgorithm lzma = new LZMAAlgorithm();
        lzma.compress("Wood.txt", "Wood.xz");
    }
}
