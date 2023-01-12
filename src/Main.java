import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Object o = new Scanner(System.in);



        Scanner scanner = null ;


       if (o instanceof Scanner) scanner = (Scanner) o;

       if (scanner != null) {
           scanner.nextInt();
       }


        Object o1 = new String();

        Object o2 = new Integer(15);

    }
}