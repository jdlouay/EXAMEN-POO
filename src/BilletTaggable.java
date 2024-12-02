import java.time.LocalDate;
import java.util.Arrays;

public class BilletTaggable extends Billet implements Taggable {
    private String[] tags;
    private int nbTags;

    public BilletTaggable(String auteur, LocalDate date,int capacite) {
        super(auteur, date);
        tags = new String[capacite];
        nbTags = 0;
    }




    public void ajoutTag(String tag) {
        if (nbTags < tags.length && rechercheTag(tag) == -1) {
            tags[nbTags++] = tag;
        }
    }


    public void supprimeTag(String tag) {
        int index = rechercheTag(tag);
        if (index != -1) {
            for (int i = index; i < nbTags - 1; i++) {
                tags[i] = tags[i + 1];
            }
            tags[--nbTags] = null;
        }
    }


    public int nombreTags() {
        return nbTags;
    }


    public int rechercheTag(String tag) {
        for (int i = 0; i < nbTags; i++) {
            if (tags[i].equals(tag)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return super.toString()+
                "BilletTaggable{" +
                "tags=" + Arrays.toString(tags) +
                ", nbTags=" + nbTags +
                '}';
    }}


