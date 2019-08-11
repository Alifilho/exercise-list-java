package listas.Lista3;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Ex01n {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        
        int[] n9 = new int[10];
        int[] n9_aleatorio = new int[10];

        for (int i = 0; i < n9.length; i++) {
            System.out.println("leia: " + (i + 1));
            n9[i] = sc.nextInt();
        }
        for (int i = 0; i < n9_aleatorio.length; i++) {
            int alea = rand.nextInt(10);
            if (n9_aleatorio[alea] == 0) {
                n9_aleatorio[alea] = n9[i];
            } else {
                i--;
            }
        }
        System.out.println(Arrays.toString(n9_aleatorio));
    }
}
