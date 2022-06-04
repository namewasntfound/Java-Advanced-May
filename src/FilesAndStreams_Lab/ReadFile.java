package FilesAndStreams_Lab;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        String path = "C:\\Users\\namewasntfound\\IdeaProjects\\Java-Advanced-May\\src\\FilesAndStreams_Lab\\input.txt";

        try (FileInputStream fileStream = new FileInputStream(path)) {
            int oneByte = fileStream.read();
            while (oneByte >= 0) {
                System.out.printf("%s ", Integer.toBinaryString(oneByte));
                oneByte = fileStream.read();
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
