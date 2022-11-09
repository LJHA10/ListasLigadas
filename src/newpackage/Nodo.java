/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

/**
 *
 * @author luisj
 */
public class Nodo {
    private int dato;// dato almacenado
    private Nodo siguiente; //apuntador al siguiente nodo
    
    public Nodo(int d){
        this.dato = d;
        this.siguiente = null;
    }

    public int getDato() {
        return dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public void setSiguiente(Nodo otroNodo) {
        this.siguiente = otroNodo;
    }
    
}
