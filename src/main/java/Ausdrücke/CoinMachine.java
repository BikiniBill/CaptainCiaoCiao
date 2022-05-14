package Ausdrücke;

import java.util.Scanner;

public class CoinMachine {
    public static void main(String[] args) {
        double moneyAmount = 0.0;
        int count2Eur = 0, count1Eur = 0, count50ct = 0,
                count20ct = 0, count10ct = 0, count5ct = 0, count2ct = 0, count1ct = 0;

        System.out.print("Please enter the amount of money: ");
        moneyAmount = new Scanner(System.in).nextDouble();
        System.out.println("Given amount " + moneyAmount + " Euro can be split into...");

        moneyAmount *= 100;
        count2Eur = ((int) (moneyAmount)) / 200;
        moneyAmount = moneyAmount % 200;
        count1Eur = ((int) (moneyAmount)) / 100;
        moneyAmount = moneyAmount % 100;
        count50ct = ((int) (moneyAmount)) / 50;
        moneyAmount = moneyAmount % 50;
        count20ct = ((int) (moneyAmount)) / 20;
        moneyAmount = moneyAmount % 20;
        count10ct = ((int) (moneyAmount)) / 10;
        moneyAmount = moneyAmount % 10;
        count5ct = ((int) (moneyAmount)) / 5;
        moneyAmount = moneyAmount % 5;
        count2ct = ((int) (moneyAmount)) / 2;
        moneyAmount = moneyAmount % 2;
        count1ct = ((int) (moneyAmount));

        System.out.println(count2Eur + " x 2 Eur");
        System.out.println(count1Eur + " x 1 Eur");
        System.out.println(count50ct + " x 50 Ct");
        System.out.println(count20ct + " x 20 Ct");
        System.out.println(count10ct + " x 10 Ct");
        System.out.println(count5ct + " x 5 Ct");
        System.out.println(count2ct + " x 2 Ct");
        System.out.println(count1ct + " x 1 Ct");
    }
}
