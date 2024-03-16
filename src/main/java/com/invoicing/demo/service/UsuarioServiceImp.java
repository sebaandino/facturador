package com.invoicing.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.invoicing.demo.Dtos.UsuarioDto;
import com.invoicing.demo.model.Usuario;
import com.invoicing.demo.model.UsuarioInfo;
import com.invoicing.demo.repository.UsuarioInfoRepository;
import com.invoicing.demo.repository.UsuarioRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UsuarioServiceImp implements UsuarioService {

    private final UsuarioRepository repository;
    private final UsuarioInfoRepository infoRepository;


    @Override
    public Usuario createUsuario(UsuarioDto usuarioDto) {
        Usuario usuario = new Usuario();

        usuario.setUserName(usuarioDto.getUserName());
        usuario.setPassword(usuarioDto.getPassword());

        return repository.save(usuario);

    }

    @Override
    public String delete(Long id) {
        repository.deleteById(id);
        return "eliminado";
    }

    @Override
    public Usuario update(UsuarioDto usuarioDto, Long id) {

        Usuario usuarioDb = findById(id);

        usuarioDb.setUserName(usuarioDto.getUserName());
        usuarioDb.setPassword(usuarioDto.getPassword());

        return repository.save(usuarioDb);

    }

    @Override
    public Usuario findById(Long id) {
        Optional<Usuario> clienteOptional = repository.findById(id);
        return clienteOptional.orElse(null);
    }

    @Override
    public List<Usuario> findAll() {
        return repository.findAll();
    }

    @Override
    public UsuarioInfo setinfo(Long id, UsuarioInfo userInfo) {

        Usuario usuario = findById(id);
        userInfo.setUsuario(usuario);
        return infoRepository.save(userInfo);
    }

    

}
