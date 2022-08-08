package FirstQuestion;
import java.util.Scanner;
public class AlanHesabi {
	 public static void main(String[] args) {

		
		try (Scanner gir = new Scanner(System.in)) {
			System.out.println("Dairenin Çapını Giriniz ");
			double cap = gir.nextDouble();
			System.out.println("Dikdörtgenin uzunluğunu giriniz");
			double uzunluk = gir.nextDouble();
			System.out.println("Dikdörtgenin genişliğini giriniz");
			double genislik = gir.nextDouble();
			System.out.println("Üçgenin yüksekliğini giriniz");
			double yukseklik = gir.nextDouble();
			System.out.println("Üçgenin tabanını giriniz");
			double taban = gir.nextDouble();
			
			System.err.println("Daire alanı =" + DaireAlani(cap));
			System.err.println("Dikdörtgenin alanı =" + KareAlani(uzunluk, genislik));
			System.err.println("Üçgenin alanı" + UcgenAlani(yukseklik, taban));
		}
		
		}

		public static double DaireAlani(double cap) {
		return 3.142*cap*cap;
		}
		public static double UcgenAlani (double yukseklik, double taban) {
		return taban*yukseklik/2;
		}
		
		public static double KareAlani(double uzunluk, double genislik) {
		return uzunluk*genislik;
		}
		
}
