package listas.Lista2;
import java.util.Scanner;
public class Ex05g {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int val5 = sc.nextInt();
        if(val5 % 37 == 0) {
            System.out.println("Valor divisível por 37");
        } else {
            System.out.println("Valor não divisível por 37");
        }
    }
}
