package listas.Lista2;
import java.util.Scanner;
public class Ex04a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos impostos você deseja calcular?");
        int aux = sc.nextInt();

        String[] nomes = new String[aux];
        double[] valores = new double[aux];

        for (int i = 0; i < aux; i++) {
            System.out.println("Nome do imposto:");
            nomes[i] = sc.next();

            System.out.println("Valor do imposto:");
            valores[i] = sc.nextInt();
        }
        for (int j = 0; j < aux; j++) {
            System.out.println("Imposto " +(j+1)+ ". Nome do imposto: " +nomes[j]+ " || Valor do imposto: R$" +valores[j]);
        }
    }
}
