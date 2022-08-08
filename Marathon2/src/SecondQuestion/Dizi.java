package SecondQuestion;

public class Dizi {
	
		public static void main(String[] args) {
			Diziler dizi = new Diziler();
			dizi.Ekleme(1);
			dizi.Ekleme(6);
			dizi.Ekleme(7);
			dizi.Ekleme(9);
			dizi.Ekleme(10);
			System.out.print("-");
			dizi.DiziyiGoster();
			System.out.print("-");
			dizi.ArayaSayiEkle(5, 3);
			System.out.print("-");
			dizi.DiziyiGoster();
			System.out.print("-");
			dizi.DizidenCikar(1);
			System.out.print("-");
			dizi.DiziyiGoster();;
			System.out.print("-");	}

	
	
	public static class Diziler {

		int[] dizi = new int[0];
		int[] temp;

		public void Ekleme(int sayi) {

			temp = new int[dizi.length + 1];

			for (int i = 0; i < dizi.length; i++) {

				temp[i] = dizi[i];
			}
			temp[dizi.length] = sayi;
			dizi = temp;

		}
		public void ArayaSayiEkle(int sayi, int index) {
			temp = new int[dizi.length + 1];

			for (int i = 0; i < index; i++) {

				temp[i] = dizi[i];
			}
			temp[index] = sayi;

			for (int i = index; i < dizi.length; i++) {
				temp[i + 1] = dizi[i];
			}
			dizi = temp;

		}

		public void DizidenCikar(int index) {

			temp = new int[dizi.length - 1];
			for (int i = 0; i < temp.length; i++) {

				if (i >= index) {
					temp[i] = dizi[i + 1];
				} else {
					temp[i] = dizi[i];
				}
			}

			dizi = temp;

		}

		public void DiziyiGoster() {

			for (int i : dizi) {
				System.out.print(i);
				
			}

		}

		
	}

}