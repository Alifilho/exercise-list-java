package listas.Lista4;
public class Ex01cc {
    
        public static int fibo(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }
    public static void main(String[] args) {
              
        int i = 0; // numero que começa a sequencia de fibonnaci
        for (;; i++) {
            System.out.print(fibo(i) + " ");
            
    }
}
