package edu.wgu.d387_sample_code.time;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class TimeZoneController {

    @RequestMapping(path= "/presentation")

    public ResponseEntity<String> timePresentation() {

        String times = "Please be part of our online presentation at " + TimePermute.getTime();
        return new ResponseEntity<String> (times, HttpStatus.OK);
    }

}
