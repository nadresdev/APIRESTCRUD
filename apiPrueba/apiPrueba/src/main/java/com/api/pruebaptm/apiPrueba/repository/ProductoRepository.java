package com.api.pruebaptm.apiPrueba.repository;

import com.api.pruebaptm.apiPrueba.model.producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<producto,Integer>{

}
