package com.example.pedidoserviceasync;
public record Pedido(String id, ProductoDTO producto, int cantidad) {}