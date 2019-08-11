package listas.Lista4;
import java.util.Scanner;
public class Ex01l {
    public static String quadradoPerfeito(double num){
        double raiz = Math.sqrt(num);

        int raizint = (int) raiz;

        if(raizint == raiz){
            return "Quadrado perfeito";
        } else {
            return "Quadrado imperfeito";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        String quadrado = quadradoPerfeito(sc.nextDouble());
        System.out.println(quadrado);
    }
}
