/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u3tarea1;

import java.util.Scanner;

/**
 *
 * @author erika
 */
public class U3tarea1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        Lista nombres = new Lista();
        int opcion = 0;
        String el;
        
        
        
        do{
            
            System.out.println("\nElige una opción:");
            System.out.println("1. Agregar un nombre al Inicio de la Lista \n2. Mostrar los Datos de la Lista\n"
                    + "3. Salir\n");

            
            opcion = input.nextInt();
            
            try{
                switch(opcion){
                    case 1:
                        try{
                            System.out.println("1. Agregar un nombre al Inicio de la Lista");
                            System.out.print("Ingresa el nombre a insertar al inicio: ");
                            el = input.next();
                            
                            //Agregando al Nodo
                            nombres.agregarAlInicio(el);
                            
                        }catch(NumberFormatException n){
                            System.out.println("Error " + n.getMessage());
                        
                        }
                        
                    break;
                        
                        
                    case 2:
                        System.out.println("2. Mostrar los Datos de la Lista");
                        nombres.mostrarLista();
                        System.out.println("\n");
                        
                    break;
                        
                    case 3:
                        
                        System.out.println("3. Fin de sesión");
                        
                    break;
                        
                    default:
                        System.out.println("Opción incorrecta");
                }
            }catch (Exception e){
                System.out.println("Error " + e.getMessage());
            }
            
        }while (opcion != 3);
        
    }
    
}

