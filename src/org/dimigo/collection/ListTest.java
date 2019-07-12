package org.dimigo.collection;

import org.dimigo.inheritance.Dog;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ListTest {
    public static void main(String[] args){
        // LIST 계열 : ArrayList
//        List list = new ArrayList();
//        list.add("문의영");
//        list.add(100);
//        list.add(new Dog("멍멍이"));
//        String s= (String)list.get(0);
//
        //제네릭(Generic)
        List<String> list = new ArrayList(10);
        /*List<Integer> ilist = new ArrayList();
        ilist.add(10);
        ilist.add(20);
        ilist.add(30);
        ilist.add(40);
        ilist.add(50);
        ilist.remove(30);
        */
        list.add("사과");
        list.add("배");
        list.add("딸기");
        list.add("딸기");
        list.add(1,"포도");
        list.set(2, "바나나");
        printList(list);
        System.out.println(list.get(0));
        System.out.println(list.get(list.size()-1));

        list.remove(0);
        printList(list);
        list.clear();
        printList(list);

    }

    private static void printList(List<String> list) {
        for(String value : list){
            System.out.print(value+ " | ");
        }
        System.out.println();

    }
}
