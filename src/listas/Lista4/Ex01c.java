package listas.Lista4;
import java.util.Scanner;
public class Ex01c {
    public static void multiplicaDez(int num) {
        num *= 10;
        System.out.println(num);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Multiplique um número por 10: ");
        multiplicaDez(sc.nextInt());
        
    }
}
