public class Vendeur extends Employee {

    public int tauxDeVente;

    public Vendeur(int id, String name, String adresse, int nbr_heures,int tauxDeVente) {
        super(id, name, adresse, nbr_heures);
        this.tauxDeVente = tauxDeVente;
    }
    @Override
    public String toString() {
        return "Employee id=" + id + ", name=" + name + ", adresse=" + adresse + "Employee nombre d'heures=" + tauxDeVente;
    }
}
