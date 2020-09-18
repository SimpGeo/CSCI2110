//Demo class
//creat scanner class to get user input
import java.util.*;


public class Exercise1 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        //get the amount of rectangles
        int y = sc.nextInt();
        int i =0;

        while(i<y){

            //get the coordinates of test rectangles
            double xpos1 = sc.nextDouble();
            double ypos1 = sc.nextDouble();
            double width1 = sc.nextDouble();
            double height1 = sc.nextDouble();

            //input the coordinates into the first rectangle
            Rectangle rec1= new Rectangle(xpos1,ypos1,width1,height1);


            //get the coordinates of comparing rectangles
            double xpos2 = sc.nextDouble();
            double ypos2 = sc.nextDouble();
            double width2 = sc.nextDouble();
            double height2 = sc.nextDouble();

            //input the coordinates into the second rectangle
            Rectangle rec2= new Rectangle(xpos2,ypos2,width2,height2);


            //print information of the test rectangle
            System.out.println();
            System.out.println("The first Rectangles's top corner is: "+ xpos1 + ", "+ypos1);
            System.out.println("It's width is: "+width1);
            System.out.println("It's height is: "+height1);
            System.out.println();

            //print information of the comparing rectangle
            System.out.println("The Second Rectangles's top corner is: "+ xpos2 + ", "+ypos2);
            System.out.println("It's width is: "+width2);
            System.out.println("It's height is: "+height2);
            System.out.println();


            //print the result of "contains" and "touches" methods
            System.out.println("The contains method returns: "+ rec1.contains(rec2));
            System.out.println("The touches method returns: "+ rec1.touches(rec2));


            //double space
            System.out.println();
            System.out.println();
            i++;


        }
    }
}
