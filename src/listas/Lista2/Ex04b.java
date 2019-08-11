package listas.Lista2;
import java.util.Scanner;
public class Ex04b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Peso: ");
        double peso = sc.nextDouble();
        System.out.print("Altura: ");
        double alt = sc.nextDouble();

        double imc = peso / (alt * alt);
        System.out.println(imc);

        if(imc <= 18.5) {
            System.out.println("Abaixo do Peso");
        } else if(18.5 < imc && imc < 24.9) {
            System.out.println("Peso Normal");
        } else if(25 < imc && imc < 29.5) {
            System.out.println("Sobrepeso");
        } else if(30 < imc && imc < 34.9) {
            System.out.println("Obesidade Grau 1");
        } else if(35 < imc && imc < 39.9) {
            System.out.println("Obesidade Grau 2");
        } else {
            System.out.println("Obesidade Grau 3");
        }

    }
}
