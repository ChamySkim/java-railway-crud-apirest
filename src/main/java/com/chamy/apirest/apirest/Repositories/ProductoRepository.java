package com.chamy.apirest.apirest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chamy.apirest.apirest.Entities.Producto;

public interface ProductoRepository  extends JpaRepository<Producto, Long>{

}
