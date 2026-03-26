import java.util.ArrayList;
import java.util.Iterator;
public class FestivalManager{
    ArrayList<Guest> listaCantanti;

public FestivalManager(Guest primoG){
    this.listaCantanti = new ArrayList<>();
    this.listaCantanti.add(primoG);
}
public void aggiungiCantante(Guest g) {
    this.listaCantanti.add(g);
}

    public void elimina(int indice) {
        if (indice >= 0 && indice < listaCantanti.size()) {
            listaCantanti.remove(indice);
        }
    }

    public void stampaLista() {
        Iterator<Guest> it = this.listaCantanti.iterator();
        while (it.hasNext()) {
            Guest g = it.next();
            System.out.println("Nome: " + g.nome + ", Età: " + g.eta);
        }
    }

    public void sostituisci(int indice, Guest nuovoGuest) {
        if (indice >= 0 && indice < listaCantanti.size()) {
            listaCantanti.set(indice, nuovoGuest);
        }
    }

}
