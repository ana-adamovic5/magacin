package magacin.artikli;

import java.util.Date;
import java.util.Objects;

import magacin.Artikal;

public class KucnaHemija extends Artikal {
	
	Date datum;

	public Date getDatum() {
		return datum;
	}

	public void setDatum(Date datum) {
		this.datum = datum;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(datum);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		KucnaHemija other = (KucnaHemija) obj;
		return Objects.equals(datum, other.datum);
	}

	@Override
	public String toString() {
		return super.toString()+
		" KucnaHemija [datum=" + datum + "]";
	}
	
	

}
