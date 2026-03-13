/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estacionamiento;

/**
 *
 * @author julia
 */
public class Estacionamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EstacionamientoITAM sistema = new EstacionamientoITAM(20,10); //(a,b) donde a es el tamaño de los regoistrados y b es el tamaño de la pila
        
        Coche c1 = new Coche("Julián Carranza", 217141, "G98ERW");
        Coche c2 = new Coche("Yayha Halem", 223344, "H54HDP");
        Coche c3 = new Coche("Nicolás Castro", 100326, "A43HJK");
        Coche c4 = new Coche("Andrés Gomez", 121637, "A07CSD");
        Coche c5 = new Coche("Claudia Sheinbaum", 160921, "M87ALM");
        Coche c6 = new Coche("Hiram Ortiz", 123456, "W35RTR");
        Coche c7 = new Coche("Diego Ramos", 789012, "G34UVC");
        Coche c8 = new Coche("Elena Cruz", 890123, "H56XYD");
        Coche c9 = new Coche("Pedro Leon", 901234, "J78ABF");
        Coche c10 = new Coche("Laura Gil", 112233, "K90DEG");
        
        //Casito 1 - Retirar un coche en un vacio
        sistema.retirarCoche("G98ERW");
        
        //Casito 3 - Agregar un carro en un vacio
        sistema.registrarCoche(c1);  //Primero se registran los coches, para que tengan acceso
        sistema.registrarCoche(c2);
        sistema.registrarCoche(c3);
        sistema.registrarCoche(c4);
        sistema.registrarCoche(c5);
        sistema.registrarCoche(c6);  
        sistema.registrarCoche(c7);
        sistema.registrarCoche(c8);
        sistema.registrarCoche(c9);
        sistema.registrarCoche(c10);
        
        sistema.agregarEstacionado(c1); // Ya que tienen acceso, se agregan al estacionamiento
        sistema.agregarEstacionado(c2);
        sistema.agregarEstacionado(c3);
        sistema.agregarEstacionado(c4);
        sistema.agregarEstacionado(c5);
        sistema.agregarEstacionado(c6);
        sistema.agregarEstacionado(c7);
        sistema.agregarEstacionado(c8);
        sistema.agregarEstacionado(c9);
        sistema.agregarEstacionado(c10);
        
        //Casito 4 - agregar un carro nuevo en uno lleno
        sistema.agregar

        
        //Casito 2 - Retirar un coche en uno lleno
        sistema.retirarCoche("K90DEG");
       
        
        
        
        //Casito 5 - Reitrar un coche muy afuera
        //Casito 6 - Retirar un coche muy adentro
        //Casito 7 - Retirar un coche en medio
        //Casito 8 - Tratar de retirar un coche que no este en el estacionamiento
        //Casito 9 - Intentar meter un coche sin permiso
    }

}
