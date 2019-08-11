package listas.Lista2;
import java.util.Scanner;
public class Ex05c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        if(val >= 10) {
            System.out.println("Valor maior que 10");
        } else {
            System.out.println("Valor menor que 10");
        }
    }
}
