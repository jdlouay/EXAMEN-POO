import java.time.LocalDate;

public class Billet {

    private LocalDate date;
    private String auteur ;


    public Billet(String auteur, LocalDate date) {
        this.auteur = auteur;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Billet{" +
                "date=" + date +
                ", auteur='" + auteur + '\'' +
                '}';
    }


}
