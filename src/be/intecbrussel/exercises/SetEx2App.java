package be.intecbrussel.exercises;

import java.util.*;

public class SetEx2App {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
       /* System.out.println("Please enter 3 numbers: ");

        int amountOfNumbers = 3;
        Set<Integer> numbers = new HashSet<>();
        int sum = 0;

        while(numbers.size()<3){
            int number = kbd.nextInt();
            sum+=number;
            numbers.add(number);
        }

        for (Integer i : numbers){
            System.out.println(i);
        }*/
       /* Set<Integer> integerSet = new HashSet<>();
        integerSet.add(kbd.nextInt());
        integerSet.add(kbd.nextInt());
        integerSet.add(kbd.nextInt());
        integerSet.add(kbd.nextInt());
        integerSet.add(kbd.nextInt());

        for(Integer i : integerSet){
            System.out.println(i);
        }

         */

        System.out.println("Please enter 6 different numbers [1-45]: ");

        Set<Integer> lottery = new LinkedHashSet<>();
        //Set<Integer> lottery = new HashSet<>();
        while (lottery.size() < 6) {
            try {
                int number = kbd.nextInt();
                if (number > 0 && number <= 45) {
                    lottery.add(number);
                } else {
                    System.out.println("Please enter a number between 1 and 45.");
                }
            } catch (InputMismatchException e) {
                System.out.println();
                System.out.println("Please enter a valid number between 1 and 45.");
            }

        }
        System.out.println("Your picks: ");
        for (Integer el : lottery) {
            System.out.println(el);
        }


        //int min = 1;
        //int max = 45;
        Set<Integer> lotteryDraw = new HashSet<>();
        Random drawer = new Random();
        while (lotteryDraw.size() < 6) {
            //lotteryDraw.add(drawer.nextInt(max - min) + min);}
            int lotterNums = drawer.nextInt(45) + 1;
            System.out.println("Lottery draw: ");
            lotteryDraw.add(lotterNums);
            for (Integer lot : lotteryDraw) {
                System.out.println(lot);
            }
            Set<Integer> winningNumbers = new HashSet<>(lottery);
            winningNumbers.retainAll(lotteryDraw);
            System.out.println("You got this many numbers correct: " + winningNumbers.size());
            System.out.println("The numbers that were correct: ");
            winningNumbers.forEach(System.out::println);


        }


    }
}