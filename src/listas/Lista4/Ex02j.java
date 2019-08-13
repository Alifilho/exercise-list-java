package listas.Lista4;
public class Ex02j {
    public static int[] func(int x){
        int[] vet = new int[x+1];
        
        for (int i = 0; i <= x; i++) {
            vet[i] = i;
        }
        
        return vet;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o valor de X: ");
        int x = sc.nextInt();
        
        int[] vet = new int[x+1];
        
        vet = func(x);
        
        System.out.println(Arrays.toString(vet));
    }
}
        
    

