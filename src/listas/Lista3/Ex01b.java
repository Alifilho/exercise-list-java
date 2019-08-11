package listas.Lista3;
import java.util.Scanner;
public class Ex01b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] b9 = new int[5];
        for (int i = 0; i < 5; i++) {

            System.out.println("Digite o " + (i + 1) + "º valor");
            b9[i] = sc.nextInt();
            sc.nextLine();

        }
        for (int i = 0; i < 5; i++) {
            System.out.print(b9[i] + " ");
            System.out.println(" ");
        }
        System.out.println("fim do ex01/b");
    }
}
