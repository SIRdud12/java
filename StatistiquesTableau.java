import java.util.Arrays;
import java.util.Scanner;

public class StatistiquesTableau{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nombres = new int[10];

       
        System.out.println("Entrez 10 nombres entiers :");
        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Nombre " + (i + 1) + " : ");
            nombres[i] = scanner.nextInt();
        }

      
        Arrays.sort(nombres);

        double moyenne = calculerMoyenne(nombres);
        double mediane = calculerMediane(nombres);
        double ecartType = calculerEcartType(nombres, moyenne);
        int min = nombres[0];
        int max = nombres[nombres.length - 1];

     
        System.out.println("\nTableau trié : " + Arrays.toString(nombres));
        System.out.println("Moyenne : " + moyenne);
        System.out.println("Médiane : " + mediane);
        System.out.println("Écart-type : " + ecartType);
        System.out.println("Valeur minimale : " + min);
        System.out.println("Valeur maximale : " + max);

        scanner.close();
    }

    
    public static double calculerMoyenne(int[] tableau) {
        double somme = 0;
        for (int valeur : tableau) {
            somme += valeur;
        }
        return somme / tableau.length;
    }

    
    public static double calculerMediane(int[] tableau) {
        int n = tableau.length;
        if (n % 2 == 0) {
            return (tableau[n / 2 - 1] + tableau[n / 2]) / 2.0;
        } else {
            return tableau[n / 2];
        }
    }

    
    public static double calculerEcartType(int[] tableau, double moyenne) {
        double somme = 0;
        for (int valeur : tableau) {
            somme += Math.pow(valeur - moyenne, 2);
        }
        return Math.sqrt(somme / tableau.length);
    }
} 
