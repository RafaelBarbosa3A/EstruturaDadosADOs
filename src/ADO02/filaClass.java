/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADO02;

import javax.swing.JOptionPane;

/**
 *
 * @author r.almeida.barbosa
 */
public class filaClass {
    public Object [] fila; 
    public int inicio;
    public int fim;
    
    public filaClass(){
        this.inicio = -1;
        this.fim = -1;
        this.fila = new Object [5];
    }
    
    public boolean isEmpty(){
        if ((this.inicio == -1)&&(this.fim == -1)){
            return true;
        }
        return false;
    }
    
    public int size(){
        if (this.isEmpty()){
            return 0;
        }
        return this.fila.length;
    }
    
    public Object inserirEnqueue(Object valor){
        if (this.fim <= this.fila.length -1){
            this.fila[++fim] = valor;
            if (inicio == -1){
                inicio += 1;
            }
        }return valor;
    }
    
    public Object removerDequeue(){
        if (!isEmpty()){
            Object x = this.fila[inicio];
            inicio += 1;
            return x;
        }
        return null;
    }
    
    public static void main(String[] args) {
        filaClass fila = new filaClass();
        
        fila.inserirEnqueue(1);
        fila.inserirEnqueue(2);
        fila.inserirEnqueue(3);
        fila.inserirEnqueue(4);
        fila.inserirEnqueue(5);
        for (int i = 0; i < fila.size(); i++) {
            System.out.println(fila.fila[i]);
        }
        
    }
}
