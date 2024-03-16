package com.invoicing.demo.service;

import java.util.List;

import com.invoicing.demo.Dtos.ClienteDto;
import com.invoicing.demo.model.Cliente;

public interface ClienteService {

    public Cliente findById(Long id);

    public List<Cliente> findAll();

    public Cliente createCliente (ClienteDto clienteDto);

    public Cliente editCliente (ClienteDto clienteDto, Long id);

    public String deleteCliente (Long id);
}
