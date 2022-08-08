package FourthQuestion;

public class Kitap {

    private KitapBasligi kitapBasligi;
    private int id;

    public Kitap(KitapBasligi bookTitle, int id, KitapBasligi kitapBasligi) {
        this.kitapBasligi = kitapBasligi;
        this.id = id;
    }

    public KitapBasligi kitapBasligi() {
        return kitapBasligi;
    }

    public String getBaslik() {
        return kitapBasligi().getBaslik();
    }

    public void setTitle(String baslik) {
        this.kitapBasligi().setBaslik(baslik);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}