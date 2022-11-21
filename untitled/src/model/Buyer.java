package model;
import java.util.Calendar;
public class Buyer extends User{
    public Buyer(String nickname, String id, Calendar vinculation){
        super(nickname,id,vinculation);
    }
    public abstract boolean addPlayList(String name, int[][]matrix);
    public abstract PlayList searchPlayList(String name);
    public abstract boolean addContentPlayList(AudioFormat audio, PlayList playlist);
    public abstract  String removeAudio(AudioFormat audio, String titlePlayList);
    public abstract  String doCode(int[][]matrixnum, int typlePlayList);
    public abstract  String showCode(int[][]matrix);
    public abstract String mostviewsSong();
    public abstract String mostviewsPodcast();
}
