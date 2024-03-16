package com.invoicing.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.invoicing.demo.model.UsuarioInfo;

@Repository
public interface UsuarioInfoRepository extends JpaRepository<UsuarioInfo, Long> {

}
