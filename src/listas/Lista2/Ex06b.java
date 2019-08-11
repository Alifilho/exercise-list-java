package listas.Lista2;
import java.util.Random;
import java.util.Scanner;
public class Ex06b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        int val1 = rand.nextInt(10);
        int val2 = rand.nextInt(10);
        System.out.println("Qual a multiplicação de " + val1 + " e " + val2 + ":");
        int resp2 = sc.nextInt();
        if(resp2 == (val1 * val2)) {
            System.out.println("Resposta Correta!");
        } else {
            System.out.println("Erro! A resposta certa era " + (val1 * val2));
        }
    }
}
