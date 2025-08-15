package basics.oops.static_final;

public class Student {
    public static int count = 0;
    public static String collegeName = "MIT AOE";
    private int age;
    private String name;

    public Student(){
        count++;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName(){
       return this.name;
    }

    public static void getStudentCount(){
        System.out.println("Total Students: " + count);
    }
}
