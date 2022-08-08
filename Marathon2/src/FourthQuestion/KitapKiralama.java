package FourthQuestion;

import java.time.LocalDate;
import java.time.Period;

public class KitapKiralama {
    private Musteri musteri;
    private Kitap Kitap;
    private Musteri id;
    LocalDate kiralamaGunu;
    Period period;

    public KitapKiralama(Musteri customer, Kitap Kitap, Period period) {
        this.musteri = customer;
        this.Kitap = Kitap;
        this.period = period;
        kiralamaGunu = LocalDate.now();
    }
   
    public Musteri getId() {
		return id;
	}

	public void setId(Musteri id) {
		this.id = id;
	}

	public Musteri getMusteri() {
		return musteri;
	}

	public void setMusteri(Musteri musteri) {
		this.musteri = musteri;
	}

	public Kitap getKitap() {
		return Kitap;
	}

	public void setKitap(Kitap kitap) {
		Kitap = kitap;
	}

	public LocalDate getKiralamaGunu() {
		return kiralamaGunu;
	}

	public void setKiralamaGunu(LocalDate kiralamaGunu) {
		this.kiralamaGunu = kiralamaGunu;
	}

	public Period getPeriod() {
		return period;
	}

	public void setPeriod(Period period) {
		this.period = period;
	}

	
}