package listas.Lista2;
import java.util.Random;
import java.util.Scanner;
public class Ex06c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.println("Sua Advinhação: ");
        int usuario = sc.nextInt();
        int cpu = rand.nextInt(10);
        if(usuario == cpu) {
            System.out.println("Você acertou!");
        } else {
            System.out.println("Você Perdeu!");
        }
    }
}
