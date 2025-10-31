class cons
{
public int x;
public int y;
    
cons()
    {
        x=10;
        y=100;
    }
public void print()
    {
      System.out.println("x="+x);
      System.out.println("y="+y);
    }


}
class cons_demo{
public static void main (String[] args) {
    cons c = new cons();
    c.print();
}
}



class cons
{
    public int x;
    public int y;
    
    
    
    
    public void print()
    {
      System.out.println("x="+x);
      System.out.println("y="+y);
    }
}
class Main{
public static void main (String[] args) {
    cons c = new cons();
    c.print();
}
}




class cons
{
    public int x;
    public int y;
    
    cons()
    {
        x=10;
        y=100;
    }
cons(int a,int b)
    {
        x=a;
        y=b;
    }
    
    
    public void print()
    {
      System.out.println("x="+x);
      System.out.println("y="+y);
    }
}
class Main{
public static void main (String[] args) {
    cons c1 = new cons();
    
cons c2 = new cons(50,500);
c1.print();
    c2.print();
}
}


import java.util.*;
class cons
{
    public int x;
    public int y;
    
    cons()
    {
        x=10;
        y=100;
    }
cons(int a,int b)
    {
        x=a;
        y=b;
    }
    
    
    public void print()
    {
      System.out.println("x="+x);
      System.out.println("y="+y);
    }
}
class Main{
public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter any 2 integers");
    int a= s.nextInt();
    int b= s.nextInt();
    cons c1 = new cons();
    
cons c2 = new cons(a,b);
c1.print();
    c2.print();
}
}