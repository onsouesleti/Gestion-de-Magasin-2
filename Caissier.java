public class Caissier extends Employee {

    public int numeroDeCaisse;

    public Caissier(int id, String name, String adresse, int nbr_heures,int numeroDeCaisse) {
        super(id, name, adresse, nbr_heures);
        this.numeroDeCaisse = numeroDeCaisse;
    }

    @Override
    public String toString() {
        return "Employee id=" + id + ", name=" + name + ", adresse=" + adresse + "Employee nombre d'heures=" + nbr_heures + numeroDeCaisse;
    }
}