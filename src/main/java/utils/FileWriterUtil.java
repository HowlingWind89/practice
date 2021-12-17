package utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterUtil {

    public static String filePath = "src/test/java/jsonFiles/sessionToken.txt";

    public void createNewFile() throws IOException {

        try {
            File newFile = new File(filePath);
            if (newFile.createNewFile()) {
                System.out.println("File created: " + newFile.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void writeDataToFile(String fileData) throws IOException {
        try {
            FileWriter myWriter = new FileWriter(filePath);
            myWriter.write(fileData.replaceAll("[{}\"]", "").substring(52));
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
