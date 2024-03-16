package com.invoicing.demo.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.invoicing.demo.Dtos.ClienteDto;
import com.invoicing.demo.service.ClienteServiceImp;

import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class ClienteController {

    private final ClienteServiceImp serviceImp;

    @GetMapping("/clientes")
    public ResponseEntity<?> getAll() {
        try {
            return new ResponseEntity<>(serviceImp.findAll(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/clientes/{id}")
    public ResponseEntity<?> findByID(@PathVariable Long id) {
        try {
            return new ResponseEntity<>(serviceImp.findById(id), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/clientes")
    public ResponseEntity<?> create(@RequestBody ClienteDto clienteDto) {
        try {
            return new ResponseEntity<>(serviceImp.createCliente(clienteDto), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/clientes/{id}")
    public ResponseEntity<?> update(@RequestBody ClienteDto clienteDto, @PathVariable Long id) {
        try {
            return new ResponseEntity<>(serviceImp.editCliente(clienteDto, id), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/clientes/{id}")
    public ResponseEntity<?> deleteByID(@PathVariable Long id) {
        try {
            return new ResponseEntity<>(serviceImp.deleteCliente(id), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
