package com.springBajo8.springBajo8.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Document(collection = "inventario")
public class Productos {

    @Id
    private String id = UUID.randomUUID().toString().substring(0, 10);
    private String nombreProducto;
    private int valorProducto;
    private int cantidadDeProducto;

    public int getCantidadDeProducto() {
        return cantidadDeProducto;
    }

    public void setCantidadDeProducto(int cantidadDeProducto) {
        this.cantidadDeProducto = cantidadDeProducto;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getValorProducto() {
        return valorProducto;
    }

    public void setValorProducto(int valorProducto) {
        this.valorProducto = valorProducto;
    }
}
