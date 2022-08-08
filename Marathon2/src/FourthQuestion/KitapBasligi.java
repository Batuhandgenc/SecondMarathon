package FourthQuestion;

public class KitapBasligi {
    private String baslik;
    private int id;

    public KitapBasligi(String baslik, int id) {
        this.baslik = baslik;
        this.id = id;
    }

    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}