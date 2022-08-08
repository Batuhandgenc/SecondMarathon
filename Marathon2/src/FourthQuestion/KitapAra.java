package FourthQuestion;

import FourthQuestion.Kitap;
import FourthQuestion.KutuphaneYonet;

import java.util.ArrayList;
import java.util.List;

public class KitapAra {
    private KutuphaneYonet dir;

    public KitapAra(KutuphaneYonet tree) {
        this.dir = tree;
    }

    public List<Kitap> search(String state) {
        List<Kitap> results = new ArrayList<Kitap>();
        for (Kitap a : dir.TumKitaplar()) {
            if (a.getClass().getName().equals(state) || a.kitapBasligi().equals(state))
                results.add(a);
        }
        return results;
    }
}