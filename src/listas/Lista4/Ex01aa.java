package listas.Lista4;

import java.util.Arrays;
import java.util.Scanner;

public class Ex01aa {
    public static int[] func(int x, int y){
        int i = 0;
        int aux;
        
        if(x > y){
            int j = y;
            i = -1;
            aux = x-y+1;
            int vet[] = new int[aux];
            for (; j <= x; j++) {             
                i++;
                vet[i] = j;
                if(j == x){
                    return vet;
                }
            }
        
        }else{
            int j = x;
            i = -1;
            aux = y-x+1;
            int vet[] = new int[aux];
            for (; j <= y; j++) {
                i++;
                vet[i] = j;
                if(j == y){
                    return vet;
                }
            }
            return vet;
        }
        int[] vet = null;
        return vet;    
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x;
        int y;
        
        System.out.println("Digite o valor de X: ");
        x = sc.nextInt();
        
        System.out.println("Digite o valor de Y: ");
        y = sc.nextInt();
        
        System.out.println(Arrays.toString(func(x, y)));
    }
}
