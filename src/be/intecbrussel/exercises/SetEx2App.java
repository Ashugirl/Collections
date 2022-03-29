package be.intecbrussel.exercises;

import java.util.*;

public class SetEx2App {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        /*System.out.println("Please enter 5 numbers: ");

        Set<Integer> integerSet = new HashSet<>();
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
            lottery.add(kbd.nextInt());
        }
        System.out.println("Your picks: ");
        for (Integer el : lottery) {
            System.out.println(el);
        }



            int min = 1;
            int max = 45;
            Set<Integer> lotteryDraw = new HashSet<>();
            Random drawer = new Random();
            while (lotteryDraw.size() < 6){
            lotteryDraw.add(drawer.nextInt(max - min) + min);}
        System.out.println("Lottery draw: ");
            for (Integer lot : lotteryDraw) {
                System.out.println(lot);
            }



        }


}