package listas.Lista2;
import java.util.Scanner;
public class Ex01b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Resp: ");
        int num = sc.nextInt();
        if (num == 10) {
            System.out.println(num * 2);
        } else if (num == 25) {
            System.out.println(num * 3);
        } else if (num == 50) {
            System.out.println(num * 4);
        } else {
            System.out.println(num);
        }
    }
}
