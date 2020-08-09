/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u3tarea1;

/**
 *
 * @author erika
 */
public class Nodo {
    public String dato;
    public Nodo siguiente; //Puntero enlace
    
    //Constructor para insertar al Final
    public Nodo (String d){
        this.dato = d;
    }
    
    //Constructor para insertar al Inicio
    public Nodo (String d, Nodo n){
        dato = d;
        siguiente = n;
        
    }
    
}



