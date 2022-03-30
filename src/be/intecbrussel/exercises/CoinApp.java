package be.intecbrussel.exercises;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class CoinApp {
    public static void main(String[] args) {
        int subtotal= 0;
        double total = 0;

        Map<Coin, Integer> coinPurse = new LinkedHashMap<>();
        coinPurse.put(Coin.ONE_CENT, 5);
        coinPurse.put(Coin.TWO_CENT, 2);
        coinPurse.put(Coin.FIVE_CENT, 3);
        coinPurse.put(Coin.TEN_CENT, 4);
        coinPurse.put(Coin.TWENTY_CENT, 2);
        coinPurse.put(Coin.FIFTY_CENT, 3);
        coinPurse.put(Coin.ONE_EURO, 1);
        coinPurse.put(Coin.TWO_EURO, 3);

        for(Coin c : coinPurse.keySet()){
            System.out.println("Number of " + c + " coins: " + coinPurse.get(c));

        }
        System.out.println();

        for(Coin c : coinPurse.keySet()){
            subtotal = c.getVALUE() * coinPurse.get(c);
            total = total + subtotal;


        }
        System.out.println("Total value of coins in purse: " + total/100);




    }
}
