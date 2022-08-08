package FourthQuestion;


import FourthQuestion.*;
import java.time.Period;
import java.util.ArrayList;

public class Musteri extends Kullanici {

    private ArrayList<KitapKiralama> rentedBooks;
    private static KutuphaneYonet kutuphaneYonet;

    public Musteri(String name, String email, String password) {
        super(name, email, password);
        rentedBooks = new ArrayList<KitapKiralama>();
    }

    public static KutuphaneYonet getBookDirectory() {
        return kutuphaneYonet;
    }

    public static void setKutuphaneYonet(KutuphaneYonet k) {
        Musteri.kutuphaneYonet = kutuphaneYonet;
    }

    public ArrayList<KitapKiralama> getRentedBooks() {
        return rentedBooks;
    }

    public boolean KitapKirala(Kitap book, Period period) {
        if (kutuphaneYonet.KitapKarsilastir(book)) {
            getRentedBooks().add(new KitapKiralama(this, book, period));
    return true;
        }
    return false;
    }

    public void returnBook(KitapKiralama rent) {
        rentedBooks.remove(rent);
    }
}