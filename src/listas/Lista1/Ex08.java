package listas.Lista1;
import java.util.Scanner;
public class Ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int seg;
        int min;
        int horas;
        System.out.println("Digite o tempo de duraÃ§Ã£o do evento em segundos");
        seg = sc.nextInt();

        min = seg / 60;
        seg = seg % 60;
        horas = min / 60;
        min = min % 60;

        System.out.println("Esse eventom durou " + horas + " horas, " + min + " minutos,"
                + " " + seg + " segundos");
    }
}
