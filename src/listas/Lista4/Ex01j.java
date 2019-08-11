package listas.Lista4;
import java.util.Scanner;
public class Ex01j {
    public static boolean operacoes(boolean bool1, boolean bool2, String resp) {
        boolean operacao = true;
        if(resp.equals("OU")) {
            operacao = bool1 || bool2;
        } else if(resp.equals("E")) {
            operacao = bool1 && bool2;
        } else {
            System.out.println("Erro: insira OU ou E");
        }
        return operacao;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Insira os dois boleanos e a operação desejada: ");
        boolean printOperacoes = operacoes(sc.nextBoolean(), sc.nextBoolean(), sc.next());
        System.out.println(printOperacoes);
    }
}
