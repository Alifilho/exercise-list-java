package listas.Lista2;
import java.util.Scanner;
public class Ex03b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Res: ");
        int user = sc.nextInt();
        if (user % 10 == 0) {
            System.out.println("Valor Divisivel por 10");
        } else {
            System.out.println("Valor NÃO Divisível por 10");
        }
    }
}
