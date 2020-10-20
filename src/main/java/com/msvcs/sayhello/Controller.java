package com.msvcs.sayhello;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Slf4j
@RestController
public class Controller {

    @GetMapping("/greeting")
    public String greet(){
        log.info("Access /greeting");

        List<String> greetings = Arrays.asList("Hi there", "Greetings", "Salutations");
        Random rand = new Random();
        int randNum = rand.nextInt(greetings.size());

        return greetings.get(randNum);
    }

    @GetMapping("/")
    public String home(){
        log.info("Access /");
        return "Hi!";

    }
}
