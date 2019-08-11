package listas.Lista4;
import java.util.Scanner;
public class Ex01k {
    public static boolean testeNumeroPrimo(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;   
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Teste de número primo: ");
        boolean testePrimo = testeNumeroPrimo(sc.nextInt());
        System.out.println("O número é primo: " + testePrimo); 
    }
}
