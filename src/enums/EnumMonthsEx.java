package enums;

public class EnumMonthsEx {
    public static void main(String[] args){
        EnumMonthsEx e1 = new EnumMonthsEx();
        e1.myMethod(EnumMonths.january);
    }
    public void myMethod(EnumMonths month){
        int x=0;
        switch (month){
            case january: x=1;
                System.out.println(x);
            break;
            case february: x=2;
            break;
        } System.out.println(month.getMonth());
    }
}
