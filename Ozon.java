import java.util.Scanner;

public class Ozon {
    public static void main(String[] args) {

        Scanner consol = new Scanner(System.in);

        int a = consol.nextInt();

        if ((a%3 == 0) & (a%5 != 0)) {  //число кратно трем но не кратно пяти
            System.out.println("Fizz");
        } else if ((a%5 == 0) & (a%3 != 0)) {
            System.out.println("Buzz");
        } else if ((a%5 != 0) & (a%3 != 0)) {
            System.out.println(a);
        } else {
            System.out.println("FizzBuzz");
        }
    }
}