//Client Program for Rectangle2.java
public class Rectangle2Demo{
	public static void main(String[] args){
		Rectangle2 rect1 = new Rectangle2();
		rect1.setX(100);
		rect1.setY(50);
		rect1.setWidth(20);
		rect1.setHeight(25);
		System.out.println("Rectangle before modification: " + rect1);
		rect1.moveTo(200,300);
		rect1.resize(10,30);
		System.out.println("Rectangle after modification: " + rect1);
	}
}
