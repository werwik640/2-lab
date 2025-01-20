import java.util.Arrays;
import java.util.Random;

public class l4 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] a = new int[10];

        for (int i = 0; i < 10; i++) {
            a[i] = rand.nextInt(-100,100);
        }
        System.out.println(Arrays.toString(a));
        int element = a[0]; //сохраняет значение первого элемента символа
        a[0] = a[a.length - 1];
        a[a.length - 1] = element;
        System.out.println(Arrays.toString(a));
    }
}