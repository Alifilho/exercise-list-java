package listas.Lista2;
import java.util.Scanner;
public class Ex05f {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val4 = sc.nextInt();
        System.out.println("Antecessor: " + (val4 - 1) + " Número: " + val4
                + " e Sucessor: " + (val4 + 1));
    }
}
