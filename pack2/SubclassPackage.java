package pack2;

import pack1.AccessSpecifiers;

public class SubclassPackage extends AccessSpecifiers {
	void display() {
		System.out.println("Subclass Diffrent Package ");
		System.out.println(i+"public");
		//System.out.println(ii+"private");
		System.out.println(iii+"protected");
		//System.out.println(iiii+"no mod");
		
	}
	public static void main(String[] args) {
		SubclassPackage obj=new SubclassPackage();
		obj.display();
	}

}
class NonSubclassPackage{
	AccessSpecifiers obj1=new AccessSpecifiers();
	void display() {
		System.out.println("NonSubclass Diffrent Package ");
		System.out.println(obj1.i+"public");
		//System.out.println(obj1.ii+"private");
		//System.out.println(obj1.iii+"protected");
		//System.out.println(obj1.iiii+"no mod");
	}
	public static void main(String[] args) {
		NonSubclassPackage obj2=new NonSubclassPackage();
		obj2.display();
	}
}
