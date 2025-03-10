/***********************************
 *project Taxi Application
 *programmer Darwin
 *Date 3/10/25
 *program name  Test_one.java
 ***********************************/
import java.util.*;
public class Test_one {

    public static void main(String[]args) {
    int taxi;
    int passengers;
    int leftover;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number of passengers: ");
    passengers = input.nextInt();
    taxi = passengers/4;
    leftover= passengers%4;
    System.out.println(taxi+" taxis are required");
    System.out.println(leftover+" passengers will be left over");









    }


}