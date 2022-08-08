package SecondQuestion;

public class Dizi {

	public int[] SonunaElemanEkle(int[] OldArray, int sayi) {
		int[] newArray = new int[OldArray.length + 1];
			for (int i = 0; i < OldArray.length; i++) 
	{
				newArray[i] = OldArray[i];
	}
		newArray[OldArray.length] = sayi;
		return newArray;
	}

	public int[] ElemanEkle(int[] OldArray, int index, int sayi) {
		int[] newArray = new int[OldArray.length + 1];
			for (int i = 0; i < OldArray.length; i++) {
				if (i == index) {
				newArray[i] = sayi;
			} else if (i > index)
				newArray[i] = OldArray[i - 1];
			else
				newArray[i] = OldArray[i];
		}
		if (index < OldArray.length)
			newArray[OldArray.length] = OldArray[OldArray.length - 1];
		else
			newArray[OldArray.length] = sayi;
		return newArray;
	}


	public int[] ElemanSil(int[] OldArray, int index) {
		int[] newArray = new int[OldArray.length - 1];
		for (int i = 0; i < newArray.length; i++) {
		if (i >= index) {
		newArray[i] = OldArray[i + 1];
		} else
		newArray[i] = OldArray[i];
		}
		return newArray;
	}

	public void DiziGoruntule(int[] dizi) {
	for (int index : dizi)
	System.out.println(index);
	}
}
