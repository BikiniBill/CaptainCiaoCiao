package Ausdrücke;

public class Anker_Domino {
    public static void main(String[] args) {
        int brick1, brick2;
        int brick1Side1, brick1Side2, brick2Side1, brick2Side2;
        boolean isSide1, isSide2;

        System.out.print("Brick 1: ");
        brick1 = new java.util.Scanner(System.in).nextInt() % 100;
        System.out.print("Brick 2: ");
        brick2 = new java.util.Scanner(System.in).nextInt() % 100;

        brick1Side1 = brick1 % 10;
        brick1Side2 = (brick1 - brick1Side1) / 10;
        brick2Side1 = brick2 % 10;
        brick2Side2 = (brick2 - brick2Side1) / 10;

        isSide1 = (brick1Side1 == brick2Side1) || (brick1Side1 == brick2Side2);
        isSide2 = (brick1Side2 == brick2Side1) || (brick1Side2 == brick2Side2);

        if (isSide1 || isSide2) {
            System.out.println("Bricks have a common digit.");
        } else {
            System.out.println("Bricks don't have a common digit.");
        }
    }
}
