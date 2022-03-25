
public class Ab {
    public static void main(String[] args){
        Car a = new Car();
        a.printInfo();
    }
    

}


abstract class Vehicle {

    abstract void printInfo();
}
class Car extends Vehicle{

     void printInfo(){
        System.out.println("This is a car");
    }
}

