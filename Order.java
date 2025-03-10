/***********************************
 *project Order
 *programmer Darwin
 *Date 3/10/25
 *program name  Order.java
 ***********************************/
import java.util.*;
public class Order {
    public static void main(String[]args) {
    int burgers;
    int fries;
    int sodas;
    double Bprice;
    double Fprice;
    double Sprice;
    int name;
    double total;
    double tax;
    double total1;
    double paid;
    double change;
    Scanner input1 = new Scanner(System.in);
    System.out.println("Enter the number of burgers: ");
    burgers = input1.nextInt();
    Scanner input2 = new Scanner(System.in);
    System.out.println("Enter the number of fries: ");
    fries = input2.nextInt();
    Scanner input3 = new Scanner(System.in);
    System.out.println("Enter your number of sodas: ");
    sodas = input3.nextInt();
    Bprice = burgers*1.69;
    Fprice= fries*1.09;
    Sprice= sodas*0.99;
    total = Bprice+Fprice+Sprice;
    tax = total*0.085;
    total1 = total + tax;
    System.out.println("Total before tax: $"+total);
    System.out.println("Tax: $"+tax);
    System.out.println("Final Total: $"+total1);
    Scanner input4 = new Scanner(System.in);
    System.out.println("Enter the amount tendered: ");
    paid = input4.nextInt();
    change = paid - total1;
    System.out.println("Change: $"+change);






    }


}
