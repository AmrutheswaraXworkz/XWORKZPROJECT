package association.example.app;

public class A {
	A c(A i) {
		System.out.println(i.hashCode());
		i.d();
		return i;
	}

	void d() {
		System.out.println("hahaha");
	}

	public static void main(String[] args) {
		A y = new A();

		y.c(y);
		y.d();
	}

}
