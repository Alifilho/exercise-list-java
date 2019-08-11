package listas.Lista2;
import java.util.Scanner;
public class Ex03d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Res 3: ");
        int user3 = sc.nextInt();
        double quad = Math.sqrt(user3);
        System.out.println(quad);
        int dec = (int) quad;
        if(dec == quad) {
                System.out.println("Número é Quadrado");
        } else {
                System.out.println("Número não Quadrado");
        }
    }
}
