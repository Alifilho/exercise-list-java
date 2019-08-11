package listas.Lista1;
import java.util.Scanner;
public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int dias1;
        int anos1;
        int resto1;
        int meses1;
        int diass;

        System.out.println("Digite sua idade em dias");
        dias1 = sc.nextInt();
        anos1 = dias1 / 365;
        resto1 = dias1 % 365;
        meses1 = resto1 / 30;
        diass = resto1 % 30;

        System.out.println("Voce tem " + anos1 + " anos, " + meses1 + ", meses e "
                + diass + " dias");
    }
}
