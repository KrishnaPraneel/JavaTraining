package oops;

public abstract class  University {
     String university_name;

    abstract String provideCertificate(String s1);
}
class Professor extends University {
    private int professor_id;
    private String professor_name;
    private int class_strength;

    public int getProfessor_id() {
        return professor_id;
    }

    public void setProfessor_id(int professor_id) {
        this.professor_id = professor_id;
    }

    public String getProfessor_name() {
        return professor_name;
    }

    public void setProfessor_name(String professor_name) {
        this.professor_name = professor_name;
    }

    public int getClass_strength() {
        return class_strength;
    }

    public void setClass_strength(int class_strength) {
        this.class_strength = class_strength;
    }

    @Override
    String provideCertificate(String s1) {
        return "oops.Student "+s1+" Achieved Java Certification From "+ this.university_name+ " Under oops.Professor "+ this.professor_name;
    }
    String provideCertificate(Professor p1, Student s1){
        String student_name = s1.getStudent_name();
        String professor_name = p1.getProfessor_name();
        return "oops.Student "+student_name+" Achieved Java Certification From "+ p1.university_name+ " Under oops.Professor "+ p1.professor_name;
    }
}
class Student extends Professor {
    private int Student_id;
    private String student_name;
    private int professor_id;

    public Student(int student_id, String student_name, int professor_id) {
        Student_id = student_id;
        this.student_name = student_name;
        this.professor_id = professor_id;
    }

    public int getStudent_id() {
        return Student_id;
    }

    public void setStudent_id(int student_id) {
        Student_id = student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public int getProfessor_id() {
        return professor_id;
    }

    public void setProfessor_id(int professor_id) {
        this.professor_id = professor_id;
    }
}
class TestUniversity {
    public static void main(String[] args){
        Student s1 = new Student(001,"John",2);
        Professor p1 = new Professor();
        p1.setProfessor_id(s1.getProfessor_id());
        p1.setProfessor_name("jones");
        p1.setClass_strength(100);
        p1.university_name= "New Jersey Institute of Technology";
        System.out.println(p1.provideCertificate(s1.getStudent_name()));
        System.out.println(p1.provideCertificate(p1,s1));
    }
}
