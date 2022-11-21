package model;

public class Podcast extends AudioFormat{
    private String about;
    private TypePodcast typePodcast;

    public Podcast(int opt, String about, String name, String URL, int duration){
        super(name, URL, duration);
        this.about=about;

        switch (opt){
            case 1: typePodcast=TypePodcast.ENT;
            case 2: typePodcast=TypePodcast.LANGUAGE;
            case 3: typePodcast=TypePodcast.GAMES;
            case 4: typePodcast=TypePodcast.MOVIES;


        }
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public TypePodcast getTypePodcast() {
        return typePodcast;
    }

    public void setTypePodcast(TypePodcast typePodcast) {
        this.typePodcast = typePodcast;
    }
    public int typePodcast(){
        switch (typePodcast){
            default: return 0;
            case ENT: return 1;
            case LANGUAGE: return 2;
            case GAMES: return 3;
            case MOVIES: return 4;


        }
    }

    @Override
    public String toString() {
        return "Podcast{" +
                "typePodcast=" + typePodcast +
                '}';
    }
}
