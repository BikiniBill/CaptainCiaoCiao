package Ausdrücke;

public class Ausdrücke {
    public static void main(String[] args) {
        /*
        2.3.1 Im Bereich prüfen
         */
        int min = 10, max = 60;
        int between = 40;
        boolean isBetween = between > min && between < max;

        /*
        2.3.2 Beute fair aufteilen
         */
        int numberBottles = 0;
        int numberCrew = 0;
        int bottlesForCrew = 0;
        boolean fairShare = false;

        System.out.println("Number of bottles in total?");
        numberBottles = new java.util.Scanner(System.in).nextInt();
        if (numberBottles % 2 == 0) {
            bottlesForCrew = numberBottles / 2;
        } else {
            bottlesForCrew = numberBottles / 2 + 1;
        }
        System.out.println("Bottles for the captain: " + (numberBottles - bottlesForCrew));
        System.out.println("Bottles for crew members: " + bottlesForCrew);
        System.out.println("Number of crew members? ");
        numberCrew = new java.util.Scanner(System.in).nextInt();
        fairShare = numberCrew % bottlesForCrew == 0;
        System.out.println("Fair share without reminder? " + fairShare);


    }
}
