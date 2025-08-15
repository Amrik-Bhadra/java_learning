package basics.oops.static_final;

public class StaticDemo {
    static{
        System.out.println("Hello World");
    }
    public static void main(String[] args) {
//        Student s1 = new Student();
//        Student s2 = new Student();
//        Student s3 = new Student();

//        System.out.println(Student.count);
        Student.getStudentCount();
    }
}
