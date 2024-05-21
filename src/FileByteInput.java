import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;

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

        // Use ByteArrayInputStream to read the byte array
        System.out.println("Reading file contents:");
        try (ByteArrayInputStream byteStream = new ByteArrayInputStream(data)) {
            int b;
            while ((b = byteStream.read()) != -1) {
                System.out.print((char) b); // Print as characters
            }
        }
    }
}
