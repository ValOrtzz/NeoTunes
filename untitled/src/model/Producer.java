package model;
import java.util.Calendar;

public class Producer extends User {
    private String URL;
    private String name;
    private int views;
    private int playTime;

    public Producer(String nickname, String id, Calendar vinculation, String URL) {
        super(nickname, id, vinculation);
        this.URL = URL;
        this.name = name;
        views = 0;
        playTime = 0;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getPlayTime() {
        return playTime;
    }

    public void setPlayTime(int playTime) {
        this.playTime = playTime;
    }
}
