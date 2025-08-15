package basics.wrapper_classes;

public class AutoboxingDemo {
    public static void main(String[] args) {
        // converting primitive data type to wrapper classes
        Integer num = 1;     // behind the scenes: Integer num = Integer.valueOf(1);
        Float pi = 3.14f;
        Character ch = 'A';
        Double amount = 3084.05;


        // convert to binary
        System.out.println(Integer.toBinaryString(5));

        // Returns the value obtained by reversing the order of the bits in the two's complement binary representation of the specified int value.
        System.out.println(Integer.reverse(1234));

        System.out.println(Integer.bitCount(5));
    }

}
