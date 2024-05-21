import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
        public static void main (String[] args) {
            String text = "Hello world!"; // crpoka mx 3anCM;
            try (
                    FileOutputStream fos = new FileOutputStream (  "C:/SomeDir/notes.txt")){
            byte[] buffr =text.getBytes();// nepeBon crporn B 6aMTH
            fos.write (buffr,  0, buffer.length);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());

            System. out.println ("The file has been written");}}
}