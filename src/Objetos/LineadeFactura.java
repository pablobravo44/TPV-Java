package Objetos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pablo
 */
public class LineadeFactura {
    
    private int codigo;
    private int cod_factura;
    private Articulo articulo;
    private int cantidad;
    private int descuento;
    private Double total;
    private Double totalIVA;

    public LineadeFactura(int codigo, int cod_factura , Articulo articulo , int cantidad, int descuento, Double total , Double totalIVA) {
        this.codigo = codigo;
        this.cod_factura = cod_factura;
        this.articulo=articulo;
        this.cantidad = cantidad;
        this.descuento=descuento;
        this.total=total;
        this.totalIVA=totalIVA;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCod_factura() {
        return cod_factura;
    }

    public void setCod_factura(int cod_factura) {
        this.cod_factura = cod_factura;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double getTotalIVA() {
        return totalIVA;
    }

    public void setTotalIVA(Double totalIVA) {
        this.totalIVA = totalIVA;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    @Override
    public String toString() {
        return "";
    }
}
