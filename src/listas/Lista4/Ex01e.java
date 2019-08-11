package listas.Lista4;
import java.util.Scanner;
public class Ex01e {
    public static int somaRetorno(int num1, int num2) {
        int soma = num1 + num2;
        return soma;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Soma retornável de dois números: ");
        int soma = somaRetorno(sc.nextInt(), sc.nextInt());
        System.out.println(soma);
    }
}
