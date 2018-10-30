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

    public int getNMaxLlibres() {
        return llibres.length;
    }

    public int getNActualLlibres() {
        return nLlibres;
    }

    public void afegirLlibre(String titol, String isbn, String autor) {
        if (nLlibres >= llibres.length || obtenirLlibre(isbn) != null) {
            throw new java.lang.RuntimeException("Nombre de llibres maxim assolit o el llibre ja existeix");
        } else {
            llibres[nLlibres] = new Llibre(titol, isbn, autor);
            nLlibres++;
        }
    }

    public void imprimirLlibres() {
        for (int i = 0; llibres[i] != null && i < llibres.length; i++) {
            llibres[i].imprimir();
        }
    }

    public Llibre obtenirLlibre(String isbn) {
        for (Llibre llibre : llibres) {
            if (llibre != null && llibre.getIsbn().equals(isbn)) {
                return llibre;
            }
        }
        return null;
    }

    public boolean cedirLlibre(String isbn) {
        Llibre llibre = obtenirLlibre(isbn);
            if (!llibre.getCedit()) {
                llibre.setCedit();
                return true;
            }
        
        return false;
    }

    public void retornarLlibre(String isbn) {
        for (Llibre llibre : llibres) {
            if (llibre.getIsbn().equals(isbn) && !llibre.getCedit()) {
                llibre.unsetCedit();
            } else {
                throw new java.lang.RuntimeException("El llibre no estava cedit");
            }
        }
    }
}
