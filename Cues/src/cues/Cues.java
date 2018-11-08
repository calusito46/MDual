/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cues;

import java.util.Arrays;

/**
 *
 * @author Calusito
 */
public class Cues {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cua c = new Cua();
        c.encuar(20);
        c.encuar(12);
        c.encuar(15);
        c.encuar(8);
        c.encuar(102);
        c.encuar(46);
        System.out.println(Arrays.toString(c.imprimir()));
        System.out.println(c.numElements());
        System.out.println(c.obtenirCap());
        c.desencuar();
        System.out.println(Arrays.toString(c.imprimir()));
        System.out.println(c.numElements());
        System.out.println(c.obtenirCap());
        c.buidar();
        System.out.println(Arrays.toString(c.imprimir()));
        System.out.println(c.numElements());
        System.out.println(c.obtenirCap());
        System.out.println(Arrays.toString(c.imprimir()));
    }
    
}
