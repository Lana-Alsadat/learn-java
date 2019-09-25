package sample;

public class Menu {
   String name;
   Double price;
}
class Starter extends  Menu {
    Starter(String name , double price){
        this.name=name;
        this.price=price;
    }

}
class MainCourse extends Menu {
    MainCourse(String name , double price){
        this.name=name;
        this.price=price;
    }
}
 class Dessert extends Menu {
    Dessert(String name , double price){
        this.name=name;
        this.price=price;
    }
}
 class Drink extends Menu {
    Drink(String name , double price){
        this.name=name;
        this.price=price;
    }
}