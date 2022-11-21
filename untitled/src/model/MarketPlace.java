package model;
import java.util.Calendar;
public class MarketPlace {
    private String nickname;
    private String sonName;
    private Calendar date;

    public MarketPlace(String nickname, String sonName, Calendar date) {
        this.nickname = nickname;
        this.sonName = sonName;
        this.date = date;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getSonName() {
        return sonName;
    }

    public void setSonName(String sonName) {
        this.sonName = sonName;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }
}
