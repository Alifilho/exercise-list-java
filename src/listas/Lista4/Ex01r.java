package listas.Lista4;
import java.util.Arrays;
public class Ex01r {
    public static int[] intersecao(int[] vet1, int[] vet2) {
        int[] inter = new int[10];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (vet1[i] == vet2[j]) {
                    inter[i] = vet1[i];
                    break;
                }
            }
        }
        return inter;
    }
    public static void main(String[] args) {
        int[] vet1 = new int[5];
        int[] vet2 = new int[5];

        for (int i = 0; i < 5; i++) {
            vet1[i] = i;
        }
        for (int i = 3; i < 5; i++) {
            vet2[i] = i;
        }
        int[] vet3;
        vet3 = intersecao(vet1, vet2);
        System.out.println(Arrays.toString(vet3));
    }
}
