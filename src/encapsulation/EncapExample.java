package encapsulation;

public class EncapExample {
    private String name;

    private int age;
    private String address;

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public String getAddress(){
        return this.address;
    }
    public EncapExample(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }
}
