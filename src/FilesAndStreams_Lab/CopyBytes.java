package FilesAndStreams_Lab;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes {
    public static void main(String[] args) {
        String inputPath = "C:\\Users\\namewasntfound\\IdeaProjects\\Java-Advanced-May\\src\\FilesAndStreams_Lab\\input.txt";
        String outputPath = "C:\\Users\\namewasntfound\\IdeaProjects\\Java-Advanced-May\\src\\FilesAndStreams_Lab\\output.txt";

        try (FileInputStream in = new FileInputStream(inputPath);
             FileOutputStream out = new FileOutputStream(outputPath)) {

            int oneByte = 0;
            while ((oneByte = in.read()) >= 0) {
                String digits = String.valueOf(oneByte);
                if (oneByte == 10 || oneByte == 32) {
                    out.write(oneByte);
                } else {
                    for (int i = 0; i < digits.length(); i++) {
                        out.write(digits.charAt(i));
                    }
                }

            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
