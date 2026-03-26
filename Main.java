
import java.util.Iterator;

public class Main{
    public static void main(String[] args) {
        FestivalManager manager = new FestivalManager(new Guest("leo", 58));
        manager.aggiungiCantante(new Guest("Elisa", 45));
        
        Iterator<Guest> it = manager.listaCantanti.iterator();
        System.out.println("lista cantanti");
        while (it.hasNext()) {
            Guest g = it.next();
            System.out.println("nome: " + g.nome + ", eta: " + g.eta);
            }
    }
}