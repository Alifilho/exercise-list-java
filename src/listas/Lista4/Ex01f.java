package listas.Lista4;
import java.util.Scanner;
public class Ex01f {
    public static String concatena(String a1, String a2) {
        String a3 = a1 + a2;
        return a3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String uniao = concatena (sc.next(), sc.next());
        System.out.println(uniao);
    }
}
