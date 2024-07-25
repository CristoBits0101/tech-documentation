package com.training.demo.controllers.types;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.demo.models.Cat;

@RequestMapping("/api")
@RestController
public class ApiController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from the API!";
    }

    @GetMapping("/cat")
    public Cat bye() {

        Cat cat = new Cat();

        cat.setName("Toru");
        cat.setAge(6);

        Map<String, String> attributes = new HashMap<>();

        attributes.put("BodyColor", "Brown");
        attributes.put("BodyColor", "Yellow");
        attributes.put("EyesColor", "Green");

        cat.setAttributes(attributes);

        return cat;

    }

}
