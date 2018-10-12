package by.upload.sending;

import by.upload.Constants;
import by.upload.utils.Utils;

import java.util.List;

public class Sender {
    private Utils utils = new Utils();
    private String text;
    private List<String> adr;
    private String subject = Constants.SUBJECT;
    private String username = Constants.UN;
    private String password = Constants.PS;
    private Mailer mailer = new Mailer(username, password);
    private static final int SleepMills = 10000;

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
                //Utils.sleep(SleepMills);
                mailer.send(subject, text, str);
                //adr.remove(str);
                System.out.println(str);
            }
        }

    }
}
