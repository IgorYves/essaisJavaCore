package biblio.metier;

import java.util.Calendar;
import java.util.Date;

public class TypeDonneesAnnee {
	int a;
	public TypeDonneesAnnee() throws AnneeIllegalArgumentException {
		throw new AnneeIllegalArgumentException();
	}
	public TypeDonneesAnnee(int a) throws AnneeIllegalArgumentException {
		if (a < 0) throw new AnneeIllegalArgumentException();
		Calendar c = Calendar.getInstance();
		c.setTime(new Date());
		if (a > c.get(Calendar.YEAR)) throw new AnneeIllegalArgumentException();
		this.a = a;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {return true;}
		if (obj == null) {return false;}
		if (!(obj instanceof TypeDonneesAnnee)) {return false;}
		TypeDonneesAnnee other = (TypeDonneesAnnee) obj;
		if (a != other.a) {return false;}
		return true;
	}
	@Override
	public String toString() {
		return String.valueOf(a);
	}
}
