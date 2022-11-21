package model;
import java.util.ArrayList;
public class PlayList {
    private ArrayList<AudioFormat>  audios;
    private String titlePlayList;
    private int matrix[][];
    private String code;
    private TypePlayList typePlayList;

    public PlayList(String titlePlayList, int[][]matrix){
        this.titlePlayList=titlePlayList;
        this.matrix=matrix;
        typePlayList=null;
        code=null;
        audios=new ArrayList<AudioFormat>();
    }

    public ArrayList<AudioFormat> getAudios() {
        return audios;
    }

    public void setAudios(ArrayList<AudioFormat> audios) {
        this.audios = audios;
    }

    public String getTitlePlayList() {
        return titlePlayList;
    }

    public void setTitlePlayList(String titlePlayList) {
        this.titlePlayList = titlePlayList;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public TypePlayList getTypePlayList() {
        return typePlayList;
    }

    public void setTypePlayList(TypePlayList typePlayList) {
        this.typePlayList = typePlayList;
    }
    public int typePlaylist(){
        switch (typePlayList){
            default: return 0;
            case SONG: return 1;
            case PODCAST: return 2;
            case SOUND: return 3;
        }
    }
}
