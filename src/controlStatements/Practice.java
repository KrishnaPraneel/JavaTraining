package controlStatements;

public class Practice{
    public static void main(String[] args){
        System.out.println("Hello world");
        System.out.println("My basic.name is Krishna Praneel");
    }
}
class DataTypes{
    public static void main(String[] args){
        String name = "Mahesh";
        int age = 35;
        System.out.println(name+" "+age);
    }

}

class Variable{
    public static void main(String[] args){
        int a = 7;
        double b = 2.5;
        char c = 'D';
        Boolean d = true;
        String e = "John";
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }

}

class Operators{
    public static void main(String[] args){
        int a = 3;
        int b = 4;
        int add = a+b;
        int subtract = a-b;
        int Multiply = a*b;
        int Divide = a%b;
//        System.out.print(add);
//        System.out.print(subtract);
//        System.out.print(Multiply);
//        System.out.print(Divide);
    }
}

class StringTypes{
    public static void main(String[] args){
        String txt = "I am a robot";
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());
        System.out.println(txt.indexOf("robot"));
    }
}

class sqrt{
    public static void main(String[] args){
        System.out.println(Math.sqrt(64));
        int x = 23;
        int y = 30;
        System.out.println(Math.max(x,y));
        System.out.println(Math.min(x,y));
        System.out.println(Math.random());
    }
}

class boolen{
    public static void main(String[] args){
        int x = 10;
        int y = 9;
        System.out.println(x>y);// return true as 10 is greater than 9
    }
}

class Ifelse{
    public static void main(String[] args){
        int x = 10;
        int y = 12;
        if(x>y){
            System.out.println("x is greater than y");
        } else{
            System.out.println("x is smaller then y");
        }

    }
}

class While {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }
    }
}

class For{
    public static void main(String[] args){
        for(int i=0; i<5; i++){
            System.out.println(i);
        }
    }
}

class Break{
    public static void main(String[] args) {
        int i;
        for (i = 0; i < 10; i++) {
            if (i == 6) ;
            break;
        }System.out.print(i);
    }
}

class Continue{
    public static void main(String[] args){
        int i;
        for (i = 0; i<10; i++){
            if (i==2);
            continue;
        }System.out.println(i);
    }
}

class Method{
     static void myMethod() {
         int x = 20;
         int y = 30;
         int z = (x + y);
         System.out.println(z);
     }
    public static void main(String[] args){
        myMethod();
    }
}

class vehicle{
    int tyres;
    String vehicleType;
    int seats;
    public vehicle(int x,int y,String z){
        tyres = x;
        seats = y;
        vehicleType = z;
    }
    public static void main(String[] args){
        vehicle v1 = new vehicle(2,2,"bike");
        System.out.println(v1);
        System.out.println(v1.tyres+""+v1.seats+""+v1.vehicleType);
        v1.tyres =2;
        v1.seats = 2;
        v1.vehicleType = "Bike";
        System.out.println(v1.tyres+""+v1.seats+""+v1.vehicleType);
        v1.manufacturer = "Tata";
    }
    static{
        System.out.println("hi");
    }
    static String manufacturer= "we";
}