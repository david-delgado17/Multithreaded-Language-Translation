/// NOTE: REMEMBER TO ALWAYS COMMIT AND PUSH!


package edu.wgu.d387_sample_code;

import edu.wgu.d387_sample_code.display.WelcomeMessage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Locale;

@SpringBootApplication
public class D387SampleCodeApplication {

	/// When run, make it MULTITHREADED!
	public static void main(String[] args) {

		SpringApplication.run(D387SampleCodeApplication.class, args);

		WelcomeMessage messageInEnglish =new WelcomeMessage(Locale.US);
		Thread englishDisplay = new Thread(messageInEnglish);
		englishDisplay.start();


		WelcomeMessage messageInFrench =new WelcomeMessage(Locale.CANADA_FRENCH);
		Thread frenchDisplay = new Thread(messageInFrench);
		frenchDisplay.start();
	}
}