package magacin.interfejs;

import magacin.Artikal;

public interface MagacinInterface {
	
	public void dodajArtikal(Artikal artikal, int kolicina);
	public void izbaciArtikal(int kolicina);
	public Artikal pronadjiArtikal(int sifra);

}
