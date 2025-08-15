import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class P1_ArrayList_Basics {
    public static void main(String[] args) throws Exception {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);

        // size
        System.out.println("List size: " + list.size());

        // get(index)
        System.out.println("Element at index 2: " + list.get(2));

        // contains
        System.out.println("5 present in list: " + list.contains(5));
        System.out.println("2 present in list: " + list.contains(2));

        // remove(index)
        list.remove(2);
        System.out.println(list);

        // Note
        // list.remove(1); // removes from index 1
        // list.remove(Integer.valueOf(1)); // removes value 1 from list

        // add(index, element)
        list.add(2, 80);

        // add all elements of another list to our array as individual elements
        List<Integer> subList = List.of(100, 200, 300, 400);
        list.addAll(subList);

        // at particular index
        List<Integer> subList2 = List.of(11, 21, 31, 41);
        list.addAll(2, subList2);

        // Iterate
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        System.out.println();

        for (int ele : list) {
            System.out.print(ele + " ");
        }

        //------------------------------------------------------------------------------------------

        List<Integer> list0 = new ArrayList<>();
        System.out.println(list0.getClass().getName()); // java.util.ArrayList

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(list1.getClass().getName()); // java.util.Arrays$ArrayList

        Integer[] arr = { 1, 2, 3, 4, 5 };
        List<Integer> list2 = Arrays.asList(arr);
        System.out.println(list2.getClass().getName()); // java.util.Arrays$ArrayList

        // in list1 and list2 we cannot add or remove elemnt
        // only replace
        list1.set(2, 30);
        System.out.println(list1);

        List<Integer> list3 = List.of(1, 2, 3, 4);
        System.out.println(list3.getClass().getName()); // java.util.ImmutableCollections$ListN

        //-----------------------------------------------------------------------------------------------------

        // List to array

        Integer[] myArr = list.toArray(new Integer[0]);
        System.out.println(myArr);

        //-----------------------------------------------------------------------------------------------------

        // sort the list
        Collections.sort(list1);
        // or
        list1.sort(null);     // sort(Comparator)
        
    }
}
