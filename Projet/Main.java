package Projet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GestionEtudiants gestion = new GestionEtudiants();
        Scanner scanner = new Scanner(System.in);
        int choix;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1️⃣ Ajouter un étudiant");
            System.out.println("2️⃣ Afficher les étudiants");
            System.out.println("3️⃣ Supprimer un étudiant");
            System.out.println("0️⃣ Quitter");
            System.out.print("👉 Votre choix : ");

            choix = scanner.nextInt();
            scanner.nextLine(); // Pour consommer la ligne vide

            switch (choix) {
                case 1:
                    System.out.print("Nom : ");
                    String nom = scanner.nextLine();
                    System.out.print("Prénom : ");
                    String prenom = scanner.nextLine();
                    System.out.print("Classe : ");
                    String classe = scanner.nextLine();
                    gestion.ajouterEtudiant(nom, prenom, classe);
                    break;
                case 2:
                    gestion.afficherEtudiants();
                    break;
                case 3:
                    System.out.print("Nom de l'étudiant à supprimer : ");
                    String nomSuppr = scanner.nextLine();
                    gestion.supprimerEtudiant(nomSuppr);
                    break;
                case 0:
                    System.out.println(" Programme terminé.");
                    break;
                default:
                    System.out.println("⚠️ Choix invalide !");
            }
        } while (choix != 0);

        scanner.close();
    }
}
