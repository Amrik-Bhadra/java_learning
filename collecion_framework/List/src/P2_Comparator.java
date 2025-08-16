import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class NumberComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer a, Integer b){
        return b - a; // for descending order
        // return a - b;  // for ascending order
    }
}

class StringLengthComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2){
        return o1.length() - o2.length();
    }
}

public class P2_Comparator {
    public static void main(String[] args) {
        // List<Integer> list = new ArrayList<>();
        // list.add(34);
        // list.add(21);
        // list.add(10);
        // list.add(89);
        // list.add(56);
        // list.add(90);

        // list.sort(new NumberComparator());   // sort the list in ascending order
        // System.out.println(list);


        List<String> fruits = Arrays.asList("apple", "orange", "banana", "water melon");
        fruits.sort(new StringLengthComparator());
        System.out.println(fruits);



        // or using lambda expression
        List<Integer> list = Arrays.asList(45, 32, 67, 23, 90);
        // list.sort((a, b) -> a - b);
        list.sort((a, b) -> b - a);
        System.out.println(list);
    }
}
