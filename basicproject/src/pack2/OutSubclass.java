package pack2;
import pack1.SubClass;
public class OutSubclass extends SubClass{
	int e=1;
	private int f=2;
	public int g=3;
	protected int h=4;
	public void check() {
		accessProtected();
	}
	public static void main(String[] args) {
		SubClass ob=new SubClass();
		ob.accessPub();      	//diff pack subclass
		ob.callPrivate();    	//diff pack subclass
		//ob.mm=2;
		//ob.accessProtected();  	//diff pack subclass
		OutSubclass o=new OutSubclass();
		o.check();
	}
	
	

}


class Nonsub{
	void check() {
		OutSubclass o=new OutSubclass();
		System.out.println(o.g);
		System.out.println(o.h);
		System.out.println(o.e);
		//System.out.println(o.f);  //error
	}
}
