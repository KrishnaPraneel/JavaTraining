package inheritance;

public class Vehicle1 { // Run time
    public void speed(){
        System.out.print("controlStatements.vehicle speed");
    }
}
class Bus1 extends Vehicle1{
    public void speed(){
        System.out.println("inheritance.Bus Speed");
    }
}
class Aeroplane1 extends Vehicle1{
    public void speed(){
        System.out.println("I fly high");
    }
}

class Truck1{
    public static void main(String[] args){
        Vehicle1 v1 = new Bus1();
        Vehicle1 v2 = new Aeroplane1();
        v1.speed();
        v2.speed();
    }
} // controlStatements.Method overriding