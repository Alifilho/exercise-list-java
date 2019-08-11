package listas.Lista1;
import java.util.Scanner;
public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double p1;
        double p2;
        double p3;
        double media;
        System.out.println("Digite a nota de sua primeira prova(prova de peso 2)");
        p1 = sc.nextDouble();
        System.out.println("Digite a nota de sua segunda prova(prova de peso 3)");
        p2 = sc.nextDouble();
        System.out.println("Digite a nota de sua tercecira prova(prova de peso 5)");
        p3 = sc.nextDouble();

        p1 = p1 * 2;
        p2 = p2 * 3;
        p3 = p3 * 5;

        media = (p1 + p2 + p3) / 10;
        System.out.println(media);
    }
}
