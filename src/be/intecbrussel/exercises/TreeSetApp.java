package be.intecbrussel.exercises;

import org.w3c.dom.ls.LSOutput;

import java.util.NavigableSet;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetApp {
    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);
        System.out.println("Please enter five words: ");
        NavigableSet<String> words = new TreeSet<>();
        words.add(kbd.nextLine());
        words.add(kbd.nextLine());
        words.add(kbd.nextLine());
        words.add(kbd.nextLine());
        words.add(kbd.nextLine());

        for(String w : words){
            System.out.println(w);
        }

        System.out.println("First: " + words.pollFirst());
        System.out.println("Last: " + words.pollLast());
    }


}
