package listas.Lista4;
public class Ex02b {
    public static int[] DiasYear(int dias1) {
        int[] con = new int[3];
        int anos1;
        int resto1;
        int meses1;
        int diass;

        anos1 = dias1 / 365;
        resto1 = dias1 % 365;
        meses1 = resto1 / 30;
        diass = resto1 % 30;

        con[0] = anos1;
        con[1] = meses1;
        con[2] = diass;

        return con;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("DIgite sua idade em dias");
        int dias1 = sc.nextInt();
        int[] vet = DiasYear(dias1);
        System.out.println("anos: "+vet[0]);
        System.out.println("meses: "+vet[1]);
        System.out.println("dias: "+vet[2]);
        
        
    }
}
