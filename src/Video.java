import java.time.LocalDate;

public class Video extends BilletTaggable {
    private String url;

    public Video(String auteur, LocalDate date, int capacite) {
        super(auteur, date, capacite);
        this.url = url;
    }


    public String getUrl() {
        return url;
    }

    @Override
    public String toString() {
        return "Video [" + super.toString() + ", URL=" + url + "]";
    }
}
