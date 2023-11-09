package fr.dampierre;

import java.util.Random;
import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nbLancer = 5;
        int emplacement = 0;
        int resteCase = 20;
        int nbPartie = 1;

        do {
            emplacement = 0;
            resteCase = 20;
            System.out.println("Partie "+nbPartie);
            for(int i= 1; i <= nbLancer; i++){
                scanner.nextLine();
                Random generateur = new Random();
                int lancer = generateur.nextInt(6) + 1;
                emplacement = emplacement + lancer;
                resteCase = resteCase - lancer;
    
                System.out.println("Lancer" + i + " : vous avez fait " + lancer + " vous êtes sur la case "+ emplacement+ "(encore " + resteCase + " case)");
            }
            nbPartie++;
        } while (emplacement != 20);
        System.out.println("Vous avez gangner, vous avez jouer "+nbPartie+" partie");
    }
    
}
