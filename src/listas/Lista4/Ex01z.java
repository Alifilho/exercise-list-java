package listas.Lista4;

import java.util.Random;
import java.util.Scanner;

public class Ex01z {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite algo: ");
        String var = sc.next();
        
        int a = var.length();
        
        String ast = "-";
        
        for (int i = 0; i <= a; i++) {
            ast += "-";
        }
        
        System.out.println("*" + ast + "*");
        System.out.println("* " + var + " *");
        System.out.println("*" + ast + "*");
    }
}
