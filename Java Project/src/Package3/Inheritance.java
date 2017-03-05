package Package3;

public class Inheritance {
public static void main(String[] args) {
	A a=new A();
	B b=new B();
	a.i=10;
	a.j=20;
	System.out.println();
	b.i=7;
	b.j=8;
	b.k=9;
	System.out.println("contents of b : ");
	b.showij();
	b.showK();
	System.out.println();
	System.out.println("Sum of i,j and k in b: ");
b.sum();
}
}
