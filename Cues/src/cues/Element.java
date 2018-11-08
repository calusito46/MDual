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
public class Element {
    private int valor;
    private Element seguent;
    public Element(int valor){
        this.valor = valor;
        this.seguent = null;
    }
    
    public int getValor(){
        return this.valor;
    }
    
    public Element seguent(){
        return this.seguent;
    }
    public void setSeguent(Element elem){
        this.seguent = elem;
    }
}
