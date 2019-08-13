package listas.Lista4;
public class Ex02a {
        public static int anosDias (int anos, int meses, int dias){
        int total;
        total = (anos*365) + (meses*30) + dias;
        return total;
            
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Digite os anos de sua idade");
        int anos = sc.nextInt();
        System.out.println("Digite os meses de sua idade");
        int meses = sc.nextInt();
        System.out.println("Digite os dias de sua idade");
        int dias = sc.nextInt();
        
        int total;
        total = anosDias(anos,meses,dias);
        System.out.println("Sua idade em anos é: "+total);
        
        
    }
}
