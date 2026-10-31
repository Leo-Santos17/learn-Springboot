package dev.java10x.Fridge.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping
public class GeneralController {
    @GetMapping
    public Map<String, String> teste()
    {
        Map<String, String> resposta = new HashMap<>();
        resposta.put("message", "Hello World");
        return resposta;
    }
}
