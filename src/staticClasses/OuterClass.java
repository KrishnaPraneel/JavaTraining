package staticClasses;

public class OuterClass {
    private int num = 6;
    public class InnerClass{
        public int getNumber() {
            return num;
        }
    }
    public void def(){
        class MethodInnerClass{

        }
    }
    public static void main(String[] args) {
        OuterClass o1 = new OuterClass();
        OuterClass.InnerClass i1 = o1.new InnerClass();
        System.out.println(i1.getNumber()); AnonymousInnerClass aic = new AnonymousInnerClass() {
            @Override public void testMethod() { System.out.println("This is Anonymous Inner Class"); } }; aic.testMethod(); } } abstract class AnonymousInnerClass{ public abstract void testMethod(); }
