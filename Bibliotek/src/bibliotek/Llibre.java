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
public class Llibre {

    private String title;
    private String isbn;
    private String author;
    private Boolean cedit;

    public Llibre(String titol, String isbn, String autor) {
        this.title = titol;
        this.isbn = isbn;
        this.author = autor;
        this.cedit = false;
    }

    public void imprimir() {
        System.out.println(this.title);
        System.out.println(this.isbn);
        System.out.println(this.author);

    }

    public boolean mateixAutor(Llibre llibre) {
        return this.author.equals(llibre.author);
    }

    public String getIsbn() {
        return this.isbn;
    }

    public void setCedit() {
        this.cedit = true;

    }

    public void unsetCedit() {
        this.cedit = false;
    }

    public boolean getCedit() {
        return this.cedit;
    }

    public String getAutor() {
        return this.author;
    }
}
