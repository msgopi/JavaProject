package Package1;

public class A {
String name="Gopi";
Long number=9986863096l;

static A m=new A();

public void method(){
	
	System.out.println(name);
	System.out.println(number);
	
	}
public static void method1(){
	m.method();
	String fname="siva";
	Long number=8892227089l;
	System.out.println(fname);
	System.out.println(number);
	}

public static void main(String[] args) {
	method1();
	
}

}
