package listas.Lista4;
import java.util.Scanner;
public class Ex01m {
    public static int[][] somaMatriz(int[][] matriz1, int[][] matriz2){
        int[][] soma = new int[2][2];
        
        for(int i = 0; i < soma.length; i++) {
            for(int j = 0; j < soma[i].length; j++) {
                soma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
            return soma;
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
        
        int[][] somaPrint = somaMatriz(matriz1, matriz2);
        System.out.println("");
        
        for(int i = 0; i < somaPrint.length; i++) {
            for(int j = 0; j < somaPrint[i].length; j++) {
                System.out.print(somaPrint[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
