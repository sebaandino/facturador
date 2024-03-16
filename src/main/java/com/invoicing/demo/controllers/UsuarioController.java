package com.invoicing.demo.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.invoicing.demo.Dtos.UsuarioDto;
import com.invoicing.demo.model.UsuarioInfo;
import com.invoicing.demo.service.UsuarioServiceImp;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api/usuarios")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioServiceImp service;

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable Long id) {
        try {
            return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Usuario no encontrado", HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping()
    public ResponseEntity<?> findAll() {
        try {
            return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("error", HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping()
    public ResponseEntity<?> create(@RequestBody UsuarioDto UsuarioDto) {
        try {
            return new ResponseEntity<>(service.createUsuario(UsuarioDto), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("No se pudo crear el usuario", HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody UsuarioDto usuarioDto) {
        try {
            return new ResponseEntity<>(service.update(usuarioDto, id), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("error al querer movificar el usuario", HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        try {
            return new ResponseEntity<>(service.delete(id), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Error al elinimar Usuario", HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/info/{id}")
    public ResponseEntity<?> setInfo(@RequestBody UsuarioInfo userInfo, @PathVariable Long id) {
        try {
            return new ResponseEntity<>(service.setinfo(id, userInfo), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("error al ingresat la informacion", HttpStatus.BAD_REQUEST);
        }
    }

}
