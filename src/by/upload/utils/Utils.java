package by.upload.utils;

import by.upload.Constants;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Utils {
    private String text;
    private List<String> adr;

    public static void writeToFile(String text) {
        String savePath = Constants.SAVEPATH;
        try {
            Files.write(Paths.get(savePath), text.getBytes());
            System.out.println("File saved. "+ savePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public String mailText(){
        try {
            text = new String(Files.readAllBytes(Paths.get(Constants.MAILTEXT)));
        } catch (IOException e) {
            System.out.println("File with text not found!");
        }
        return text;
    }

    public List<String> mailAddresses(){
        try {
            adr = Files.readAllLines(Paths.get(Constants.MAILADRES));
        } catch (IOException e){
            System.out.println("File with addresses not found!");
        }
        return adr;
    }

    public static void sleep(int sleepMills){
        try{
            Thread.sleep(sleepMills);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}
