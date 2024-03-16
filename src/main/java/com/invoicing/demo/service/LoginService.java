package com.invoicing.demo.service;

import org.springframework.stereotype.Service;

import com.invoicing.demo.Dtos.Credenciales;
import com.invoicing.demo.model.Usuario;
import com.invoicing.demo.repository.UsuarioRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class LoginService {

    private final UsuarioRepository repository;

    public String login(Credenciales credenciales) {
        try {
            Usuario usuario = repository.findUsuarioByUserName(credenciales.getUserName());

            if (usuario != null && usuario.getPassword().equals(credenciales.getPassword())) {
                return "Has iniciado sesión!";
            } else {
                return "Usuario o contraseña incorrectos";
            }
        } catch (Exception e) {
            return "Error al iniciar sesión: " + e.getMessage();
        }
    }
}
