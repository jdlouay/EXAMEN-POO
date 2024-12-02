import java.time.LocalDate;

public class blog {
    private String titre;
    private Publiable[] billets; // Tableau de billets
    private int nbBillets; // Nombre de billets ajoutés

    // Constructeur
    public blog(String titre, int capacite) {
        this.titre = titre;
        this.billets = new Publiable[capacite]; // Capacité initiale
        this.nbBillets = 0;
    }

    // Méthode pour publier un billet
    public void post(Publiable billet) {
        if (nbBillets < billets.length) {
            billets[nbBillets++] = billet; // Ajout du billet dans le tableau
        } else {
            System.out.println("Capacité maximale atteinte, impossible d'ajouter un nouveau billet.");
        }
    }

    // Méthode pour compter les billets taggables
    public int getNombreBilletsTaggables() {
        int count = 0;
        for (int i = 0; i < nbBillets; i++) {
            if (billets[i] instanceof Taggable) { // Vérifie si le billet implémente Taggable
                count++;
            }
        }
        return count;
    }

    // Méthode pour récupérer le billet le plus récent
    public Publiable getPlusRécentBillet() {
        if (nbBillets == 0) return null; // Si aucun billet

        Publiable plusRecent = billets[0];
        for (int i = 1; i < nbBillets; i++) {
            if (billets[i].getDatePublication().isAfter(plusRecent.getDatePublication())) {
                plusRecent = billets[i];
            }
        }
        return plusRecent;
    }

    // Méthode pour rechercher des billets par auteur
    public Publiable[] RechercheBilletsParAuteur(String auteur) {
        // Compter les billets correspondants
        int count = 0;
        for (int i = 0; i < nbBillets; i++) {
            if (billets[i].getAuteur().equals(auteur)) {
                count++;
            }
        }

        // Créer un tableau pour stocker les résultats
        Publiable[] result = new Publiable[count];
        int index = 0;
        for (int i = 0; i < nbBillets; i++) {
            if (billets[i].getAuteur().equals(auteur)) {
                result[index++] = billets[i];
            }
        }
        return result;
    }

    // Getter pour récupérer tous les billets (optionnel)
    public Publiable[] getBillets() {
        // Retourne un tableau contenant uniquement les billets valides
        Publiable[] result = new Publiable[nbBillets];
        System.arraycopy(billets, 0, result, 0, nbBillets);
        return result;
    }

    // Affichage des informations du blog (optionnel)
    @Override
    public String toString() {
        return "Blog [Titre: " + titre + ", Nombre de billets: " + nbBillets + "]";
    }
}
