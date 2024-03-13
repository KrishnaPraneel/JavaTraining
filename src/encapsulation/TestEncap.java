package encapsulation;

import encapsulation.EncapExample;

public class TestEncap {
    public static void main(String[] args){
        EncapExample e1 = new EncapExample("krishna",22,"Jersey City");
        System.out.println(e1.getName());
        EncapExample e2 = new EncapExample("Mahesh",30,"Jersey");
        System.out.println(e2.getName());

    }
}
