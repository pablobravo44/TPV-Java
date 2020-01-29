/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import java.sql.Blob;
import java.sql.Timestamp;

/**
 *
 * @author Pablo
 */
public class Factura {
    
    private int cod_factura;
    private Timestamp fecha;
    private int cod_empleado;

    public Factura(int cod_factura, Timestamp fecha, int cod_empleado) {
        this.cod_factura = cod_factura;
        this.fecha = fecha;
        this.cod_empleado = cod_empleado;
    }

    public int getCod_factura() {
        return cod_factura;
    }

    public void setCod_factura(int cod_factura) {
        this.cod_factura = cod_factura;
    }

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

    public int getCod_empleado() {
        return cod_empleado;
    }

    public void setCod_empleado(int cod_empleado) {
        this.cod_empleado = cod_empleado;
    }

    @Override
    public String toString() {
        return "Factura "+cod_factura;
    }
    
    
}
