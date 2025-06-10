package com.example.pedidoserviceasync;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.cloud.openfeign.FeignClient;

import java.util.List;
@FeignClient(name = "producto-service-async")
public interface ProductoClient {

    @GetMapping("/productos")
    List<ProductoDTO> obtenerProductos();
}