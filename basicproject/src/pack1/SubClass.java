package pack1;

public class SubClass extends AccessSpec{
	AccessSpec ob=new AccessSpec();
	protected int mm=0;
	private int var=60;
	public void accessPub() {   //same pack diff class
		ob.b=20;
		ob.pub();
		System.out.println(ob.b);  
	}
	
	//error
	private void accessPrivate() { //same pack diff class
		//ob.c=300;
		//ob.pri();
		ob.callPrivate();
		System.out.println(var);
	}

	protected  void accessProtected() { //same pack diff class
		ob.d=40;
		ob.pro();
		System.out.println(ob.d);
	}
	
	public void callPrivate() { //same class
		accessPrivate();
	}
}
