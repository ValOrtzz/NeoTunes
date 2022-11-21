package model;
import java.util.Calendar;
public abstract class User {
    private String nickname;
    private String id;
    private Calendar vinculation;

    public User(String nickname, String id, Calendar vinculation) {
        this.nickname = nickname;
        this.id = id;
        this.vinculation = vinculation;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Calendar getVinculation() {
        return vinculation;
    }

    public void setVinculation(Calendar vinculation) {
        this.vinculation = vinculation;
    }
}
