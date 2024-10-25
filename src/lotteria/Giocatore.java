/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotteria;

import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author monica ciuchetti
 */
public class Giocatore extends Thread{
    // attributi
    private int idGiocatore;
    private String nomeGiocatore;
    private Estrazione estrazione;
    private int numero;
    

    /**
    * 
    * Metodo costruttore
    * @param idGiocatore codice del giocatore
    * @param estrazione riferimento dell'oggetto Estrazione
    */
    public Giocatore(int idGiocatore, Estrazione estrazione) {
       // inizializzazione attributi
       this.idGiocatore = idGiocatore;
       this.estrazione = estrazione;
    }

    public int sceltaNumero(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Inserisci un numero ");
        int numero = Integer.parseInt(myObj.nextLine());
        System.out.println(numero);
        return numero;
    }
    
    /**
    * 
    * Metodo per eseguire il thread
    */
    @Override
    public void run() {
       //presentazione
       System.out.println("Giocatore id: " + this.idGiocatore + " con estrazione " + this.estrazione + "INIZIO");
       // scelta del numero da giocare
       //int numeroScelto = 21;
       //conto alla rovescia
       for (int i = 3; i>0; i--){
           System.out.println(i);
           try {
               this.sleep(1000);
           } catch(InterruptedException ex) {
               Logger.getLogger(Giocatore.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
       // verifica del risutlato
       //estrazione.verifica (numeroScelto,idGiocatore);
       // stampa fine verifica
       System.out.println("Giocatore id: " + idGiocatore + " ho verificato il mio numero");
    }
}
