/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotteria;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author monica ciuchetti
 */
public class Lotteria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Scelta del numero dei numeri da estrarre
        int n;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n=br.readline();
        Estrazione e = new Estrazione(n);
        
        e.stampaMatrice();
        
        // Istanza ed avvio del thread Estrazione
        //Estrazione e = new Estrazione();
        e.start();
       
        // Istanza di alcuni thread Giocatore
        Giocatore g1 = new Giocatore(1, e);
        Giocatore g2 = new Giocatore(2, e);
        Giocatore g3 = new Giocatore(3, e);
        // Avvio dei thread Giocatori
        g1.start();
        g2.start();
        g3.start();
        
        try{
            g1.join();
            g2.join();
            g3.join();
        } catch(InterruptedException ex) {
            System.err.println("errore join");
        }
       
        // Comunicazione fine gioco
        System.out.println("Fine lotteria");
    }
}
   