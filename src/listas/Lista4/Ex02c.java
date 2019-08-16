package listas.Lista4;
public class Ex02c {
        public static double mediapond(double p1, double p2, double p3) {
       
        
        p1 = p1 * 2;
        p2 = p2 * 3;
        p3 = p3 * 5;
        double media = (p1+p2+p3 / 10);
        
        return media;
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double p1;
        double p2;
        double p3;
        System.out.println("Digite a nota de sua primeira prova(prova de peso 2)");
        p1 = sc.nextDouble();
        System.out.println("Digite a nota de sua segunda prova(prova de peso 3)");
        p2 = sc.nextDouble();
        System.out.println("Digite a nota de sua tercecira prova(prova de peso 5)");
        p3 = sc.nextDouble();
        
        double con = mediapond(p1, p2, p3);
            system.out.println(con);
        
    }
}
