import java.util.Objects;

public class Ticket {
    String codice;
    String proprietario;

    public Ticket(String codice, String proprietario) {
        this.codice = codice;
        this.proprietario = proprietario;
    }

    // Fondamentale per far funzionare l'HashSet con i duplicati
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return Objects.equals(codice, ticket.codice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codice);
    }
}
