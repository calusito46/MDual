/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cues;

/**
 *
 * @author Calusito
 */
public class Cua {

    private int numElements;
    private Element primer;

    public Cua() {
        this.numElements = 0;
        this.primer = null;
    }

    public int numElements() {
        return this.numElements;
    }

    public void encuar(int valor) {
        this.numElements++;
        Element elem = new Element(valor);

        if (this.primer == null) {
            this.primer = elem;
        } else {
            Element e = this.primer;
            while (e.seguent() != null) {
                e = e.seguent();
            }
            e.setSeguent(elem);
        }
    }

    public int desencuar() {
        int val = this.primer.getValor();
        this.primer = this.primer.seguent();
        this.numElements--;
        return val;
    }

    public Element obtenirCap() {
        return this.primer;
    }

    public void buidar() {
        this.primer = null;
        this.numElements = 0;
    }
    
    public int[] imprimir(){
        int[] ary = new int[this.numElements];
        Element e = this.primer;
        for (int i = 0; i < ary.length; i++) {
            ary[i] = e.getValor();
            e = e.seguent();
        }
        return ary;
    }
}
