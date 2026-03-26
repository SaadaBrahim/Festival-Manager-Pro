import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class FestivalManager{
    ArrayList<Guest> listaCantanti;
    HashSet<Ticket> ticketCodex;

public FestivalManager(Guest primoG){
    this.listaCantanti = new ArrayList<>();
    this.listaCantanti.add(primoG);
    this.ticketCodex = new HashSet<>();
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

     public void scansionaBiglietto(Ticket t) {
                if (ticketCodex.add(t)) {
            System.out.println("biglietto " + t.codice + " di " + t.proprietario + " ACCETTATO.");
        } else {
            System.out.println("PERICOLO: ll codice " + t.codice + " e gia stato usato!");
        }
    }
        public int getNumeroPartecipanti() {
        return ticketCodex.size();
    }

}
