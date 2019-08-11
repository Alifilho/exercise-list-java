package listas.Lista3;
public class Ex02a {
    public static void main(String[] args) {
        int[][] a10 = new int[3][3];
    
        a10[0][0] = 1;
        a10[0][1] = 2;
        a10[0][2] = 3;
        a10[1][0] = 4;
        a10[1][1] = 5;
        a10[1][2] = 6;
        a10[2][0] = 7;
        a10[2][1] = 8;
        a10[2][2] = 9;
        
        for(int i = 0; i < a10.length; i++)  {  
            for(int j = 0; j < a10[0].length; j++)     { 
                System.out.print(a10[i][j] + " "); 
            }  
            System.out.println(" ");
       }
    }
}
