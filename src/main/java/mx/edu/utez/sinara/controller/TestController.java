package mx.edu.utez.sinara.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.edu.utez.sinara.service.TestService;

@RestController
@RequestMapping(path = "/test")
public class TestController {
    @Autowired
    private TestService testService;
}
