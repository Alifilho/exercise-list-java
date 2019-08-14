package listas.Lista4;
public class Ex01t {
    public static double func(float valor, float juros, int meses){
       double montante;
        double jurosfinal = 0;

        jurosfinal = juros/100;
        jurosfinal += 1;
        double base;

        base = Math.pow(jurosfinal, meses);

        montante = valor * base;

        return montante;
    }
    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        float valor;
        float juros;
        int meses;

        System.out.println("Digite o capital: ");
        valor = sc.nextFloat();

        System.out.println("O juros: ");
        juros = sc.nextFloat();

        System.out.println("Digite o tanto de meses: ");
        meses = sc.nextInt();

        double montante = func(valor, juros, meses);

        double base = 1 + juros;
        System.out.printf("O montante é: %.2f %n" , montante);
    }
}
