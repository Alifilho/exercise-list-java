package listas.Lista4;
import java.util.Scanner;
public class Ex01a_b {
    public static void mostraResultado(String msg) {
        System.out.println("Mensagem");
        System.out.println(msg);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Mensagem da Função: ");
        mostraResultado(sc.next());
    }
}
