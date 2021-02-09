package pack1;

public class AccessSpec {
	int a=1;
	public int b=2;
	private int  c=3;
	protected int d=4;
	
	public void pub() {
		System.out.println("pub="+b);  //same class
	}
	private void pri() {
		System.out.println("pri="+c);   //same class
	}
	protected void pro() {
		System.out.println("pro="+d);   //same class
	}
	
	public void callPrivate() {
		pri();  //same class
	}
	
	void nomod() {
		System.out.println(a);   //same class
	}
}
