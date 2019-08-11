package listas.Lista4;
import java.util.Scanner;
public class Ex01u {
    public static void fraseTela(String tela, int multi, int som1, int som2){
        System.out.println("qualquer na tela");
        System.out.println(tela);
        System.out.println(multi*10);
        System.out.println(som1 + som2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        fraseTela(sc.next(),sc.nextInt(),sc.nextInt(),sc.nextInt());
    }
}
