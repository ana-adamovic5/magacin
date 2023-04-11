package magacin;

import java.util.Objects;

public class Artikal {
	
	private String naziv;
	private int sifra;
	private String opis;
	private int kolicina;
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		if(naziv!=null)
		this.naziv = naziv;
		else
			throw new IllegalArgumentException("Naziv ne sme biti null");
	}
	public int getSifra() {
		return sifra;
	}
	public void setSifra(int sifra) {
		if(sifra>0)
		this.sifra = sifra;
		else
			throw new IllegalArgumentException("Sifra mora biti broj veci od nule");
	}
	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) {
		if(opis!=null)
		this.opis = opis;
		else
			throw new IllegalArgumentException("Opis ne sme biti null");
	}
	public int getKolicina() {
		return kolicina;
	}
	public void setKolicina(int kolicina) {
		if(kolicina>=0)
		this.kolicina = kolicina;
		else
			throw new IllegalArgumentException("Kolicina ne sme biti negativan broj");
	}
	@Override
	public int hashCode() {
		return Objects.hash(kolicina, naziv, opis, sifra);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Artikal other = (Artikal) obj;
		return kolicina == other.kolicina && Objects.equals(naziv, other.naziv) && Objects.equals(opis, other.opis)
				&& sifra == other.sifra;
	}
	@Override
	public String toString() {
		return "Artikal [naziv=" + naziv + ", sifra=" + sifra + ", opis=" + opis + ", kolicina=" + kolicina + "]";
	}
	
	
	
	

}
