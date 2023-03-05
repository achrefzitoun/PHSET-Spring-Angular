package com.pidev.phset.controllers;

import com.pidev.phset.services.AuthenticationService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
@Log4j2
public class AuthRestController {

    @Autowired
    private AuthenticationService authenticate;

    @PostMapping("/signin")
    public ResponseEntity<String> authenticateUser(@RequestParam(value = "username") String username,@RequestParam(value = "userPassword") String userPassword) {
        String response = authenticate.authenticateUser(username,userPassword);
        log.info("ws : Generate token {}", username);
        return ResponseEntity.ok(response);
    }
}
