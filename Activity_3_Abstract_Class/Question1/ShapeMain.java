package Question1;
import java.util.*;

public class ShapeMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Shape sh;
        System.out.println("Circle");
        System.out.println("Square");
        System.out.println("Enter the shape");
        String shape=sc.next();
        if(shape.equals("Circle")){
        System.out.print("Enter the radius: ");
        int radius=sc.nextInt();
        Circle c=new Circle();
        sh=c;
        System.out.println("Area of circle is: " +sh.calculateArea(radius));
        }
        else if(shape.equals("Square")){
            System.out.println("Enter the side: ");
            int side=sc.nextInt();
            Square s=new Square();
            sh=s;
            System.out.println("Area of square is: "+sh.calculateArea(side));
            
        }        
    sc.close();
    }    
}
    
