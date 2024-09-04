public class Voyage
{
    public double prix ;
    private int duree ;
    private String destination ;

    public Voyage (double prix, int duree, String destination) {

        this.prix = prix ;
        this.duree = duree ;
        this.destination = destination ;

    }
    public String getDestination() {
        return destination;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }
    public int getDuree() {
        return duree;
    }
    public void setDuree(int duree) {
        this.duree = duree;
    }
    public double getPrix() {
        return prix;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }
}