package tpCaveVin;

public class Boisson<T, V extends Number> implements Payable {
	private T nom; // Champ memorisant le nom d'une boisson
	private V prix; // Champ memorisant le prix d'une boisson

	public  Boisson(T nom, V prix) {
		this.nom = nom;
		this.prix = prix;
	}

	public T getNom() {
		return this.nom;
	}

	@Override
	public V getPrix() {
		return this.prix;
	}
}