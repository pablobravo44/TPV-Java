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
public class Articulo {
    
    private int codigo;
    private String nombre;
    private Double precio;
    private int stock;
    private int procentaje_iva;
    private int cod_categoria;
    private byte[] img;

    public Articulo(int codigo, String nombre, double precio , int stock, int procentaje_iva, int cod_categoria , byte[] img) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.procentaje_iva = procentaje_iva;
        this.cod_categoria = cod_categoria;
        this.img = img;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getStock() {
        return stock;
    }

    public int getProcentaje_iva() {
        return procentaje_iva;
    }

    public int getCod_categoria() {
        return cod_categoria;
    }

    public void setCod_categoria(int cod_categoria) {
        this.cod_categoria = cod_categoria;
    }

    public Double getPrecio() {
        return precio;
    }
    
    public byte[] getImg() {
        return img;
    }

    @Override
    public String toString() {
        return "" + nombre;
    }
    
    
}
