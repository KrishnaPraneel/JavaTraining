package collections.comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
    public static void main(String[] args){
        List<Student> myStudents = new ArrayList<>();
        Student s1 = new Student();
        s1.setName("Praneel");
        s1.setAge(26);
        s1.setId(001);
        Student s2 = new Student();
        s2.setName("Mahesh");
        s2.setAge(35);
        s2.setId(002);
        Student s3 = new Student();
        s3.setName("Gaeya");
        s3.setAge(25);
        s3.setId(003);
        myStudents.add(s3);
        myStudents.add(s1);
        myStudents.add(s2);
        Comparator<Student> sac = new StudentIdComaprator();
        Collections.sort(myStudents, sac);
        myStudents.forEach(student->System.out.println(student.getId()));
    }
}
