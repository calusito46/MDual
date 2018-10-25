/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotek;

import java.util.Scanner;

/**
 *
 * @author Calusito
 */
public class Bibliotek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        Biblioteca biblio = new Biblioteca(20);
        int menu;
        String titol, isbn, autor, isbn2;
        do {
            System.out.println("1 -- Imprimir tots els llibres, nombre actual de llibres i nombre màxim");
            System.out.println("2 -- Indica un ISBN i s'imprimira la informacio del Llibre");
            System.out.println("3 -- Afegeix un nou llibre a la biblioteca");
            System.out.println("4 -- Compara dos Llibres i retorna si tenen el mateix Autor");
            System.out.println("5 -- Mostra tots els llibres cedits");
            System.out.println("6 -- Marcar un llibre com a cedit per ISBN");
            System.out.println("7 -- Marcar un llibre com a no cedit per ISBN");
            System.out.println("8 -- Surt");
            menu = Integer.parseInt(lector.nextLine());
            switch (menu) {
                case 1:
                    biblio.imprimirLlibres();
                    System.out.println(biblio.getNActualLlibres());
                    System.out.println(biblio.getNMaxLlibres());
                    break;

                case 2:
                    System.out.print("Entre el ISBN: ");
                    isbn = lector.nextLine();
                    biblio.obtenirLlibre(isbn).imprimir();
                    break;

                case 3:
                    System.out.println("Entra les dades del llibre");
                    System.out.print("Titol: ");
                    titol = lector.nextLine();
                    System.out.print("ISBN: ");
                    isbn = lector.nextLine();
                    System.out.print("Autor: ");
                    autor = lector.nextLine();
                    try {
                        biblio.afegirLlibre(titol, isbn, autor);
                    } catch (Exception e) {
                        System.out.println(e.getLocalizedMessage());
                    }
                    break;

                case 4:
                    System.out.println("Entra els dos ISBN");
                    System.out.print("ISBN1: ");
                    isbn = lector.nextLine();
                    System.out.println();
                    System.out.println("ISBN: ");
                    isbn2 = lector.nextLine();
                    System.out.println();
                    if (biblio.obtenirLlibre(isbn).mateixAutor(biblio.obtenirLlibre(isbn2))) {
                        System.out.println("Tenen el mateix autor " + biblio.obtenirLlibre(isbn).getAutor());
                    } else if (biblio.obtenirLlibre(isbn) == null) {
                        System.out.println("El primer isbn no coinsideix amb cap llibre");
                    } else if (biblio.obtenirLlibre(isbn2) == null) {
                        System.out.println("El segon isbn no coinsideix amb cap llibre");
                    }
                    break;

                case 5:
                    
                    break;

                case 6:
                    System.out.println("Entra el ISBN");
                    System.out.print("ISBN: ");
                    isbn = lector.nextLine();
                    if (biblio.cedirLlibre(isbn)) {
                        System.out.println("Llibre cedit correctement");
                    } else {
                        System.out.println("Llibre ja cedit, no es pot tornar a cedir");
                    }
                    break;

                case 7:
                    System.out.println("Entra el ISBN");
                    System.out.print("ISBN: ");
                    isbn = lector.nextLine();
                    if (biblio.obtenirLlibre(isbn).getCedit()) {
                        try {
                            biblio.retornarLlibre(isbn);
                        } catch (Exception e) {
                            System.out.println(e.getLocalizedMessage());
                        }
                        System.out.println("Llibre retornat correctement");
                    } else {
                        System.out.println("El llibre no estava cedit");
                    }
                    break;

                case 8: ;
                    break;

                default:
                    System.out.println("Valor Incorrecte");
                    break;
            }
        } while (menu != 8);
    }
}
