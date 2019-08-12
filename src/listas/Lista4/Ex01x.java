package listas.Lista4;
public class Ex01x {
    
        public static boolean testeNumeroPrimo(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int[] concatenaVetor(int[] vet1, int[] vet2) {
        int[] con = new int[10];
        System.arraycopy(vet1, 0, con, 0, vet1.length);
        System.arraycopy(vet2, 0, con, 5, vet2.length);
        return con;
    }

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
        Scanner sc = new Scanner(System.in);

        int[] vet1 = new int[5];
        int[] vet2 = new int[5];
        System.out.println("Digite o vetor 1");
        for (int i = 0; i < 5; i++) {

            System.out.println("Indicie nº " + i + "");
            vet1[i] = sc.nextInt();
        }
        System.out.println("Digite o vetor 2");
        for (int i = 0; i < 5; i++) {
            System.out.println("Indicie nº " + i + "");
            vet2[i] = sc.nextInt();
        }
          
        int[] concat;
        concat = concatenaVetor(vet1, vet2);
        System.out.println("VETOR CONCATENADO");
        for (int i = 0; i < 10; i++) {
            if (testeNumeroPrimo(concat[i]) == true) {
                System.out.println(concat[i] + " primo");
            } else {
                System.out.println(concat[i]);
            }
        }
         
        int[] intersec;
        System.out.println("VETOR INTERSECCIONADO");
        intersec = intersecao(vet1, vet2);
        for (int i = 0; i < 10; i++) {
            if (intersec[i] == 0) {
                System.out.println(" =-= ");
            } else {
                if (testeNumeroPrimo(intersec[i]) == true) {
                    System.out.println(" " + intersec[i] + " é primo ");
                } else {
                    System.out.println(" "+intersec[i]);
                }
            }

        }
    }
}
        
