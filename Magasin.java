public class Magasin {
    final int CAP_MAX = 50;
    int identifiant;
    String adresse;
    int CapMagasin = 0;
    Produit[] tab = new Produit[CAP_MAX];
    private static int totalProduits = 0; // Static variable to track total products
    final int MAX_EMP=20;
    int countEmp=0;
    Employee[] employee = new Employee[MAX_EMP];

    public void ajouterEmployee(Employee emp) {
        if (countEmp >= MAX_EMP) {
            System.out.println("Impossible d'ajouter un employé ...");
        }
        employee[countEmp] = emp;
        countEmp++;
    }
    public void affiherEmploye(){
        for (int i = 0; i < countEmp; i++) {
            System.out.println(employee[i].toString() + ", ");
        }
    }


    public Magasin(int identifiant, String adresse) {
        this.identifiant = identifiant;
        this.adresse = adresse;
    }



    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("Magasin{" +
                "identifiant=" + identifiant +
                ", adresse='" + adresse + '\'' +
                ", CapMagasin=" + CapMagasin);
        for (int i = 0; i < CapMagasin; i++) {
            s.append(", ").append(tab[i].toString());
        }
        s.append("}");
        return s.toString();
    }




    public void ajouterProduit(Produit p) {
        if (CapMagasin >= CAP_MAX) {
            System.out.println("Impossible d'ajouter un produit : magasin plein.");
            return;
        }

        for (int i = 0; i < CapMagasin; i++) {
            if (tab[i].comparer(p)) {
                System.out.println("Le produit " + p.getId() + " existe déjà dans le magasin.");
                return;
            }
        }

        tab[CapMagasin] = p;
        CapMagasin++;
        totalProduits++;
        System.out.println("Produit ajouté : " + p.getId());
    }


    public void supprimerProduit(Produit p) {
        for (int i = 0; i < CapMagasin; i++) {
            if (tab[i].comparer(p)) {
                for (int j = i; j < CapMagasin - 1; j++) {
                    tab[j] = tab[j + 1];
                }
                tab[CapMagasin - 1] = null;
                CapMagasin--;
                totalProduits--;
                System.out.println("Produit supprimé : " + p.getId());
                return;
            }
        }
        System.out.println("Produit non trouvé : " + p.getId());
    }




    public boolean chercherProduit(Produit p) {
        for (int i = 0; i < CapMagasin; i++) {
            if (tab[i].comparer(p)) {
                return true;
            }
        }
        return false;
    }
    public static int getTotalProduits() {
        return totalProduits;
    }


    public static Magasin comparerMagasins(Magasin magasin1, Magasin magasin2) {
        if (magasin1.getTotalProduits() > magasin2.getTotalProduits()) {
            return magasin1;
        } else if (magasin2.getTotalProduits() > magasin1.getTotalProduits()) {
            return magasin2;
        }
        return null;
    }
}

