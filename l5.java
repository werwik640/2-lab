import java.util.Arrays;
import java.util.Random;

public class l5 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] a = new int[10]; //создается массив а из 10 элементов, все из которых по умолчанию будут равны нулю

        for (int i = 0; i < 10; i++) {
            a[i] = rand.nextInt(-100,100);
        }
        System.out.println(Arrays.toString(a));

        int sum = 0;
        for (int element : a) {
            sum += element;
        }
        System.out.println(sum/a.length);


    }
}