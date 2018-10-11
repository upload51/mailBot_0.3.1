package by.upload.parsing;

import by.upload.utils.Constants;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class AddressParser {
    private List<String> adr;

    public List<String> mailAddress() throws IOException {

        adr = Files.readAllLines(Paths.get(Constants.MAILADRES));
        return adr;
    }
}
