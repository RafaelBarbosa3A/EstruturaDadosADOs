/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADO02;

/**
 *
 * @author r.almeida.barbosa
 */
public class Pilha {

    public Object[] pilha;
    public int posicaoPilha;

    public Pilha() {
        this.posicaoPilha = -1;
        this.pilha = new Object[4];
    }

    public boolean isEmpty() {
        if (this.posicaoPilha == -1) {
            return true;
        }
        return false;
    }

    public void push(Object valor) {
        if (this.posicaoPilha < this.pilha.length - 1) {
            this.pilha[++posicaoPilha] = valor;
        }
    }

    public Object pop() {
        if (isEmpty()) {
            return null;
        }
        return this.pilha[this.posicaoPilha--];
    }

    public static void main(String[] args) {
        Pilha p = new Pilha();
        p.push("portuguesa");
        p.push("bauru");
        p.push("calabresa");
        do {
            System.out.println(p.pop());

        } while (!p.isEmpty());

    }
}
