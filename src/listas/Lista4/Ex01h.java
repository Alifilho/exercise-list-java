package listas.Lista4;
import java.util.Arrays;
import java.util.Scanner;
public class Ex01h {
    public static int[] ordenar(int[] vet){
        int[] organizado = new int[vet.length];
        Arrays.sort(vet);
        for (int i = 0; i < vet.length; i++) {
            organizado[i] = vet[i];
        }           
            
        return organizado;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] vet = new int[5];     
        for (int i = 0; i < vet.length; i++) {
            System.out.println("Casa " + (i + 1) + " do vetor!");
            vet[i] = sc.nextInt();
        }
        int[] ord = ordenar(vet);     
        System.out.println(Arrays.toString(ord));
    }
}
