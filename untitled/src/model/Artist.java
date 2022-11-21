package model;

import java.util.ArrayList;
import java.util.Calendar;

public class Artist extends Producer{
    private ArrayList<Song> songs;
public Artist(String nickname, String id, Calendar vinculation, String URL){
    super(nickname, id, vinculation, URL);
    songs= new ArrayList<Song>();
    }
  public ArrayList<Song> getSongs(){
    return songs;
  }
  public void setSongs (boolean adddelete, ArrayList<Song> songs){
    if(adddelete) {
        songs.add(songs);
    }
    else {
        songs.remove(songs);
    }
  }

    public void setSongs(ArrayList<Song> songs) {
        this.songs = songs;
    }

    public boolean addSong(Song song){
    return songs.add(song);
  }
  public boolean removeSong(Song song) {
      return songs.remove(songs);
  }
  public boolean searchSong(Song song){
    boolean found = false;
    for(int i=0; i<songs.size() && !found; i++){
        if(songs.get(i)==song){
            found = true;
        }
    }
      return found;
  }
}
