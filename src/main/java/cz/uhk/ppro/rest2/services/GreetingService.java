package cz.uhk.ppro.rest2.services;

import cz.uhk.ppro.rest2.model.Greeting;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class GreetingService {

    private final String template;
    private final AtomicLong counter = new AtomicLong();

    public GreetingService() {
        this.template = "Nazdar, %s!";
    }

    public GreetingService(String template) {
        this.template = template;
    }

    public Greeting createGreeting(String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }
}
