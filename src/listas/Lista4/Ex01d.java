package listas.Lista4;
import java.util.Scanner;
public class Ex01d {
    public static void soma(int num1, int num2) {
        int soma = num1 + num2;
        System.out.println(soma);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        System.out.print("Soma de dois números: ");
        soma(sc.nextInt(), sc.nextInt());
    }
}
