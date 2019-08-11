package listas.Lista2;
import java.util.Scanner;
public class Ex05m {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(num1 + "^" + num2 + " = " + (Math.pow(num1, num2)));

    }
}
