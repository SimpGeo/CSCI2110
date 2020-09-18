// An Rectangle class which has x position, y position, width and height.
public class Rectangle {
    //instance variables
    private double xpos, ypos, width, height;

    //constructor
    public Rectangle(){}
    public Rectangle(double xpos,double ypos,double width,double height){
        this.xpos=xpos; this.ypos=ypos; this.width=width; this.height=height;}

    //set and get method
    public void setxpos(double xpos) {this.xpos = xpos;    }

    public void setypos(double ypos) {this.ypos = ypos;    }

    public void setHeight(double height) {this.height = height;    }

    public void setWidth(double width) {this.width = width;    }

    public double getxpos() {return xpos;    }

    public double getypos() {return ypos;    }

    public double getWidth() {return width;    }

    public double getHeight() {return height;    }


    //method: contains; which return true if the point is inside the Rectangle
    public boolean contains(double px, double py){
        return (px>xpos && py>ypos && px<xpos+width && py<ypos+height);
    }


    //method: touches; which return true if the point is touching the Rectangle
    public boolean touches(double px, double py){
        return (px==xpos || py==ypos || px==xpos+width || py==ypos+height);
    }


    //method: contains(Rectangle); which return turn if the rectangle is contain by another rectangle
    public boolean contains(Rectangle rec){
        double xp = rec.getxpos();
        double yp = rec.getypos();
        double wid = rec.getWidth();
        double hei = rec.getHeight();
        return (this.contains(xp,yp) && this.contains(xp,yp+hei) && this.contains(xp+wid,yp) && this.contains(xp+wid,yp+hei));
    }

    //method: touches(Rectangle); return true if rectangles are touching each other
    public boolean touches(Rectangle rec){
        double xp1 = rec.getxpos();
        double yp1 = rec.getypos();
        double wid1 = rec.getWidth();
        double hei1 = rec.getHeight();
        return (this.touches(xp1,yp1) || this.touches(xp1,yp1+hei1) || this.touches(xp1+wid1,yp1) || this.touches(xp1+wid1,yp1+hei1));
    }


}
