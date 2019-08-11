package listas.Lista3;
import java.util.Arrays;
public class Ex01g {
    public static void main(String[] args) {
        int[] g9 = new int[100];
        for (int i = 1; i < 100; i++) {
            if (i % 7 == 0) {
                g9[i] = 1;
            } else {
                g9[i] = 0;
            }
        }
        System.out.println(Arrays.toString(g9));
    }
}
