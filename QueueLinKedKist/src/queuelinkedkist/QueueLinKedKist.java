/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuelinkedkist;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Alan
 */
public class QueueLinKedKist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Queue<String> queue= new LinkedList();
        queue.add("Adrian");
        queue.add("Jesus");
        queue.add("Daniel");
        queue.offer("Alan");
        //Elimina
        queue.remove();
        //Muestra el primero
        System.out.println("Se elimino"+queue.remove());
        queue.element();
        System.out.println("Frente de la cola"+queue.element());
        //Elinar un elemento de la estructura 
        queue.peek();
        System.out.println("Se elimino el elemento"+queue.peek());
        
        System.out.println(queue.toString());
    }
    
}
