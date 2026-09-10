package com.example.devopsservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    // application.yaml에서 읽어온다. 배포 시에는 GitHub Secrets가 그 파일을 만들어 준다.
    @Value("${app.message}")
    private String message;

    @GetMapping("/")
    public String index() {
        return "Good Day";
    }

    @GetMapping("/config")
    public String config() {
        return message;
    }
}
