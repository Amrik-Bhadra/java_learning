import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class P4_LinkedList_Basics {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);

        System.out.println(linkedList);

        linkedList.addFirst(100);  // O(1)
        linkedList.addLast(300);   // O(1)

        System.out.println(linkedList);

        linkedList.remove(2);
        System.out.println(linkedList);

        System.out.println(linkedList.get(2));
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        System.out.println(linkedList.size());
        linkedList.set(3, 999);
        System.out.println(linkedList);

        linkedList.removeIf(x -> x % 2 == 0);
        System.out.println(linkedList);


        LinkedList<String> animals = new LinkedList<>(Arrays.asList("Cat", "Dog", "Cheetah", "Lion", "Jackals"));
        List<String> removeAnimals = Arrays.asList("Dog", "Lion");
        animals.removeAll(removeAnimals);
        System.out.println(animals);
    }
}
