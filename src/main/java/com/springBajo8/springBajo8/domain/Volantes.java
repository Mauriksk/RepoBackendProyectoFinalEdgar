package com.springBajo8.springBajo8.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.UUID;

@Document(collection = "volantes")
public class Volantes {
    @Id
    private String id = UUID.randomUUID().toString().substring(0, 10);
    private List<Object> listaProductos;
    private String date;
    private String cedulaProveedor;
    private String valorTotal;

    public String getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(String valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Object> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(List<Object> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCedulaProveedor() {
        return cedulaProveedor;
    }

    public void setCedulaProveedor(String cedulaProveedor) {
        this.cedulaProveedor = cedulaProveedor;
    }
}
