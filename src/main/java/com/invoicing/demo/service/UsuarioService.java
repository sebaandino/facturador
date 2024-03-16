package com.invoicing.demo.service;

import java.util.List;

import com.invoicing.demo.Dtos.UsuarioDto;
import com.invoicing.demo.model.Usuario;
import com.invoicing.demo.model.UsuarioInfo;

public interface UsuarioService {

    public Usuario createUsuario(UsuarioDto usuarioDto);

    public String delete(Long id);

    public Usuario update(UsuarioDto usuarioDto, Long id);

    public Usuario findById(Long id);

    public List<Usuario> findAll();

    public UsuarioInfo setinfo (Long id,UsuarioInfo userInfo);
}
