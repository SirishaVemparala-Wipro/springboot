package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * A controller that returns a greeting based on the provided day.
 */
@RestController
public class DayController {

    @GetMapping("/day")
    public String getDay(@RequestParam(value = "day", defaultValue = "Sunday") String day) {
        return "Happy " + day + "!";
    }
}
