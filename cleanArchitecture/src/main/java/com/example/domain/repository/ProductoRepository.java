package com.empresa.microservicio.domain.repository;

import com.empresa.microservicio.domain.model.Producto;
import java.util.List;

public interface ProductoRepository {
    List<Producto> listarProductos();
    Optional<Producto> findById(Long id);
}