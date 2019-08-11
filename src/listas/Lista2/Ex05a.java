package listas.Lista2;
import java.util.Random;
public class Ex05a {
    public static void main(String[] args) {
        Random rand = new Random();
        
        for(int i = 0; i < 20; i++) {
            int n = rand.nextInt(1000);
            System.out.println(n);
        }
    }
}
