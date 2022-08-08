package FourthQuestion;
import FourthQuestion.Kitap;
import java.util.ArrayList;


public class Kullanici {
    protected String name;
    protected String email;
    protected String password;
    private int id;
    private static int SonrakiId = 0;

    public Kullanici(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.id = SonrakiId;
        SonrakiId++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}