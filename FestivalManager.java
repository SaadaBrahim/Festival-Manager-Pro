import java.util.ArrayList;

public class FestivalManager{
    ArrayList<Guest> listaCantanti;

public FestivalManager(Guest primoG){
    this.listaCantanti = new ArrayList<>();
    this.listaCantanti.add(primoG);
}
    public void aggiungiCantante(Guest g) {
        this.listaCantanti.add(g);
    }
}