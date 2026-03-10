/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estacionamiento;

/**
 *
 * @author julia
 */
public class ArrayStackLimitada<T> extends ArrayStack<T> {
    private int capacidadmaxima;
    
    public ArrayStackLimitada(int capacidadmaxima) {
        super();
        this.capacidadmaxima = capacidadmaxima;
    }
    
    public boolean isFull() {
        return top == capacidadmaxima;
    }
    
    @Override
    public void push(T element) {
        if (isFull()) {
            System.out.println("La pila está llena.");
            return;
        }
        super.push(element);
    }
}
