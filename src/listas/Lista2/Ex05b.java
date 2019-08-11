package listas.Lista2;
import java.util.Random;
public class Ex05b {
    public static void main(String[] args) {
        Random rand = new Random();
    
        for(int i = 0; i < 5; i++) {
            int n = rand.nextInt(100);
            if(n % 2 == 0) {
                System.out.println(n + ": Número Par");
            }
            else {
                System.out.println(n + ": Número Ímpar");
            }
        }
    }
}
