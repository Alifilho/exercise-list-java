package listas.Lista4;
import java.util.Scanner;
public class Ex01g {
    public static boolean numeroPar(int num) {
        if(num % 2 == 0) {
            return true;
      	} else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Insira um número: ");
        boolean resultado = numeroPar(sc.nextInt());
        System.out.println("O valor é par? " + resultado);
    }
}
