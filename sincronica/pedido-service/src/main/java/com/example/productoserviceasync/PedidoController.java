package com.example.pedidoserviceasync;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;


@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    private final ProductoClient productoClient;

    @Autowired
    public PedidoController(ProductoClient productoClient) {
        this.productoClient = productoClient;
    }

    @GetMapping("/crear")
    public ResponseEntity<?> crearPedido() {
        List<ProductoDTO> productos = productoClient.obtenerProductos();
        return ResponseEntity.ok("Pedido creado con productos: " + productos);
    }
}