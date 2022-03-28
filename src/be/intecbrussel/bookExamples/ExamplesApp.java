package be.intecbrussel.bookExamples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class ExamplesApp {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add(0, new String("first"));
        list.add(1,new String("second"));
        list.add(2, new String("third"));
        list.add(3, new String("fourth"));

        for(String el : list){
            System.out.println(el);
       // for(int i = 0; i < list.size(); i++){
         //   System.out.println("Element " + i + " : " + list.get(i));
        }
        System.out.println(list.size());
        list.clear();

        List<String> list1 = new ArrayList<>();
        String text = new String("Hello World");
        list1.add(text);
        list1.add(text);
        System.out.println(list1.size());

        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(5);
        System.out.println(list2);
        System.out.println(list2.size());

        Collection<String> list3 = new LinkedList<>();
        list3.add(new String("Blep"));
        list3.add(new String("Mlem"));
        list3.add(new String("Poot"));
        list3.add(new String("Merp"));

        for(String el: list3){
            System.out.println(el);
        }
        System.out.println(list3.size());
        list.clear();

        List<String> list4 = new LinkedList<>();
        list4.add(0, new String("Blep"));
        list4.add(1, new String("Mlem"));
        list4.add(2, new String("Poot"));
        list4.add(3, new String("Merp"));

        for(int i = 0; i<list4.size(); i++){
            System.out.println(list4.get(i));
        }

        List<Integer> numbers = List.of(23, 45, 68, 37, 64, 99);
        numbers.forEach(System.out::println);


    }
}
