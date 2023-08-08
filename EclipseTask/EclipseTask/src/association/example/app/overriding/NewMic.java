package association.example.app.overriding;

public class NewMic extends Mic {
	@Override
	public void receiver() {
		System.out.println("invoking receiver from NewMic");
	}

}
