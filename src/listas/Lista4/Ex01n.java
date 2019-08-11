package listas.Lista4;
import java.util.Scanner;
public class Ex01n {
    public static int[][] subMatriz(int[][] matriz1, int[][] matriz2){
        int[][] sub = new int[2][2];
        
        for(int i = 0; i < sub.length; i++) {
            for(int j = 0; j < sub[i].length; j++) {
               sub[i][j] = matriz1[i][j] - matriz2[i][j];
            }
        }
        return sub;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz1 = new int[2][2];
        int[][] matriz2 = new int[2][2];
        for(int i = 0; i < matriz1.length; i++) {
            for(int j = 0; j < matriz1[i].length; j++) {
                System.out.println("Digite a " + "[" + (i+1) + "] " + "[" + 
                (j+1) + "] " + "casa: ");
                matriz1[i][j] = sc.nextInt();
            }
        }
        
        for(int i = 0; i < matriz2.length; i++) {
            for(int j = 0; j < matriz2[i].length; j++) {
                System.out.println("Digite a " + "[" + (i+1) + "] " + "[" + 
                (j+1) + "] " + "casa: ");
                matriz2[i][j] = sc.nextInt();
            }
        }

        int[][] subPrint = subMatriz(matriz1, matriz2);
        
        System.out.println("");
        
        for(int i = 0; i < subPrint.length; i++) {
            for(int j = 0; j < subPrint[i].length; j++) {
                System.out.print(subPrint[i][j] + " ");
            }
            System.out.println("");
        }

    }
}
