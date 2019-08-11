package listas.Lista1;
import java.util.Scanner;
public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int anos;
        int meses;
        int dias;
        System.out.println("Digite seus anos de idade");
        anos = sc.nextInt();
        System.out.println("Digite quantos meses de idade do seu ultimo aniversario");
        meses = sc.nextInt();
        System.out.println("Digite o dia de hoje");
        dias = sc.nextInt();

        int diasanos;
        diasanos = anos * 365;
        int diasmeses;
        diasmeses = meses * 30;
        int diasgeral;
        diasgeral = diasanos + diasmeses + dias;

        System.out.println("Você tem " + diasgeral + "dias de vida!");
    }
}
