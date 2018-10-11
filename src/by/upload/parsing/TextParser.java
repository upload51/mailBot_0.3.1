package by.upload.parsing;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TextParser {
    private String text;

    public String mailText () throws IOException {

        text = new String(Files.readAllBytes(Paths.get(Constants.MAILTEXT)));
        return text;
    }
}
