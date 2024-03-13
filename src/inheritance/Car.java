package inheritance;

public class Car {
   String Name;
   String Model;
   public  Car(String a, String b){
       Name = a;
       Model = b;
   }
}
class Time extends Car{
    int time;

    public Time(String a, String b, int c) {
        super(a,b);
        time = c;
    }
    public void myMethod1(){
        System.out.println();
    }
}
class Distance extends Time{
    int distance_miles;

    public Distance(String a, String b, int c, int d) {
        super(a, b, c);
        distance_miles = d;
    }
}
class Speed extends Car{
    int miles_per_hr;

    public Speed(String a, String b,int c, int d, int e) {
        super(a, b);
        miles_per_hr = e;
    }
}

class Accelaration extends Speed{
    int j;

    public Accelaration(String a, String b, int c,int d, int e , int f) {
        super(a, b, c, d, e);
        j = f;
    }
}

class Total extends Car{
    public static void main(String[] args) {
        Total t1 = new Total("Ford", "Mustang", 3, 300, 80, 27);
        System.out.println(t1.Name);
        System.out.println(t1.Model);
    }
    public Total(String name, String model, int time_hrs,int total_distance, int miles_per_hr , int accelaration){
        super(name,model);
    }
}

class Praneel{
    public static void main(String[] args){
        Car c1 = new Car("o","p");
    }
}