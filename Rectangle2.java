
//class Rectangle2: Defines a rectangle object
public class Rectangle2{
	private int xpos, ypos, width, height; //instance variables
	
	//constructor(empty)
	//public Rectangle2(){}

	//set methods or mutator methods
	public void setX(int xpos){this.xpos=xpos;}
	public void setY(int ypos){this.ypos=ypos;}
	public void setWidth(int width){this.width=width;}
	public void setHeight(int height){this.height=height;}

	//get methods or accessor methods
	public int getX(){return xpos;}
	public int getY(){return ypos;}
	public int getWidth(){return width;}
	public int getHeight(){return height;}

	//toString method
//	public String toString(){
//		return "[" + xpos + "," + ypos + "]\twidth= " + width + ",height= " + height;
//	}

	//other methods (that we wish to add)
	public void moveTo(int xpos, int ypos){	this.xpos=xpos;
		this.ypos=ypos;
	}
	public void resize(int width, int height){
		this.width=width;
		this.height=height;
	}
}

