import java.util.Arrays;
import java.util.Random;
public class l2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] a = new int[10];

        for (int i = 0; i < 10; i++) {
            a[i] = rand.nextInt(-100,100);
        }
        System.out.println(Arrays.toString(a));
        int max = a[0];
        for (int element : a){
            if (element > max){
                max = element;
            }
        }
        System.out.println(max);

    }
}