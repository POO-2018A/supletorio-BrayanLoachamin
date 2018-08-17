/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supletorio;

import java.io.Serializable;

/**
 *
 * @author FRANCISCO
 */
public class Computador implements Serializable {
    
    
    
    private String nombre;
    private int precio;
    private String marca;
    private String tipo;
    
    public Computador() {
    }
    /*public Computador(String nombre, int precio, String marca) {
    this.nombre = nombre;
    this.precio = precio;
    this.marca = marca;
    }*/

    public Computador(String tipo, int precio, String marca) {
        this.tipo = tipo;
        this.precio = precio;
        this.marca = marca;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
    @Override
    public String toString() {
        return "Computador{" + "nombre=" + nombre + ", precio=" + precio + ", marca=" + marca + '}';
    }
    
    
}
