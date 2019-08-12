package listas.Lista4;

import java.util.Random;

public class Ex01y {
    public static boolean testeNumeroPrimo(int alea) {
        for (int i = 2; i < alea; i++) {
            if (alea % i == 0) {
                return false;   
            }
        }
        return true;
    }
    
    public static String quadradoPerfeito(double rand){
        double raiz = Math.sqrt(rand);

        int raizint = (int) raiz;

        if(raizint == raiz){
            return "Quadrado perfeito";
        } else {
            return "Quadrado imperfeito";
        }
    }
    
    public static void main(String[] args) {
        int vet[] = new int[100];
        
        Random rand = new Random();
        int alea;
        
        for (int i = 0; i < vet.length; i++) {
            vet[i] = alea = rand.nextInt(10001);
            
            boolean con = testeNumeroPrimo(alea);
            String quadrado = quadradoPerfeito(alea);
          
            System.out.println("INDICE: " + i + " recebeu o número: " + alea + 
            "\n O número: " + alea + " é um: " + quadrado +
            "\n O número: " + alea + " é um primo?: " + con);
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        }
            
        
    }
}
    }
}
