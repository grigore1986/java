import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Cream obiecte de tip Attendee si Ticket
        var a1 = new Attendee("a1", "l1", null);
        var a2 = new Attendee("a2", null, "t2");
        var a3 = new Attendee("a3", "l3", "t3");
        var a4 = new Attendee("a4", null, null);

        var t1 = new Ticket("t1", "l1");
        var t2 = new Ticket("t2", "l2");
        var t3 = new Ticket("t3", "l3");
        var t4 = new Ticket("t4", "l4");
        // Cream liste de obiecte de tip Attendee si Ticket
        var attendees = List.of(a1, a2, a3, a4);
        var tickets = List.of(t1, t2, t3, t4);
        // Apelam metoda fixAttendees cu lista de Attendee si Ticket ca parametrii
        fixAttendees(attendees, tickets);
        // Afisam fiecare element din lista de Attendee folosind metoda toString()
        System.out.println(attendees.stream().map(Attendee::toString).collect(Collectors.joining("\n")));
        // Expected output:
        // Attendee{name='a1', location='l1', ticketId='t1'},
        // Attendee{name='a2', location='l2', ticketId='t2'},
        // Attendee{name='a3', location='l3', ticketId='t3'},
        // Attendee{name='a4', location='null', ticketId='null'}

    }
    // Metoda fixAttendees
    public static void fixAttendees(List<Attendee> attendees, List<Ticket> tickets) {
        // Parcurgem fiecare obiect din lista de Attendee
        for(Attendee attendee : attendees){
            // Daca obiectul nu are atributul ticketId setat, cautam un bilet care are locatia setata
            if(attendee.getTicketId() == null ){
                for(Ticket ticket : tickets){
                    // Daca gasim un bilet care are locatia setata si aceeasi locatie ca si obiectul Attendee curent
                    // setam atributul ticketId din obiectul Attendee la valoarea atributului ticketId din bilet si iesim din bucla
                    if(ticket.getLocation() != null && ticket.getLocation().equals(attendee.getLocation())){
                        attendee.setTicketId(ticket.getTicketId());
                        break;
                    }
                }
            }

        }
    }
}
// Constructorul clasei Ticket
class Ticket {
    private String ticketId;
    private String location;

    public Ticket(String ticketId, String location) {
        this.ticketId = ticketId;
        this.location = location;
    }
    // Getter si setter pentru atributul ticketId
    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }
    // Getter si setter pentru atributul location
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return Objects.equals(ticketId, ticket.ticketId) && Objects.equals(location, ticket.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ticketId, location);
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketId=" + ticketId +
                ", location='" + location + '\'' +
                '}';
    }
}
// Constructorul clasei Attendee
class Attendee {
    private String name;
    private String location;
    private String ticketId;

    public Attendee(String name, String location, String ticketId) {
        this.name = name;
        this.location = location;
        this.ticketId = ticketId;
    }
    // Getter si setter pentru atributul name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    // Getter si setter pentru atributul locatie
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Attendee attendee = (Attendee) o;
        return Objects.equals(name, attendee.name) && Objects.equals(location, attendee.location) && Objects.equals(ticketId, attendee.ticketId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, location, ticketId);
    }

    @Override
    public String toString() {
        return "Attendee{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", ticketId='" + ticketId + '\'' +
                '}';
    }
}