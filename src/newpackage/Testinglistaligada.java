/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author luisj
 */
public class Testinglistaligada {
    
public static void main(String[]args) throws IOException{
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        int dato;
        char respuesta;
        
        Listaligada lista = new Listaligada();
        
        while (true){//Ciclo infinito      
        System.out.println("Escribe un dato entero");
        entrada = bufer.readLine();
        dato = Integer.parseInt(entrada);
        lista.add(dato);
            System.out.println("Se ha agregado el dato a la lista");
            System.out.println("?Quieres agregar mas datos? (s/n): ");
            entrada = bufer.readLine();
            respuesta = entrada.charAt(0);
            if( respuesta == 'n' || respuesta == 'N')
                break;
        }
        
        System.out.println("--------------------------------------");
        System.out.println("COntenido de la lista ligada");
        lista.printList();
        
        /*
        System.out.println("--------------------------------------");
        System.out.println("Insercion de un nuevo nodo");
        System.out.println("Escribe el elemento a insertar");
        entrada = bufer.readLine();
        dato = Integer.parseInt(entrada);
        System.out.println("Escriba la posicion en donde quieres insertar");
        entrada= bufer.readLine();
        int p = Integer.parseInt(entrada);
        lista.add(dato,p);
        
        System.out.println("--------------");
        System.out.println("Cotenido de la lista ligada :  ");
        lista.printList();
        */
        Listaligada<String> lista2 = new Listaligada<>();
        System.out.println("-------Creando nueva lista de Strings --------");
        for(;;){
            System.out.println("Escriba dato String para agregar a la lista : ");
            entrada = bufer.readLine();
            lista2.add(entrada);
            System.out.println("?Quieres insertar mas datos?: ");
            entrada = bufer.readLine();
            respuesta = entrada.charAt(0);
            if( respuesta == 'n' || respuesta == 'N')
                break;
        }
        System.out.println("Contenido de la lista de Strings: ");
        lista2.printList();
}
}