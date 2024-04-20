/*Write a Java program to create LinkedList of integer objects and perform the following:
i. Add element at first position
ii. Delete last element
iii. Display the size of link list */

import java.util.*;

class list
{
    public static void main(String[] args) {
        LinkedList<Integer> l=new LinkedList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);

        System.out.println(l);

        l.addFirst(7);
        System.out.println(l);

        l.removeLast();
        System.out.println(l);

        System.out.println(l.size());

    }
}