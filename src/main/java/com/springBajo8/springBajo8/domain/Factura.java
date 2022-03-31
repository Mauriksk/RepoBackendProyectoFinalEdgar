package com.springBajo8.springBajo8.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Document(collection = "facturas")
public class Factura {

    @Id
    private String id = UUID.randomUUID().toString().substring(0, 10);
    private LocalDate fecha;
    private int consecutivoFactura;
    private String nombreCliente;
    private List<Productos> listaProductos;
    private String funcionarioQueAtendio;
    private int totalAPagar;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getConsecutivoFactura() {
        return consecutivoFactura;
    }

    public void setConsecutivoFactura(int consecutivoFactura) {
        this.consecutivoFactura = consecutivoFactura;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getFuncionarioQueAtendio() {
        return funcionarioQueAtendio;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setFuncionarioQueAtendio(String funcionarioQueAtendio) {
        this.funcionarioQueAtendio = funcionarioQueAtendio;
    }

    public List<Productos> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(List<Productos> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public int getTotalAPagar() {
        return totalAPagar;
    }

    public void setTotalAPagar(int totalAPagar) {
        this.totalAPagar = totalAPagar;
    }
}
