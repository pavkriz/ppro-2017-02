package cz.uhk.ppro.rest2.controllers;

import java.util.concurrent.atomic.AtomicLong;

import cz.uhk.ppro.rest2.model.Greeting;
import cz.uhk.ppro.rest2.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
public class GreetingController {
    @Autowired
    GreetingService greetingService;

    @RequestMapping("/greeting")
    @ResponseBody
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return greetingService.createGreeting(name);
    }
}