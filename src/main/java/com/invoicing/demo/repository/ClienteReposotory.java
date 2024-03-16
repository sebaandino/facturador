package com.invoicing.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.invoicing.demo.model.Cliente;

@Repository
public interface ClienteReposotory extends JpaRepository<Cliente, Long> {

}
