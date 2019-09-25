package sample;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
        ArrayList<Starter> starter =new ArrayList<Starter>();
     Starter s = new Starter("1 Mushroom Soup",4.50);
     Starter s1 = new Starter("2 Ceaser Salad",5.00);
    starter.add(s);
     starter.add(s1);


     ArrayList<MainCourse> main =new ArrayList<MainCourse>();
     MainCourse m1 = new MainCourse("3 pizza",7.25);
     MainCourse m2 = new MainCourse("4 Burger",4.25);
     MainCourse m3 = new MainCourse("5 Chicken",7.25);
     main.add(m1);
     main.add(m2);
     main.add(m3);


     ArrayList<Dessert> Dessert =new ArrayList<Dessert>();
     Dessert d1 = new Dessert("6 ice cream",2.50);
     Dessert d2 = new Dessert("7 crepe",3.00);
     Dessert.add(d1);
     Dessert.add(d2);


     ArrayList<Drink> Drinks =new ArrayList<Drink>();
     Drink d3 = new Drink("8 Mango",3.00);
     Drink d4 = new Drink("9 Orang",3.00);
     Drink d5 = new Drink("10 Cola",2.00);
     Drinks.add(d3);
     Drinks.add(d4);
     Drinks.add(d5);


     //_____________________________________
     System.out.println("Welcome to Tasty Resturant");
     System.out.println("This is our Menu");

     System.out.println();
    System.out.println("/********************/");
     System.out.println("Starter");
     for(Starter start: starter){
         System.out.println(start.name+"   "+start.price+" $");
     }
     System.out.println();
     System.out.println("Main Course");
     for(MainCourse mainCourse: main){
         System.out.println(mainCourse.name+"   "+mainCourse.price+" $");
     }
     System.out.println();
     System.out.println("Dessert");
     for (Dessert des:Dessert){
         System.out.println(des.name+"    "+des.price+" $");
     }
     System.out.println();
     System.out.println("Drinks");
     for (Drink dr:Drinks){
         System.out.println(dr.name +"     "+dr.price+" $");
     }  System.out.println("/********************/");

     ArrayList<Menu> Order =new ArrayList<Menu>();
     System.out.println("write 'm'+ the number of the dish you want ,and if you dont want any thing write ( x ): ");

     Scanner scanner = new Scanner(System.in);
     boolean exit=false;
     double total=0;

     do{
         String o = scanner.next();
         switch (o) {
             case "m1":
                 total = total + s.price;
                 Order.add(s);
                 break;

             case "m2":

                 total += s1.price;
                 Order.add(s1);
                 break;

             case "m3":
                 total += m1.price;
                 Order.add(m1);
                 break;

             case "m4":
                 total += m2.price;
                 Order.add(m2);
                 break;

             case "m5":
                 total += m3.price;
                 Order.add(m3);

             case "m6":
                 total += d1.price;
                 Order.add(d1);
                 break;

             case "m7":
                 total += d2.price;
                 Order.add(d2);
                 break;

             case "m8":
                 total += d3.price;
                 Order.add(d3);
                 break;

             case "m9":
                 total += d4.price;
                 Order.add(d4);
                 break;

             case "m10":
                 total += d5.price;
                 Order.add(d5);
                 break;


             case "x":
                 exit = true;
                 break;

             default:
                 System.out.println("Wrong number ,choose again");
                 break;
         }
     }while (exit==false);
     System.out.println("You have orderd : ");
     for (Menu ord: Order ){
         System.out.println(ord.name+"    "+ord.price+" $");
     }
     System.out.print("The Total price is : " +total+" $");
    }
}
