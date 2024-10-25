/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotteria;

import java.util.Random;

/**
 *
 * @author monica ciuchetti
 */
public class Estrazione extends Thread {
    // attributi
    private int matriceNumeri[][];
    private int numeroVincitori;
    private int numero;
    private int vincitori[];

    //costruttore
    public Estrazione() {
        // popolamento matrice numeri estratti
        matriceNumeri = new int[5][5];
        Random random = new Random();
        for (int i = 0; i<5; i++){
            for (int j = 0; j < 5; j++){
                matriceNumeri[i][j] = random.nextInt(100);
            }
        }
    
        // inizializzazione array vincitori
        //numero = 21;
    }
    public Estrazione(int n) {
        // popolamento matrice numeri estratti
        matriceNumeri = new int[n][n];
        Random random = new Random();
        for (int i = 0; i<n; i++){
            for (int j = 0; j < n; j++){
                matriceNumeri[i][j] = random.nextInt(100);
            }
        }
    }
    /**
    * 
    * Metodo per visualizzare la matrice dei numeri estratti
    */
    public void stampaMatrice() {
       // stampa matrice dei numeri estratti
        System.out.println("Scheda Vincente: ");
        for (int i = 0; i<5; i++){
            for (int j = 0; j < 5; j++){
                System.out.println(matriceNumeri[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
    /**
    * 
    * Metodo per visualizzare i vincitori dell'estrazione
    */
    public void stampaVincitori() {
        // stampa array dei vincitori
        
    }

    /**
    * 
    * Metodo per verificare il numero scelto dal giocatore e determinare i vincitori
    */
    public void verifica(int numero, int idGiocatore) {
        for(int i = 0; i < matriceNumeri.length; i++){
            for(int j = 0; j < matriceNumeri[i].length; j++){
                if(numero == matriceNumeri[i][j]){
                    System.out.println("Giocatore " +  idGiocatore +  "Hai vinto!");
                }
            }
        }
    }
        /*
        if (numero==this.numero) {
            System.out.println("giocatore " + idGiocatore + "hai scelto il numero " + numero + "e hai vinto");
        }
        else{
            System.out.println("Hai perso! :(");
        }       
    }
    */

    
    
    //Metodo per eseguire il thread
    @Override
    public void run() {
        // stampa iniziale
        System.out.println("INIZIO ESTRAZIONE");
        stampaMatrice();
        // estrazione dei numeri
        // stampa matrice
        // stampa finale
    }
    
}


