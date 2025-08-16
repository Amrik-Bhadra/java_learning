<img width="1919" height="1079" alt="collections_mind_map" src="https://github.com/user-attachments/assets/5015795b-1994-48d2-a4e8-0cc75b434002" />

# List Interface
- it is part of **java.util** package
- List interface extends **Collection** interface

## Features of List
- provides way to store an **ordered** collection of elements
- **duplicate elements** can be present in list
- **index based** access of elements

## Note
List interface is implemented by several classes in the Java Collection Framework, such as ArrayList, LinkedList, Vector and Stack

---

# ArrayList Class
resizable array implementation of List interface

## How to create ArrayList?
- Method 1: `ArrayList<Integer> arrayList = new ArrayList<>();`
- Method 2: `List<Integer> list = new ArrayList<>();`

## ArrayList Methods:
1. list.add(element)
2. list.get(index)
3. list.size()
4. list.contains(element)  -> true/false
5. list.add(index, element)
6. list.remove(index or element)
7. list.set(index, newValue)
8. list.addAll(collection)

## Print list elements
- Method 1:
  `
    for(int i=0; i<list.size(); i++){
	    System.out.println(list.get(i));
    }
  `

- Method 2:
  `
    forEach(int ele: list){
        System.out.println(ele);
    }
  `

# Note:
- `System.out.println(list)`
    - toString() method is called
    - toString() method is present in AbstractList class which is extends by ArrayList

## How ArrayList works internally?
- arraylist can grow and shrink as elements are added or removed.
- this dynamic resizing is achieved by creating a new array when the current array is full and copying the elements into the new array

    - ### Note:
	    - when you create an arraylist, its inital capacity = **10 (by default)**
	    - capacity of size of internal array, that can hold elements before resizing

        - but we can add initial capacity as per our requirement
          `ArrayList<Integer> list = new ArrayList<>(40);`
          so here initial capacity will be 40 [ not the size ]

    - ### Adding Element:-
        - step1: capacity check
        - step2: resize if necessary: if internal array is full, arraylist will create new array with larger capacity (usually 1.5 times the current capacity) and copy the elements from the old array to the new array
        - step3: add the element

    - ### Resizing the array:-
        - step1: initial capacity check
        - step2: growth factor: 
            - new array created with size 1.5times the old array. 
			- growth factor balances memory efficiency and resizing cost
        - step3: copying elemnts: when resizing occurs, all elements from the old array are copied to the new array, which is an O(n) operation, where n is the number of elements in the arrayList

    - ### Removing Element:-
        - check bounds (index)
        - remove the element
        - reduce the size
        
## Creating list from array:-
- `String[] fruits = { "Apple", "Banana", "Cherry" };
	List<String> fruitList = Arrays.asList(fruits);`

- `List<String> fruitList = Arrays.asList("Apple", "Banana", "Cherry");`

- ### Note: 
    - asList() returns a List<T> not an ArrayList<T>
    - but by this way, a fixed size list is created, in which we cannot add or remove element only replace

- ### using List.of()
    - returns **immutable** List<T>
	- we cant even replace in this
    - eg: `List<Integer> list = List.of(1, 2, 3, 4)`


## List to Array
`Integer[] myArr = list.toArray(new Integer[0]);`
`System.out.println(myArr);`

## Sort the List
- `Collections.sort(list1);`
- `list.sort(null);`   using comparator

## Time Complexity
- access by index --> O(1)
- adding element --> O(n)  in worst case [ resizing ]
- removing element --> O(n) because it may include shifting of elements
- iteration --> O(n)
    
---
# Comparator

- compare two items
- there is a **Comparable** interface which has a `int compare(T o1, T o2)` method
- when this comparator is passed to .sort() with a list, then using the logic of comparasion, list elemnts are arranged in particular order

## Three ways of creating comparator and passing in sort()
1. Creating our comparator class and implementing Comparable<T>
   ```
    class NumberComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer a, Integer b){
            return b - a; // for descending order
            // return a - b;  // for ascending order
        }
    }

    public class Main {
      public static void main(String[] args){
        List<Integer> list = Arrays.asList(32, 12, 45, 21);
        list.sort(new NumberComparator());
        System.out.println(list);
      }
    }
   ```

2. Using Lambda functions

   ```
    public class Main {
      public static void main(String[] args){
        List<Integer> list = Arrays.asList(32, 12, 45, 21);
        list.sort((a, b) -> a - b);
        System.out.println(list);
      }
    }
   ```

3. Using Comparator

   ```
    public class Main {
      public static void main(String[] args){
        List<Student> students = new ArrayList<>();
        students.add(new Student("Charlie", 9.67f ));
        students.add(new Student("Lambda", 9.21f ));
        students.add(new Student("Alpha", 9.68f ));
        students.add(new Student("Bravo", 8.67f ));
        students.add(new Student("Delta", 9.21f ));

        //method 1:
        // students.sort((s1, s2) -> (s2.getCgpa() - s1.getCgpa() > 0) ? 1 : -1);

        // method 2:
        Comparator<Student> comparator = Comparator.comparing(Student::getCgpa).reversed();

        // first compare based on cgpa, if both same, then compare based on names
        Comparator<Student> comparator = Comparator.comparing(Student::getCgpa)
                                                   .reversed()
                                                   .thenComparing(Student::getName);
        students.sort(comparator);
      }
    }
   ```

---

# Linked List
- another implementation class of List
- elements in linkedlist are store in nodes, each node has value and address (address of next node)
- elements are not in contigous memory location

## Types of LinkedList
1. Singly Linkedlist
2. Doubly Linkedlist
3. Circular Linkedlist

### Note:
  - in LinkedList in Collection Framework, uses a `dynamic array` to store elements in `doubly linkedlist`

## Performance Considerations
  - **Insertions & Deletions** in middle is better as it doesnot require shifting of elements
  - **Random Access** is slow as compared to ArrayList as it has to traverse the list from beginning to reach the desired index
  - **Memory Overhead:** LinkedList requires more memory than ArrayList because each node in a linkedlist requires extra memory to store references to the next and previous node

## Create Linkedlist
  ``` LinkedList<Integer> linkedList = new LinkedList<>(); ```
  OR
  ``` List<Integer> linkedList = new LinkedList<>(); ```

## Linkedlist methods
1. list.add(element)
2. list.addLast(element)   --> O(1)
3. list.addFirst(element)  --> O(1)
4. list.get(index)
5. list.getFirst()
6. list.getLast()
7. list.remove(index)
8. list.removeFirst();
9. list.removeLast();
10. list.removeFirstOccurrence(element);
11. list.removeLastOccurrence(element);
12. list.removeAll(collection);
13. list.removeIf(lambda_expression);
14. list.set(index, newValue);

example:
```
  LinkedList<String> animals = new LinkedList<>(Arrays.asList("Cat", "Dog", "Cheetah", "Lion", "Jackals"));
  List<String> removeAnimals = Arrays.asList("Dog", "Lion");
  animals.removeAll(removeAnimals);
  System.out.println(animals);
```

### Note:
- We can use List as reference also `List<Integer> linkedList = new LinkedList<>();`
- but then we cannot use: addFirst(), addLast(), removeFirst(), removeLast()
