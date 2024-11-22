package oppsTasks;

class Calculation{
	int a;
	int b;
	
	Calculation(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	void sum() {
		System.out.println(this.a+ this.b);
	}
}

class Addition extends Calculation{
	int c;
	int d;
	
	public Addition(int a, int b, int c, int d) {
		super(a,b);
		this.c = c;
		this.d = d;
	}
	
	void display() {
		super.sum();
		System.out.println(this.a + this.b + this.c + this.d);
	}
}

public class ThisAndSuper {

	public static void main(String[] args) {
		Addition add = new Addition(1, 2, 3, 4);
		add.display();

	}

}
