package by.upload.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Utils {

    public static void writeToFile(String json) {
        String savePath = Constants.SAVEPATH;
        try {
            Files.write(Paths.get(savePath), json.getBytes());
            System.out.println("File saved. "+ savePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
