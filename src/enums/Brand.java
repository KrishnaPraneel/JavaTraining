package enums;

public enum Brand {
    Toyota("camry"),
    BMW("x5"),
    Nissan("Altima"),
    Bently("Continental GT");
    private String car;
     Brand(String model){
         this.car = model;
    }
    public String getCar(){

         return car;
    }
}
