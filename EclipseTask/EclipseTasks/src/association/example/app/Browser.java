package association.example.app;

public class Browser {
	public Internet internet=new Internet();

	
		public void browse() {
			System.out.println("invoking browse in Browser");
			if(this.internet!=null) {
				this.internet.connect();
				this.internet.service();
			}
			else {
				System.out.println("this.internet is null");
			}
		}
	}

