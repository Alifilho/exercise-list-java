package listas.Lista4;
import java.util.Scanner;
public class Ex01i {
    public static double dobroFloat(double num) {
        double dobro = num * 2;
        return dobro;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Didite um Float: ");
        double retornoDobro = dobroFloat(sc.nextDouble());
        System.out.println("O dobro é " + retornoDobro);
    }
}
