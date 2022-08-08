package FourthQuestion;

import FourthQuestion.Musteri;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalTime;
import java.time.Period;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class KutuphaneYonet {
    private ArrayList<Kitap> kitaplar;
    private HashSet<KitapBasligi> kitapBasligi;

    public void addBook(KitapBasligi kitapBasligi, int id) {
        Kitap yeniKitap = new Kitap(kitapBasligi, id);
        kitaplar.add(yeniKitap);
    }

    public boolean KitapKarsilastir(Kitap book) {
        return kitaplar.contains(book);
    }

    public void KitapSil(Kitap book) {
    	kitaplar.remove(book);
    }

    public void TumKitaplariSil() {
    	kitaplar.clear();
    }

    public int KitapSayisi() {
        return kitaplar.size();
    }

    public void KitapGecmisiSil() {
    	kitaplar.clear();
    }

    public void YeniKitapBasligiEkle(String title, int id) {
    	kitapBasligi.add(new KitapBasligi(title, id));
    }

    public int KitapTurSayisi() {
        return kitapBasligi.size();
    }

    public String toString() {
        return kitaplar.toString();
    }

    public List<Kitap> TumKitaplar() {
        return kitaplar;
    }

    public HashSet<KitapBasligi> TumKitapTurleri() {
        return kitapBasligi;
    }

}