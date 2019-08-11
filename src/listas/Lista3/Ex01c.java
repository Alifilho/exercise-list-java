package listas.Lista3;
import java.util.Scanner;
public class Ex01c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] c9 = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o " + (i + 1) + "º valor");
            c9[i] = sc.next();
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(c9[i] + " ");
        }
        System.out.println("fim do ex01/c");
    }
}
