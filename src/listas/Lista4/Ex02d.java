
package listas.Lista4;


public class Ex02d {
        public static double imposto(double fab) {
        double dist = fab + (fab/100)*28;
        double imposto = fab + (fab/100)*45;
        double tot;
        tot = dist + imposto;
        return tot;

    }

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        
        System.out.println("Digite o custo da fábrica");
        double fab = sc.nextDouble();
        double con;
        con = imposto(fab);
        System.out.println(con);
          



    }
}
