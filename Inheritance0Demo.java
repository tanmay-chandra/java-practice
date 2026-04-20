class Vehicle{
    void start(){
        System.out.println("vehicle starts");
    }
}
class Car extends Vehicle{
    void drive(){
        System.out.println("car drives");
    }
}
public class Inheritance0Demo{
    public static void main(String[]args){
        Car c=new Car();
        c.start();
        c.drive();
    } 
}
