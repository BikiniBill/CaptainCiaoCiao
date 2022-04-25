package ImperativeSprachkonzepte.Variablen_und_Datentypen;

import java.util.Locale;

public class Variablen_und_Wertebereich {
    public static void main(String[] args) {
        /*
        2.2.1 Auf Variablen zugreifen und ausgeben *
         */
        int x = 100, y = 1000;
        double r = 0.0;

        System.out.printf(Locale.US, "<svg height='100' width='1000'>\n" +
                "\t<circle cx='%d' cy='%d' r='%.3f' />\n" +
                "</svg>\n", x, y, r);

        /*
        2.2.2 Wertebereich einhalten *
         */
        int wertebereich = 1000000 * 1000000;
        System.out.println("Wert: " + wertebereich);
        /*
        Der Wertebereich einer Integervariablen ist 2^4 Byte = −2.147.483.648 bis 2.147.483.647.
        Damit ist die Multiplikation außerhalb der oberen Grenze und beginnt von "vorne".
         */

        /*
        2.2.3 Nicht so genau genommen
         */
        System.out.println("10 * 0.1 = " + (10 * 0.1));
        System.out.println("10 * 0.1 - 1.0 = " + ((10 * 0.1) - 1.0));
        System.out.println("0.1 + 0.1 ... + 0.1 - 1.0 = " + (0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1-1.0));
        /*
        Float sind mit Ungenauigkeit behaftet -> somit kommt keine saubere 0 am Schluss raus.
         */

        /*
        2.2.4 Zufallszahlen
         */
        double randomRatio = 10 * Math.random() + 10;
        System.out.println("Random ratio: " + randomRatio);

        System.out.printf(Locale.US, "<svg height='100' width='1000'>\n" +
                "\t<circle cx='%d' cy='%d' r='%.3f' />\n" +
                "</svg>\n", x, y, randomRatio);

        /*
        2.2.6 Benutzereingaben
         */
        System.out.print("Eingabe cx: ");
        x = new java.util.Scanner(System.in).nextInt();
        System.out.print("Eingabe cy: ");
        y = new java.util.Scanner(System.in).nextInt();

        System.out.printf(Locale.US, "<svg height='100' width='1000'>\n" +
                "\t<circle cx='%d' cy='%d' r='%.3f' />\n" +
                "</svg>\n", x, y, randomRatio);

    }
}
