package be.intecbrussel.exercises;

import java.util.*;
import java.util.stream.IntStream;

public class ListEx1App {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        System.out.println("Please enter 5 numbers: ");

        List<Integer> numbers = new LinkedList<>();
        numbers.add(0, kbd.nextInt());
        numbers.add(1, kbd.nextInt());
        numbers.add(2, kbd.nextInt());
        numbers.add(3, kbd.nextInt());
        numbers.add(4, kbd.nextInt());

        for(int i = 0; i < numbers.size(); i++){
            System.out.println(numbers.get(i));

        }
        System.out.println();

        int sum = numbers.stream()
                        .mapToInt(a -> a)
                                .sum();

            System.out.println("The sum of the numbers is: " + sum);

        OptionalDouble avg = numbers.stream()
                .mapToDouble(a -> a)
                .average();
        System.out.println("The average of the numbers is: " + avg);




        System.out.println("Please enter a sentence, ending in a '.':");
        List<String> sentence = new ArrayList<>();
        int i = 0;
        do{
        sentence.add(0, kbd.next());
        }while (sentence.get(i).contains(".") == false);

        /*for(i = sentence.size()-1; i != 0; i--) {
            System.out.println(sentence.get(i));
        }*/

        IntStream numWords = sentence.stream()
                .mapToInt(a -> Integer.parseInt(a));
        System.out.println(sentence.stream().count());


        String[] newSentence = sentence.toArray(new String[sentence.size()]);
        for(String word : newSentence){
            System.out.println(word);
        }


    }
}
