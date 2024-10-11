import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Produit produit1 = new Produit(1021, "Lait", "Delice", 0.700f);
        Produit produit2 = new Produit(2510, "Yaourt", "Vitalait", 0.600f);
        Produit produit3 = new Produit(3250, "Tomate", "Sicam", 1.200f);

        Date expirationDate = new Date(2028 - 2025, 11, 12); // Fix year issue
        produit1.setDateexp(expirationDate);
        produit2.setDateexp(expirationDate);
        produit3.setDateexp(expirationDate);

       /* Magasin Mg = new Magasin(9001, "MG");
        Mg.ajouterProduit(produit1);
        Mg.ajouterProduit(produit2);
        Mg.ajouterProduit(produit3);

        Magasin aziza = new Magasin(9001, "MG");
       aziza.ajouterProduit(produit1);
        aziza.ajouterProduit(produit2); */

        Magasin Carrefour = new Magasin(1, "Menzah 6");
        Carrefour.ajouterProduit(produit1);
        Carrefour.ajouterProduit(produit2);
        Magasin Monoprix = new Magasin(2, "centre ville");
        Monoprix.ajouterProduit(produit3);
        Monoprix.ajouterProduit(produit1);
        Monoprix.ajouterProduit(produit2);


        Caissier C1 = new Caissier(0,"ali","tunis",8,3);
        Caissier C2 = new Caissier(1,"mariem","ariana",8,1);
        Vendeur V1 = new Vendeur(1,"karim","ben arous",8,20);
        Responsable R1 = new Responsable(1, "Selim","Menzah",4,500);

        Vendeur V2 = new Vendeur(2,"Ahmed","ben arous",8,20);
        Vendeur V3 = new Vendeur(3,"sinda","ariana",8,30);
        Vendeur V4 = new Vendeur(4, "Khaled", "Bizerte", 8, 25);

        Caissier C3 = new Caissier(2, "Sami", "La Marsa", 8, 2);
        Responsable R2 = new Responsable(2, "Faten", "Gammarth", 4, 600);

        Carrefour.ajouterEmployee(C1);
        Carrefour.ajouterEmployee(C2);
        Monoprix.ajouterEmployee(C3);
        Carrefour.ajouterEmployee(V1);
        Monoprix.ajouterEmployee(V2);
        Monoprix.ajouterEmployee(V3);
        Monoprix.ajouterEmployee(V4);
        Carrefour.ajouterEmployee(R1);
        Monoprix.ajouterEmployee(R2);

        Monoprix.affiherEmploye();
        System.out.println(Monoprix.toString());
        System.out.println("Total produits dans tous les magasins: " + Magasin.getTotalProduits());
        System.out.println("Produit 1 et Produit 2 sont identiques ? " + produit1.comparer(produit2));
        System.out.println("Produit est-il existant ? " + Monoprix.chercherProduit(produit2));

        Carrefour.affiherEmploye();
        System.out.println(Carrefour.toString());
        System.out.println("Total produits dans tous les magasins: " + Magasin.getTotalProduits());
        System.out.println("Produit 1 et Produit 2 sont identiques ? " + produit1.comparer(produit2));
        System.out.println("Produit est-il existant ? " + Monoprix.chercherProduit(produit2));


    }
}
