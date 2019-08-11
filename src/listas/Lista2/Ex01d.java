package listas.Lista2;
import java.util.Scanner;
public class Ex01d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final int MENU = 10;
        final int GAME = 11;
        final int PAUSE = 12;
        boolean con = true;

        while(con) {
            System.out.println("Resposta: ");
            int user = sc.nextInt();
            if (user == MENU) {
                System.out.println("Você está no MENU");
                con = false;
            } else if (user == GAME) {
                System.out.println("Você está dentro do GAME");
                con = false;
            } else if (user == PAUSE) {
                System.out.println("GAME pausado");
                con = false;
            }
        }
    }
}
