package polymorphism;

public class CompileEx { // Compile Time Polymorphism.
    public static void main(String[] args) {
        CompileEx a1 = new CompileEx();
        System.out.println(a1.shape(12.5f, 24.5f) + " " + a1.shape(13.7f) + " " + a1.shape(4.5f, 5.3f, 7.13f));
    }

    public float shape(float breadth, float height) {
        return (0.5f * breadth * height);
    }

    public float shape(float side) {
        return (side * side);
    }

    public float shape(float length, float breadth, float height) {
        return (length * breadth * height);
    }
}
//overloading