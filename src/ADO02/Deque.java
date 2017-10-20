/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADO02;

import java.util.ArrayDeque;
import java.util.LinkedList;
import sun.misc.Queue;

/**
 *
 * @author r.almeida.barbosa
 */
public class Deque extends Queue {

    public static void main(String[] args) {
        LinkedList dequeA = new LinkedList();
        ArrayDeque dequeB = new ArrayDeque();
        Deque dequeC = new Deque();
        
        //dequeA.add

        //dequeA.addFirst(10);
        //dequeA.addFirst(20);
        dequeA.addFirst(30);
        dequeA.addLast(5);
               
        System.out.println("deque A: " + dequeA);
        System.out.println("deque B: " + dequeB);
        System.out.println("deque C: " + dequeC);
    }

}
