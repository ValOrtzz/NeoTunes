package model;
import java.util.ArrayList;
import java.util.Calendar;
public class CreatorC extends Producer{
    private ArrayList<Podcast> podcasts;

    public CreatorC(String nickname, String id, Calendar vinculation, String URL){
        super(nickname, id, vinculation, URL);
        podcasts = new ArrayList<Podcast>();
    }

    public ArrayList<Podcast> getPodcasts() {
        return podcasts;
    }

    public void setPodcasts(boolean adddelete, ArrayList<Podcast> podcasts){
        if(adddelete) {
            podcasts.add(podcasts);
        }
        else {
            podcasts.remove(podcasts);
        }
        this.podcasts = podcasts;
    }
    public boolean addPodcast(Podcast podcast){
        return podcasts.add(podcast);
    }
    public boolean removeSong(Podcast podcast) {
        return podcasts.remove(podcast);
    }
    public boolean searchPodcast(Podcast podcast){
        boolean found = false;
        for(int i=0; i<podcasts.size() && !found; i++){
            if(podcasts.get(i)==podcast){
                found = true;
            }
        }
        return found;
    }
}

