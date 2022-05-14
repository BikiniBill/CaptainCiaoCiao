public class Test {
    public static void main(String[] args) {
        /*
        2.3.7 Der Nulleffekt
         */
        int zero = 0;
        int ten = 0;
        double anotherten = 10;
        System.out.println(anotherten/zero); // double can be divided by zero -> infinity
        System.out.println(ten/zero); // throws exception


    }
}
