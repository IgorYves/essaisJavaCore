package tpCaveVin;


public class BoissonAlcoolisee<T, V extends Number, D> extends Boisson<T, V>
{
  private D degreAlcool; // Champ memorisant le degre d'alcool d'une boisson alcoolisee

  public BoissonAlcoolisee (T nom, V prix, D degreAlcool)
  {
    // Initialisation de l'objet Boisson
    super (nom, prix);
    // Initialisation de l'objet BoissonAlcoolisee
    this.degreAlcool = degreAlcool;
  }

  public D getDegreAlcool ()
  {
    return this.degreAlcool;
  }
}