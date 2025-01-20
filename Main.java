import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // l21
        Random rand = new Random();
        int[] a = new int[10]; //создает массив из 10 элементов

        for (int i = 0; i < 10; i++) {
            a[i] = rand.nextInt(-100,100);
        }
        System.out.println(Arrays.toString(a));
        int sum = 0;
        for (int element : a) {
            sum += element;
        }

        System.out.println(sum);




    }
}