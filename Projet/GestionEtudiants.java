package Projet;

import java.util.ArrayList;
import java.util.Iterator;

public class GestionEtudiants {
    private ArrayList<Etudiant> listeEtudiants;

    // Constructeur
    public GestionEtudiants() {
        this.listeEtudiants = new ArrayList<>();
    }

    // Ajouter un étudiant
    public void ajouterEtudiant(String nom, String prenom, String classe) {
        listeEtudiants.add(new Etudiant(nom, prenom, classe));
        System.out.println("✅ Étudiant ajouté : " + prenom + " " + nom);
    }

    // Afficher la liste des étudiants
    public void afficherEtudiants() {
        if (listeEtudiants.isEmpty()) {
            System.out.println("📌 Aucun étudiant inscrit.");
        } else {
            System.out.println("📋 Liste des étudiants :");
            for (Etudiant e : listeEtudiants) {
                System.out.println(e);
            }
        }
    }

    // Supprimer un étudiant par son nom
    public void supprimerEtudiant(String nom) {
        Iterator<Etudiant> it = listeEtudiants.iterator();
        boolean trouve = false;

        while (it.hasNext()) {
            Etudiant e = it.next();
            if (e.getNom().equalsIgnoreCase(nom)) {
                it.remove();
                System.out.println(" Étudiant supprimé : " + e.getPrenom() + " " + e.getNom());
                trouve = true;
                break;
            }
        }

        if (!trouve) {
            System.out.println("⚠️ Étudiant non trouvé : " + nom);
        }
    }
}
