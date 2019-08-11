package listas.Lista1;
import java.util.Scanner;
public class Ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double fab;
        double precf;
        double ipva;
        double lucro;
        System.out.println("Digite o custo da fabrica");
        fab = sc.nextDouble();
        lucro = fab * 0.28;
        ipva = fab * 0.45;
        precf = fab + ipva + lucro;
        System.out.println("O preco final do carro serÃ¡ de: " + precf + "$");
    }
}
