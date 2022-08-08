package SixthQuestion;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;



public class LogError implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public LogError(String HataMesajı, long HataZamanı, String Türü, String Yeri) {
		
	}

	public static void main(String[] args) {
		
		try {
			
		
		} catch (Exception e) {

			try {
				System.out.println(e.getMessage());
				FileOutputStream fl = new FileOutputStream("LogErrorText");
				ObjectOutputStream oj = new ObjectOutputStream(fl);
				oj.writeObject(new LogError(e.getMessage(), System.currentTimeMillis(), "LogError", "UygulamaAlanı"));
				oj.close();
			} catch (Exception e2) {
				System.out.println("Bir sorun mevcut");
			}

		}

	}

}