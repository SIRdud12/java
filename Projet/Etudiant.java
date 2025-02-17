package Projet;

public class Etudiant {
    private String nom;
    private String prenom;
    private String classe;

    // Constructeur
    public Etudiant(String nom, String prenom, String classe) {
        this.nom = nom;
        this.prenom = prenom;
        this.classe = classe;
    }

    // Getters
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getClasse() {
        return classe;
    }

    // Redéfinition de toString() pour afficher un étudiant
    @Override
    public String toString() {
        return "Étudiant: " + prenom + " " + nom + " | Classe: " + classe;
    }
}
