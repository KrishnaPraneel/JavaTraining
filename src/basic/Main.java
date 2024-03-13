package basic;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main{
    public boolean checkPrime(int num){
        if (num <= 1){
            return false;
        } else {
            for (int i=2; i<num; i++){
                if (num % i==0){
                    return false;
                }
            }
            return true;
        }

    }
    public static void main(String[] args) {
        Main m = new Main();
        boolean result = m.checkPrime(6);
        if(result){
            System.out.println("is prime");
        } else{
            System.out.println("not a prime");
        }
    }
}