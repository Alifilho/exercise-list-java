package listas.Lista2;
import java.util.Scanner;
public class Ex01c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Resp 2: ");
        int num2 = sc.nextInt();
        if (num2 == 0) {
            String nv = "Nenhuma Vez"; 
        } else if (num2 == 1) {
            String uv = "Uma Vez";
        } else if (num2 == 2) {
            String dv = "Duas Vezes";
        } else if (num2 == 3) {
            String tv = "Trêz Vezes";
        } else {
            String ov = "Outras Vezes";
        }
    }
}
