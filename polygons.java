import java.util.*;

abstract class shape{
    int b,h;
    abstract public void printArea();
}

class Rectangle extends shape{

    public void printArea(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the length of Rectangle");
        System.out.println("Enter the breadth of Rectangle");
        b=s.nextInt();
        h=s.nextInt();
        double area=b*h;
        System.out.println("Area of Rectangle is:"+area);
    }
}
class Triangle extends shape{
     public void printArea(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the base of Triangle");
        System.out.println("Enter the height of Triangle");
        b=s.nextInt();
        h=s.nextInt();
        double area=0.5*b*h;
        System.out.println("Area of Triangle is:"+area);
    } 
}

class Circle extends shape{
     public void printArea(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Radius of Circle");
        b=s.nextInt();
        double area= 3.14*b*b;
        System.out.println("Area of Circle is:"+area);
    }
}

class polygons{
    public static void main(String[] args){
        Rectangle r1=new Rectangle();
        Triangle t1=new Triangle();
        Circle c1=new Circle();
        r1.printArea();
        t1.printArea();
        c1.printArea();
    }
}