import java.time.LocalDate;

public class Image extends BilletTaggable {
    private String url;

    public Image(String auteur, LocalDate date, int capacite) {
        super(auteur, date, capacite);
        this.url = url;
    }


    public String getUrl() {
        return url;
    }

    @Override
    public String toString() {
        return "Image [" + super.toString() + ", URL=" + url + "]";
    }
}
