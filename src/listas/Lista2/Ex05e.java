package listas.Lista2;
import java.util.Scanner;
public class Ex05e {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        boolean con = true;
        while(con) {
            int val3 = sc.nextInt();
            if(val3 >= 100) {
                System.out.println("Valor maior que 100");
                con = false;
            } else {
                System.out.println("Valor menor que 100");
            }
        }
    }
}
