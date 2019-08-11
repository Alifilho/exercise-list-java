package listas.Lista2;
import java.util.Scanner;
public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Resp: ");
        int num = sc.nextInt();

        switch (num) {
            case 10:
                System.out.println(num * 2);
                break;
            case 25:
                System.out.println(num * 3);
                break;
            case 50:
                System.out.println(num * 4);
                break;
            default:
                System.out.println(num);
                break;
        }

        System.out.println("Resp 2: ");
        int num2 = sc.nextInt();

        switch (num2) {
            case 0:
                String nv = "Nenhuma Vez";
                break;
            case 1:
                String uv = "Uma Vez";
                break;
            case 2:
                String dv = "Duas Vezes";
                break;
            case 3:
                String tv = "Trêz Vezes";
                break;
            default:
                String ov = "Outras Vezes";
                break;
        }
    }
}
