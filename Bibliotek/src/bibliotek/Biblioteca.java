/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotek;

/**
 *
 * @author Calusito
 */
public class Biblioteca {

    private Llibre[] llibres;
    private int nLlibres;

    public Biblioteca(int maxLlibres) {
        this.llibres = new Llibre[maxLlibres];
    }
    
    public int getNMaxLlibres(){
        return llibres.length;        
    }
    public int getNActualLlibres() {
        int cont = 0;
        for (Llibre llibre : llibres) {
            if (llibre != null) {
                cont++;
            }
        }
        return cont;
    }
    public void afegirLlibre() {
        
    }
}
