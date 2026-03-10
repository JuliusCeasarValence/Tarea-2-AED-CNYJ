/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estacionamiento;

/**
 *
 * @author julia
 */
public class Coche {
    private String nombre;
    private int clave;
    private String placas;
    
    public Coche(String nombre, int clave, String placas) {
        this.nombre = nombre;
        this.clave = clave;
        this.placas = placas;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public int getClave() {
        return clave;
    }
    
    public String getPlacas() {
        return placas;
    }
    
    @Override
    public String toString() {
        return "Coche = [nombre: " + nombre + ", clave: " + clave + ", placas: " + placas + "]";
    }
}
