package by.upload.sending;

import by.upload.parsing.AddressParser;
import by.upload.parsing.TextParser;
import by.upload.utils.Constants;
import by.upload.utils.Utils;

import java.io.IOException;
import java.util.List;

public class Sender {
    private Mailer mailer = new Mailer("anon1dvach@gmail.com", "ZAQ!@wsx");
    //private AddressParser main = new AddressParser();
    //private TextParser tx = new TextParser();
    private Utils utils = new Utils();
    private String text;
    private List<String> adr;
    private String subject = Constants.SUBJECT;

    public Sender() {
    }

    {
        text = utils.mailText();
    }

    {
        adr = utils.mailAddresses();
    }


    public void send() {

        for (String str : adr) {
            if (str != null) {
                mailer.send(subject, text, str);
            }
        }
    }
}
