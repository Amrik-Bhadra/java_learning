import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Student {
    private String name;
    private float cgpa;

    Student(String name, float cgpa){
        this.name = name;
        this.cgpa = cgpa;
    }

    public String getName() { return this.name; }
    public float getCgpa() { return this.cgpa; }
}
public class P3_Comparator_Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Charlie", 9.67f ));
        students.add(new Student("Lambda", 9.21f ));
        students.add(new Student("Alpha", 9.68f ));
        students.add(new Student("Bravo", 8.67f ));
        students.add(new Student("Delta", 9.21f ));

        // students.sort((s1, s2) -> (s2.getCgpa() - s1.getCgpa() > 0) ? 1 : -1);

        // method 2:
        // Comparator<Student> comparator = Comparator.comparing(Student::getCgpa).reversed();

        // first compare based on cgpa, if both same, then compare based on names
        Comparator<Student> comparator = Comparator.comparing(Student::getCgpa)
                                                   .reversed()
                                                   .thenComparing(Student::getName);
        students.sort(comparator);

        for(Student student: students){
            System.out.println(student.getName() + "\t\t" + student.getCgpa());
        }
    }
}
