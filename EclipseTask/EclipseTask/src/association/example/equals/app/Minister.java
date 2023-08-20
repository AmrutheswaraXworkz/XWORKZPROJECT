package association.example.equals.app;

public class Minister {
	private String name;
	private int age;
	private double salary;
	private int exp;
	private String location;
	private String cabinetPost;
	
	public Minister() {
		System.out.println("no parameter");
	}

	public Minister(String name, int age, double salary, int exp, String location, String cabinetPost) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.exp = exp;
		this.location = location;
		this.cabinetPost = cabinetPost;
	}
	@Override
	public String toString() {
		return "Minister [name="+name+",age="+age+",salary="+salary+",exp="+exp+",location="+location+",cabinet post="+cabinetPost+"]";
	}
	@Override
	
	public boolean equals(Object obj) {
		if(obj!=null) {
			System.out.println("obj is not null");
		
		if(obj instanceof Minister) {
			System.out.println("obj instance of minister");
			Minister minister=(Minister)obj;
			if(minister.location.equals(this.location)) {
				System.out.println("minister references and contents are same");
				return true;
			}
			else {
				System.out.println("minister ref and contents are different");
			}
		}
			else 
			{
				System.out.println("obj reference not pointing to minister");
			}
		}
		else {
			System.out.println("obj is null");
		}
		return false;
	
	}
	}
	

