package listas.Lista2;
import java.util.Scanner;
public class Ex01a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nome: ");
        String nome = sc.next();
        if(nome.equals("Maria")) {
            System.out.println("Sala 20");
        } else if (nome.equals("Pedro")) {
            System.out.println("Sala 21");
        } else if (nome.equals("Juliana")) {
            System.out.println("Coordenação");
        } else {
            System.out.println("Erro");
        }
    }
}
