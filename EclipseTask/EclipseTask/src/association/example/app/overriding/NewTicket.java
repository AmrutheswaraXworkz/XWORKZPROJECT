package association.example.app.overriding;

public class NewTicket extends Ticket {
	@Override
	public void bus() {
		System.out.println("invoking bus in NewTicket");	}

}
