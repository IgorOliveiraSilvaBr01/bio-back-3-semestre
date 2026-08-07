package com.example.authsystem.controllers;

import com.example.authsystem.DTOs.LoginDTO;
import com.example.authsystem.services.LoginService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("login")
public class LoginController {

    private final LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @PostMapping
    public ResponseEntity<?> logar(@RequestBody LoginDTO dto){
        return ResponseEntity.ok(loginService.login(dto));
    }
}
