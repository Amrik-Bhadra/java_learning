package basics.strings;
public class StringsDemo {
    public static void main(String[] args) {
        String name = "Amrik";                                   // goes to string pool
        String s1 = new String("Amrik");                  // creates new memory in heap and store "Amrik" there
        String s2 = new String(name);                            // creates new memory in heap and store "Amrik" there
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));
        System.out.println((s1 == s2));                          // false
        System.out.println(s1.equals(s2));                       // true

        String s3 = "Amrik";                                     // since "Amrik" already present in string pool therefore s3 points to name in memory
        String s4 = "Amrik";                                     // since "Amrik" already present in string pool therefore s4 points to name in memory
        System.out.println(System.identityHashCode(s3));
        System.out.println(System.identityHashCode(s4));
        System.out.println(s3 == s4);                            // true
        System.out.println(s3.equals(s4));                       // true

    }

}
