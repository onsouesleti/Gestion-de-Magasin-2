import java.util.Date;

public class Produit {
    private Integer id;
    private String nom;
    private String marque;
    private float prix;
    private Date dateexp;

    public Produit(int id, String nom, String marque, float prix) {
        this.id = id;
        this.nom = nom;
        this.marque = marque;
        setPrix(prix);
    }

    public Produit() {

    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getMarque() {
        return marque;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        if (prix >= 0) {
            this.prix = prix;
        } else {
            System.out.println("Prix ne peut pas être négatif.");
        }
    }

    public Date getDateexp() {
        return dateexp;
    }

    public void setDateexp(Date dateexp) {
        this.dateexp = dateexp;
    }

    public void afficher() {
        System.out.println("tn.tuniprob.gestionmagasin.Produit{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", marque='" + marque + '\'' +
                ", prix=" + prix +
                ", dateexp=" + dateexp +
                '}');
    }

    public boolean comparer(Produit autreProduit) {
        return this.id.equals(autreProduit.getId())
                && this.marque.equals(autreProduit.getMarque())
                && this.prix == autreProduit.getPrix();
    }


    @Override
    public String toString() {
        return "tn.tuniprob.gestionmagasin.Produit{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", marque='" + marque + '\'' +
                ", prix=" + prix +
                ", dateexp=" + dateexp +
                '}';
    }


}