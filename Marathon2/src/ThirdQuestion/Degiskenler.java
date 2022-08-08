package ThirdQuestion;


import java.util.Scanner;

public class Degiskenler {
	String Dizi = "Besinci Soru Databesi'i yordu";
		public void Uzunluk() {
		int uzunluk=Dizi.length();
		System.out.println(uzunluk);
		}
		public void BuyukHarf() {
		String Buyukharf=Dizi.toUpperCase();
		System.out.println(Buyukharf);  
		}
		public void KucukHarf() {
			String Kucukharf=Dizi.toLowerCase();
			System.out.println(Kucukharf);  
			}
		public void BasindaVeSonundaBoslukOlmasin() {
			String BasindaVeSonundaBoslukOlmasin=Dizi.trim();
			System.out.println(BasindaVeSonundaBoslukOlmasin);  
		}
		public void NeileBitiyor(Scanner YaziGir) {
			Scanner YaziGir1 = new Scanner(System.in);
			String ilemibitiyor = YaziGir1.next();
			boolean neilebitiyor=Dizi.endsWith(ilemibitiyor);
			System.out.println(neilebitiyor);  
		}
		public void NeileBasliyor(Scanner YaziGir) {
			Scanner YaziGir2 = new Scanner(System.in);
			String ilemibasliyor = YaziGir2.next();
			boolean neilebasliyor=Dizi.startsWith(ilemibasliyor);
			System.out.println(neilebasliyor);  
		}
		public void IndisNumarasindanSonraYaz() {
			String indisNumarasindanSonraYaz=Dizi.substring(5,8);
			System.out.println(indisNumarasindanSonraYaz);  
		}
		public void BuyukKucukHarfOnemseme() {
			boolean buyukkucukharfonemseme=Dizi.equalsIgnoreCase("ikinci soru");
			System.out.println(buyukkucukharfonemseme);  
		}
		public void MetinUzerindeVarmi() {
			boolean metinuzerindevarmi=Dizi.contains("kinci");
			System.out.println(metinuzerindevarmi);  
		}
		public void KarsilastirmaYap() {
			boolean karsilastirmayap=Dizi.equals("ikinci soru");
			System.out.println(karsilastirmayap);  
		}
		
}


