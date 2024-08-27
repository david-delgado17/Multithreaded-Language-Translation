package edu.wgu.d387_sample_code.display;


import java.util.Locale;
import java.util.ResourceBundle;

public class WelcomeMessage implements Runnable {

    /// Creating Locale variable!

    private Locale locale;

    public WelcomeMessage (Locale locale) {

        this.locale = locale;

    }
// Getting the welcome message needed!

    public String getWelcomeMessage () {

        ResourceBundle resourceBundle = ResourceBundle.getBundle("welcome", locale);
        System.out.println("..............Using locale= " + locale.getDisplayCountry() + "_" + locale.getDisplayLanguage());
        return resourceBundle.getString("welcome");
    }

    @Override
    public void run() {

        System.out.println(getWelcomeMessage());

    }
}
