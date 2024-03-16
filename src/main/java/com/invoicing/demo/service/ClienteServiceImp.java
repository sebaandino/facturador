package com.invoicing.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.invoicing.demo.Dtos.ClienteDto;
import com.invoicing.demo.model.Cliente;
import com.invoicing.demo.repository.ClienteReposotory;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ClienteServiceImp implements ClienteService {

    private final ClienteReposotory clienteReposotory;

    @Override
    public Cliente findById(Long id) {
        Optional<Cliente> clienteOptional = clienteReposotory.findById(id);
        return clienteOptional.orElse(null);
    }

    @Override
    public List<Cliente> findAll() {
        return clienteReposotory.findAll();
    }

    @Override
    public Cliente createCliente(ClienteDto clienteDto) {
        Cliente cliente = new Cliente();
        cliente.setNombre(clienteDto.getNombre());
        cliente.setApellido(clienteDto.getApellido());
        cliente.setDni(clienteDto.getDni());
        cliente.setLocalidad(clienteDto.getLocalidad());

        return clienteReposotory.save(cliente);

    }

    @Override
    public Cliente editCliente(ClienteDto clienteDto, Long id) {

        Cliente clientebd = findById(id);

        clientebd.setNombre(clienteDto.getNombre());
        clientebd.setApellido(clienteDto.getApellido());
        clientebd.setDni(clienteDto.getDni());
        clientebd.setLocalidad(clienteDto.getLocalidad());

        return clienteReposotory.save(clientebd);

    }

    @Override
    public String deleteCliente(Long id) {
        clienteReposotory.deleteById(id);
        return "eliminado";
    }

}
