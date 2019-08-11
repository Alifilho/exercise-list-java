package listas.Lista4;
import java.util.Scanner;
public class Ex01s {
    public static double taxaJuros(float valorEmReal, float juros){
        valorEmReal = valorEmReal * (juros/100);

        return valorEmReal;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float valorEmReal;
        float juros;

        System.out.println("Digite a quantia do valor: ");
        valorEmReal = sc.nextFloat();

        System.out.println("Digite o percentual do juros: ");
        juros = sc.nextFloat();

        valorEmReal = (float) taxaJuros(valorEmReal, juros);
        System.out.println(valorEmReal);


    }
}
