
import java.util.Iterator;

public class Main{
    public static void main(String[] args) {
        FestivalManager manager = new FestivalManager(new Guest("leo", 58));
        manager.aggiungiCantante(new Guest("elisa", 45));
        
        Iterator<Guest> it = manager.listaCantanti.iterator();
        System.out.println("lista cantanti prima stampa 2 pp");
        manager.stampaLista();
        

        manager.aggiungiCantante(new Guest("GIGI", 87));
        manager.aggiungiCantante(new Guest("PEPE", 89));

        System.out.println("lista cantanti seconda stampa 4 pp");
        manager.stampaLista();

        manager.sostituisci(1, new Guest("annalisa", 38));
        System.out.println("lista dopo sostituzione (annalisa al posto di elisa)");
        manager.stampaLista();

        manager.elimina(3);
        System.out.println("lista cantanti selimino terzo (pepe)");

        manager.stampaLista(); // no pepe

    }
}