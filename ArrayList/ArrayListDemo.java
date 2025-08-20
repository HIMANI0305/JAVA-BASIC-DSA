package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    // ArrayList<String> list2 = new ArrayList<>();
    // ArrayList<Boolean> list3 = new ArrayList<>();

    list.add(1);
    list.add(3);
    list.add(4);
    list.add(5);
    System.out.println(list);

    // Get an element
    int element = list.get(0);
    System.out.println(element);

    // Add element in between
    list.add(1, 2);
    System.out.println(list);

    // Set element
    list.set(0, 0);
    System.out.println(list);

    // Delete element
    list.remove(0);
    System.out.println(list);

    // Size of list
    int size = list.size();
    System.out.println(size);

    // Loop over list
    for (int i = 0; i < list.size(); i++) {
      System.out.print(list.get(i) + " ");
    }
    System.out.println();

    // Sorting the array list
    list.add(0);
    Collections.sort(list);
    System.out.println(list);
  }
}
