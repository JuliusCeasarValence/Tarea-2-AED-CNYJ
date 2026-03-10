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
        EstacionamientoITAM sistema = new EstacionamientoITAM(20,5);
        
        Coche c1 = new Coche("Julián Carranza", 217141, "GPH091F");
        Coche c2 = new Coche("Yayha Halem", 223344, "HDP067D");
        Coche c3 = new Coche("Nicolás Castro", 100326, "ALM420G");
        Coche c4 = new Coche("Andrés Gomez", 121637, "ASD222F");
        Coche c5 = new Coche("Claudia Sheinbaum", 160921, "MEX001A");
        Coche c6 = new Coche("Hiram Ortiz", 123456, "WAS456D");
        Coche c7 = new Coche("Diego Ramos", 789012, "G34TUVC");
        Coche c8 = new Coche("Elena Cruz", 890123, "H56WXYD");
        Coche c9 = new Coche("Pedro Leon", 901234, "J78ZABF");
        Coche c10 = new Coche("Laura Gil", 112233, "K90CDEG");
        
        sistema.registrarCoche(c1);
        sistema.registrarCoche(c2);
        sistema.registrarCoche(c3);
        sistema.registrarCoche(c4);
        sistema.registrarCoche(c5);
        
        sistema.agregarEstacionado(c1);
        sistema.agregarEstacionado(c2);
        sistema.agregarEstacionado(c3);
        sistema.agregarEstacionado(c4);
    }

}
