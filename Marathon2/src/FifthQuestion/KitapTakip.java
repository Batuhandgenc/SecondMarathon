package FifthQuestion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import FourthQuestion.Kitap;
import FourthQuestion.Musteri;

public class KitapTakip {

	public class BookDB {
		public static Map<Kitap, Musteri> KiralananKitaplar = new HashMap<>();
		public static List<Kitap> Kitaplar = new ArrayList<Kitap>();
		public static List<Musteri> Musteriler = new ArrayList<Musteri>();

	}
	public Optional<List<Musteri>> kimlerTarafindanKiralanmis(String string) {
		Optional<List<Musteri>> Musteri = Optional.empty();
			return Musteri;
		}
	
	public Optional<List<Musteri>> MusteriBul(CharSequence string) {
		return Optional.ofNullable(BookDB.Musteriler.stream().filter(m -> m.getName().contains(string)).toList());
	}
	
	public Optional<Musteri> kimtarafindanKirada(String iDString) {
	Musteri musteri1;
	musteri1 = BookDB.KiralananKitaplar.entrySet().stream().filter(a -> {
		var iDString2 = iDString;
		return a.getKey().equals(iDString2);
	}).findFirst().get().getValue();
	System.out.println("bu kitabı kiralayan"+ musteri1.getName() );
	return Optional.ofNullable(musteri1);
}
	
}

