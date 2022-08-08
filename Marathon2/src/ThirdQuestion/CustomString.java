package ThirdQuestion;

import java.util.Scanner;

public class CustomString {
	
	private static final Scanner YaziGir = null;


	public static void main(String[] args) {
		
		Degiskenler degistir = new Degiskenler();
		degistir.Uzunluk();
		degistir.BuyukHarf();
		degistir.KucukHarf();
		degistir.BasindaVeSonundaBoslukOlmasin();
		degistir.NeileBitiyor(YaziGir);
		degistir.NeileBasliyor(YaziGir);
		degistir.IndisNumarasindanSonraYaz(); 
		degistir.BuyukKucukHarfOnemseme(); 
		degistir.MetinUzerindeVarmi(); 
		degistir.KarsilastirmaYap(); 
	}
	
}

