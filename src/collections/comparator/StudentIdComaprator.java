package collections.comparator;

import java.util.Comparator;

public class StudentIdComaprator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getId(),o2.getId());
    }
}
