package listas.Lista2;
import java.util.Scanner;
public class Ex05l {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        boolean con = true;
        while(con) {
            int val11 = sc.nextInt();
            int val12 = sc.nextInt();
            if(val11 == 0 || val12 == 0) {
                System.out.println("Por Favor, não digitar 0. Tente novamente");
            } 
            else {
                System.out.println(val11 + " / " + val12 + " = " + 
                (val11 / val12));
                con = false;
            }
        }
    }
}
