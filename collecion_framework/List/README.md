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
