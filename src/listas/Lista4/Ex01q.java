package listas.Lista4;
public class Ex01q {
    public static int[] concatenaVetor(int[] vet1, int[] vet2) {
        int[] con = new int[10];
        System.arraycopy(vet1, 0, con, 0, vet1.length);
        System.arraycopy(vet2, 0, con, 5, vet2.length);
        return con;
    }
    public static void main(String[] args) {
        int[] vet1 = new int[5];
        int[] vet2 = new int[5];
        for (int i = 0; i < 5; i++) {
            vet1[i] = i;
            vet2[i] = (i + 6);
        }
        int[] vet3;
        vet3 = concatenaVetor(vet1, vet2);
        for (int i = 0; i < 10; i++) {
            System.out.println(vet3[i]);
        }
    }
}
