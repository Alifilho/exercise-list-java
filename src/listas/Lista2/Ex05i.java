package listas.Lista2;
import java.util.Scanner;
public class Ex05i {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nom = sc.next();
        if(nom.equals("Joao")) {
            System.out.println("Sala 202");
        } else if(nom.equals("Silvia")) {
            System.out.println("Sala 18");
        } else {
            System.out.println("Nenhum nome cadastrado");
        }
    }
}
