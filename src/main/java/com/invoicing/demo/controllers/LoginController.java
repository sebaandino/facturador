package com.invoicing.demo.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.invoicing.demo.Dtos.Credenciales;
import com.invoicing.demo.service.LoginService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/login")
@RequiredArgsConstructor
public class LoginController {

    private final LoginService service;

    @PostMapping()
    public ResponseEntity<?> login(@RequestBody Credenciales credenciales) {
        return new ResponseEntity<>(service.login(credenciales), HttpStatus.OK);
    }

}
