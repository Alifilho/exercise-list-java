package listas.Lista3;
import java.util.Scanner;
public class Ex01i {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] i9 = new String[10];
        String[] i9_busca = new String[10];

        for (int i = 0; i < i9.length; i++) {
             System.out.println("i9(" + (i+1) + "):");
             i9[i] = sc.next();
         }
        System.out.println("=-=-=-=-=-=-=-=-");

        for (int j = 0; j < i9_busca.length; j++) {
             System.out.println("i9_busca(" + (j+1) + "):");
             i9_busca[j] = sc.next();
             String procurar = i9_busca[j];
             for (int i = 0; i < i9.length; i++) {
                 if(i9[i].equals(i9_busca[j])){
                     System.out.println("O Valor: " + procurar + " existe no índice: " + i9[i] + " do array i9");
                 }
             }
         }
         System.out.println("out");
    }
}
