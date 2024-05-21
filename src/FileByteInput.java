import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Formatter;

public class FileByteInput {
    public static void main(String[] args) throws IOException {

        // Replace "path/to/your/file.txt" with the actual path to your file
        String filePath = "C:/Users/sknat/OneDrive/Documents/Assembly/test.obj";

        // Read file into a byte array
        byte[] data;
        try (FileInputStream fis = new FileInputStream(filePath)) {
            int fileLength = fis.available(); // Get file size
            data = new byte[fileLength];
            fis.read(data); // Read entire file into the byte array
        }

        // Use ByteArrayInputStream to read the byte array and print hex values
        System.out.println("Reading file contents in hexadecimal:");
        try (ByteArrayInputStream byteStream = new ByteArrayInputStream(data)) {
            StringBuilder hexBuilder = new StringBuilder();
            Formatter formatter = new Formatter(hexBuilder);
            int b;
            while ((b = byteStream.read()) != -1) {
                formatter.format("%02X ", b); // Format as "%02X " for two-digit hex with space
            }
            System.out.println(hexBuilder.toString());
        }
    }
}
