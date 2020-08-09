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
public class Lista {
    
    //Punteros para saber donde están el inicio y el fin 
    protected Nodo inicio;
    protected Nodo fin;
    
    public Lista(){
        inicio = null;
        fin = null;
    }
    
    //Método para agregar un nodo al inicio de la lista
    public void agregarAlInicio(String elemento){
        //Creando al nodo
        inicio = new Nodo(elemento, inicio);
        if (fin == null){
            fin = inicio;
        }
    }
    
    //Método para mostrar los datos
    public void mostrarLista(){
        Nodo recorrer = inicio;
        while (recorrer != null){
            System.out.print("["+recorrer.dato+"] ---> ");
            recorrer = recorrer.siguiente;
        }
    }
}
