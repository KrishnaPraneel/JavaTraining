package polymorphism;

public class RunTimeOffice { // Run Time polymorphism.

    public String method(String position, int salary){

        return (salary +" "+ position);
    }
}
class Manager extends RunTimeOffice{

    public String method(String position, int salary){

        return (salary*2 +" " +position);
    }
}

class CEO extends RunTimeOffice{
    public String method(String position, int salary ){

        return (salary*5 +" "+ position);
    }
}

class Total1 extends RunTimeOffice{
    public static void main(String[] args){
        RunTimeOffice t1 = new RunTimeOffice();
        RunTimeOffice t2 = new Manager();
        RunTimeOffice t3 = new CEO();
        int basic_salary = 20000;
        System.out.println(t1.method("oops.Employee",basic_salary));
        System.out.println(t2.method("polymorphism.Manager",basic_salary));
        System.out.println(t3.method("polymorphism.CEO",basic_salary));
    }
} //Overriding.