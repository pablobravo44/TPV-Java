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
public class Empleado {
    private int codigo;
    private String nombre;
    private String apellido;
    private String pass;
    private String puesto;
    private byte[] img;

    public Empleado(int codigo, String nombre, String apellido, String pass, String puesto , byte[] img) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.pass = pass;
        this.puesto=puesto;
        this.img = img;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String cargo) {
        this.puesto = cargo;
    }
    
    public byte[] getImg() {
        return img;
    }

    public void setImg(byte[] img) {
        this.img = img;
    }

    
    @Override
    public String toString() {
        return ""+ nombre + " " + apellido;
    }
    
    
}
