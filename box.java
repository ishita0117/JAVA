import java.util.*;
class book
{
public String name;
public String author;
public int price;
public int pages;
    
public void set(){
    System.out.println ("Enter name,author, price and pages of the book");
    Scanner x= new Scanner(System.in);
    name = x.nextLine();
    author = x.nextLine();
    price = x.nextInt ();
    pages = x.nextInt();
}
public void get(){
    System.out.println ("name="+name);
    System.out.println ("author="+author);
    System.out.println ("price="+price);
    System.out.println ("pages="+pages);
}
}

class box{
public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the number of books");
    int no = s.nextInt();
    book a[]=new book[5];
    for (int i=0;i<no; i++)
{
    a[i]=new book();
    a[i].set();
    a[i].get();
}
}

}
