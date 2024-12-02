import java.time.LocalDate;

public class Message extends Billet {
    private String contenue;


    public Message(String auteur, LocalDate date,String contenue ) {
        super(auteur, date);

        this.contenue = contenue;
    }

    public String getContenue() {
        return contenue;
    }
}
