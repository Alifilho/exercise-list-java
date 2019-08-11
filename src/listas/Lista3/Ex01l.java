package listas.Lista3;
public class Ex01l {
    public static void main(String[] args) {
        int[] l9 = new int[5];
        int[] l9_b = new int[5];
        for(int i = 0; i < 5; i++) {
            l9[i] = i;
            l9_b[i] = l9[i] % 2;
        }
    }
}
