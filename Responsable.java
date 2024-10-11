public class Responsable extends Employee {

    public int prime;

    public Responsable(int id, String name, String adresse, int nbr_heures,int prime) {
        super(id, name, adresse, nbr_heures);
        this.prime = prime;
    }
    @Override
    public String toString() {
        return "Employee id=" + id + ", name=" + name + ", adresse=" + adresse + "Employee nombre d'heures=" + nbr_heures + ", prime=" + prime;
    }

}