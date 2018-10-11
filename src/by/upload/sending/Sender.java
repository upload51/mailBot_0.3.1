package by.upload.sending;

import by.upload.parsing.AddressParser;
import by.upload.parsing.TextParser;
import by.upload.utils.Constants;

import java.io.IOException;
import java.util.List;

public class Sender {
    private Mailer mailer = new Mailer("anon1dvach@gmail.com", "ZAQ!@wsx");
    private AddressParser main = new AddressParser();
    private TextParser tx = new TextParser();
    private String text;
    private List<String> adr;
    private String subject = Constants.SUBJECT;

    public Sender() {
    }

    {
        try {
            text = tx.mailText();
        } catch (IOException e) {
            System.out.println("No mail text");
        }
    }

    {
        try {
            adr = main.mailAddress();
        } catch (IOException e) {
            System.out.println("No recipient addresses");
        }
    }


    public void send() {

        for (String str : adr) {
            if (str != null) {
                mailer.send(subject, text, str);
            }
        }
    }
}
