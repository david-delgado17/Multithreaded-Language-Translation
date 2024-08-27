package edu.wgu.d387_sample_code.rest;
//// NOTE: Reminder to commit and always PUSH!
//package edu.wgu.d387_sample_code.rest;
//
//


import edu.wgu.d387_sample_code.display.WelcomeMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class MessageController {


    @RequestMapping(path= "/welcome")
    public ResponseEntity<String> showWelcome (@RequestParam("language") String language, @RequestParam("country") String country) {
        Locale locale = new Locale(language, country);
        System.out.println("******************* Using language= "+ language +" locale= " + locale.getDisplayCountry() + "_" + locale.getDisplayLanguage());
        WelcomeMessage msg = new WelcomeMessage(locale);


        System.out.println("Requested language: " + language); // Debugging line
        System.out.println("Generated message: " + msg.getWelcomeMessage()); // Debugging line

        return new ResponseEntity<String> (msg.getWelcomeMessage(), HttpStatus.OK);
    }




//    @GetMapping("/welcome")
//    public ResponseEntity<String> showWelcome (@RequestParam("language") String language) {
//        Locale locale = Locale.forLanguageTag(language);
//        WelcomeMessage msg = new WelcomeMessage(locale);
//
//        System.out.println("Requested language: " + language); // Debugging line
//        System.out.println("Generated message: " + msg.getWelcomeMessage()); // Debugging line
//
//        return new ResponseEntity<String> (msg.getWelcomeMessage(), HttpStatus.OK);
//    }


}
