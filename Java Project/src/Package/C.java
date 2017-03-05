package Package;

public class C {
	static int c=30;
	static int d=40;
	public void m1(){
		int a=10;
		System.out.println(c+d);
	}
  public void m2(){
	  System.out.println(c*d);
  }
public static void m3(){
	int f=40;
	int e = 0;
	System.out.println(c*d+e);
}
public static void main(String[] args) {
	C c=new C();
	c.m1();
	c.m2();
	m3();
	}
}
