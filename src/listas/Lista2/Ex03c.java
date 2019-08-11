package listas.Lista2;
import java.util.Scanner;
public class Ex03c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num;
        int div = 0;
        System.out.println("Digite um numero");
        num = sc.nextInt();
        if(num == 1) {
            System.out.println("O numero " + num + " é primo");
        }
        for(int i = 1; i <= num; i++) {
            if(num % i == 0){
                div++;
            }
        }
        if(div == 2) {
           System.out.println("O numero " + num + " é primo");
        } else {
           System.out.println("O numero " + num + " nao é primo");
        }
    }
}
