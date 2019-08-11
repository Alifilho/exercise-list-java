package listas.Lista3;
public class Ex01f {
    public static void main(String[] args) {
        String[] f9 = new String[100];
        for (int i = 0; i < 100; i++) {

            if (i % 2 == 0) {
                f9[i] = "par";
            } else {
                f9[i] = "impar";
            }
            System.out.println(f9[i]);
        }
    }
}
