package com.springBajo8.springBajo8.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Document(collection = "volantes")
public class Volantes {
    @Id
    private String id = UUID.randomUUID().toString().substring(0, 10);
    private List<Productos> listaProuctos;
    private LocalDate date;
    private String cedulaProveedor;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Productos> getListaProuctos() {
        return listaProuctos;
    }

    public void setListaProuctos(List<Productos> listaProuctos) {
        this.listaProuctos = listaProuctos;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getCedulaProveedor() {
        return cedulaProveedor;
    }

    public void setCedulaProveedor(String cedulaProveedor) {
        this.cedulaProveedor = cedulaProveedor;
    }
}
