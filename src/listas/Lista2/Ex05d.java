package listas.Lista2;
import java.util.Scanner;
public class Ex05d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int val2 = sc.nextInt();
        if(val2 % 2 == 0) {
            System.out.println("Valor Par");
        } else {
            System.out.println("Valor Ímpar");
        }
    }
}
