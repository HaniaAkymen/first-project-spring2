package de.telran.firstprojectspring2;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Stack;

@RestController
public class HelloController {


    @GetMapping(value = "/hello")
    public String hello(){
        return "Hello, how are you?";
    }

    @GetMapping(value = "/show")
    public List<Book> show() {
        return books;
    }

    @GetMapping(value = "/calculator")
    public int calculate(@RequestParam(name = "first") Integer a, @RequestParam(name = "second") Integer b){
        return a + b;
    }

    @GetMapping(value = "/what-is-your-name")
    public String sayYourName(@RequestParam(name = "name") String name, @RequestParam(name = "lang") String lang) {

        if (lang.equals("eng")){
            return "Hello, " + name;
        }
        if (lang.equals("rus")){
            return "Привет, " + name;
        }

        return "Привет всем";

    }


}
