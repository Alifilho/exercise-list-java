package listas.Lista3;
import java.util.Random;
public class Ex01h {
    public static void main(String[] args) {
        Random rand = new Random();
        
        int[] h9 = new int[100];

        for (int i = 0; i < h9.length; i++) {
            int aleatorio = rand.nextInt(10) + 1;
            h9[i] = aleatorio;
        }
        for (int j = 0; j < h9.length; j++) {
            if (h9[j] == 5) {
                System.out.println("H9 " + j + " possui valor 5");
            }
        }
    }
}
