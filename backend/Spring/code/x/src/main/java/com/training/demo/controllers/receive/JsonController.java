package com.training.demo.controllers.receive;

import com.training.demo.models.Cat;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RequestMapping("/json")
@RestController
public class JsonController {

    @GetMapping("/cat")
    public Cat name(@RequestBody Cat cat) {
        return cat;
    }

}
