/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADO01;

import javax.swing.JOptionPane;

/**
 *
 * @author r.almeida.barbosa
 */
public class Lista {

    public class listaSimples {

        // TODO code application logic here
        No prim;
        No ult;
        int qtdNo;

        public listaSimples() {
            this.prim = null;
            this.ult = null;
            this.qtdNo = 0;
        }

        public No getPrim() {
            return prim;
        }

        public void setPrim(No prim) {
            this.prim = prim;
        }

        public No getUlt() {
            return ult;
        }

        public void setUlt(No ult) {
            this.ult = ult;
        }

        public int getQtdNo() {
            return qtdNo;
        }

        public void setQtdNo(int qtdNo) {
            this.qtdNo = qtdNo;
        }

        public boolean isEmpty() {
            return (this.prim == null);
        }

        public void inserirPrimeiro(Carros c) {
            No novoNo = new No(c);
            if (this.isEmpty()) {
                this.ult = novoNo;
            }
            novoNo.setProx(this.prim);
            this.prim = novoNo;
            this.qtdNo++;
        }

        public void inserirUltimo(Carros c) {
            No novoNo = new No(c);
            if (this.isEmpty()) {
                this.prim = novoNo;
            } else {
                this.ult.setProx(novoNo);
            }
            this.ult = novoNo;
            this.qtdNo++;
        }

        public boolean removerNo(String modelo) {
            No atual = this.prim;
            No anterior = null;
            if (this.isEmpty()) {
                return false;
            } else {
                while (atual != null && (!atual.getC().getModelo().equals(modelo))) {
                    anterior = atual;
                    atual = atual.getProx();
                }
                if (atual == prim) {
                    if (this.prim == this.ult) {
                        this.ult = null;
                    }
                    this.prim = this.prim.getProx();
                } else {
                    if (atual == ult) {
                        this.ult = anterior;
                    }
                    anterior.setProx(atual.getProx());
                }
            }
            this.qtdNo--;
            return true;
        }

        public String pesquisarNo(String modelo) {
            No atual = this.prim;
            while (atual != null && (!atual.getC().getModelo().equals(modelo))) {
                atual = atual.getProx();
            }
            String msg = "modelo " + atual.getC().getModelo()
                    + "\n marca: " + atual.getC().getMarca()
                    + "\n ano " + atual.getC().getAno();
            return msg;
        }

        public String imprimirLista() {
            String msg = "";
            if (this.isEmpty()) {
                msg = "lista vazia";
            } else {
                No atual = this.prim;
                while (atual != null) {
                    msg += atual.getC().getModelo() + "\n";
                    atual = atual.getProx();
                }
            }
            return msg;
        }

        public void limparLista() {
            this.prim = null;
            this.ult = null;
            this.qtdNo = 0;

        }

    }

}
