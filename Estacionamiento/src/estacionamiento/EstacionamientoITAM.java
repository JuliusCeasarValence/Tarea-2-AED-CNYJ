/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estacionamiento;

/**
 *
 * @author julia
 */
public class EstacionamientoITAM{
    private Coche[] baseDatos;
    private int totalRegistrados;
    private ArrayStackLimitada<Coche> estacionamiento;
    
    public EstacionamientoITAM(int capacidadBD,int capacidadEstacionamiento) {
        baseDatos = new Coche[capacidadBD];
        totalRegistrados = 0;
        estacionamiento = new ArrayStackLimitada<>(capacidadEstacionamiento);
    }
    
    public boolean registrarCoche(Coche coche) {
        if (totalRegistrados >= baseDatos.length) {
            return false;
        }
        baseDatos[totalRegistrados] = coche;
        totalRegistrados ++;
        return true;
    }
    
    public boolean estaRegistrado(String placas) {
        for (int i=0; i < totalRegistrados; i++) {
            if (baseDatos[i].getPlacas().equals(placas)) {
                return true;
            }
        }
        
        return false;
    }
        
    public boolean agregarEstacionado(Coche coche){
        if (!estaRegistrado(coche.getPlacas())) {
        System.out.println("No se pudo agregar: el coche no está registrado.");
        return false;
        }
        if (estacionamiento.isFull()) {
            System.out.println("No se pudo agregar: el estacionamiento está lleno.");
            return false;
        }
        estacionamiento.push(coche);
        System.out.println("Coche agregado correctamente.");
        return true;
    }
    
    public Coche retirarCoche(String placas) {
        if (estacionamiento.isEmpty()) {
            System.out.println("El estacionamiento está vacío.");
            return null;  
        }
        
        ArrayStack<Coche> auxiliar = new ArrayStack<>();
        Coche encontrado = null;
        
        try {
            while(!estacionamiento.isEmpty()) {
                Coche actual = estacionamiento.pop();
                
                if (actual.getPlacas().equals(placas)) {
                    encontrado = actual;
                    break;
                }
                else {
                    System.out.println("Se retira provisionalmente: " + actual.getPlacas());
                    auxiliar.push(actual);                    
                }
            }
            
            if (encontrado == null) {
                System.out.println("El coche no estaba en el estacionamiento");
            }
            else {
                System.out.println("Se retiró el coche: " + encontrado.getPlacas());
            }
            
            while (!auxiliar.isEmpty()) {
                Coche regreso = auxiliar.pop();
                estacionamiento.push(regreso);
                System.out.println("Se regresa al estacionamiento: " + regreso.getPlacas());
            }
        }
        catch (EmptyCollectionException e) {
            System.out.println("Error en la pila");
        }
        return encontrado;
    }
}