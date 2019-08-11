package listas.Lista2;
import java.util.Scanner;
public class Ex06a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Em que ano o Brasil foi descoberto: ");
        int resp = sc.nextInt();
        if(resp == 1500) {
            System.out.println("Você Acertou!");
        } else {
            System.out.println("Você Errou!");
        }
    }
}
