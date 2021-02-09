package pack1;

public class AccessSpecifiers {
	public int i=10;
	private int ii=100;
	protected int iii=1000;
	int iiii=10000;
	void display() {
		System.out.println(i+"public");
		System.out.println(ii+"private");
		System.out.println(iii+"protected");
		System.out.println(iiii+"no mod");
		
	}
	public static void main(String[] args) {
		AccessSpecifiers obj= new AccessSpecifiers();
		obj.display();
		
	}
	
}

class NonSubclass{
	AccessSpecifiers obj1=new AccessSpecifiers();
	void display() {
		System.out.println(obj1.i+"public");
		//System.out.println(obj1.ii+"private");
		System.out.println(obj1.iii+"protected");
		System.out.println(obj1.iiii+"no mod");
	}
		
	public static void main(String[] args) {
		
	}
}
class SubClass extends AccessSpecifiers{
	void display() {
		System.out.println(i+"public");
		//System.out.println(ii+"private");
		System.out.println(iii+"protected");
		System.out.println(iiii+"no mod");
		
	}
	public static void main(String[] args) {
		
	}
}