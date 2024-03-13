package inheritance;

public class Vehicle {
    public void speed(){
        System.out.print("controlStatements.vehicle speed");
    }
}
class Bus extends Vehicle{
    public void speed(){
        System.out.println("inheritance.Bus Speed");
    }
}
class Aeroplane extends Vehicle{
    public void speed(){
        System.out.println("I fly high");
    }
}

class Truck{
    public static void main(String[] args){
        Vehicle v1 = new Bus();
        Vehicle v2 = new Aeroplane();
        v1.speed();
        v2.speed();
    }
}