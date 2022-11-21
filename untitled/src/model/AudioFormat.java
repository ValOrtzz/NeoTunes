package model;

public class AudioFormat {
    private String name;
    private String URL;
    private int duration;
    private int view;

    public AudioFormat(String name, String URL, int duration) {
        this.name = name;
        this.URL = URL;
        this.duration = duration;
        view=0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getView() {
        return view;
    }

    public void setView(int view) {
        this.view = view;
    }
}
