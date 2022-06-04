package FilesAndStreams_Lab;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WriteToFile {
    public static void main(String[] args) {
        String inputPath = "C:\\Users\\namewasntfound\\IdeaProjects\\Java-Advanced-May\\src\\FilesAndStreams_Lab\\input.txt";
        String outputPath = "C:\\Users\\namewasntfound\\IdeaProjects\\Java-Advanced-May\\src\\FilesAndStreams_Lab\\output.txt";

        List<Character> symbols = new ArrayList<>();
        Collections.addAll(symbols, ',', '.', '!', '?');

        try (FileInputStream input = new FileInputStream(inputPath);
             FileOutputStream output = new FileOutputStream(outputPath)) {
            int oneByte = 0;
            while ((oneByte = input.read()) >= 0) {
                if (!symbols.contains((char) oneByte)) {
                    output.write(oneByte);
                }
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
