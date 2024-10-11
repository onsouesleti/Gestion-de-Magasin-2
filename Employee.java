public class Employee {
    public int id;
    public String name;
    public String adresse;
    public int nbr_heures;
    public int max_emp ;
    public Employee(int id, String name, String adresse, int nbr_heures) {
        this.id = id;
        this.name = name;
        this.adresse = adresse;
        this.nbr_heures = nbr_heures;
        max_emp = 20;
    }
    public Employee(){}

@Override
    public String toString() {
        return "Employee id=" + id + ", name=" + name + ", adresse=" + adresse;

}




}
