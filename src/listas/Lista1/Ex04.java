package listas.Lista1;
public class Ex04 {
    public static void main(String[] args) {
        String s1 = "3";
        int i1;
        i1 = Integer.valueOf(s1);                           //string to int
        System.out.println("valor de i1 -> " + i1);
        // -----------------b---------------- //
        String s2 = "6.35";
        float f2;
        f2 = Float.parseFloat(s2);                          //string to float
        System.out.println("valor de f2 -> " + f2);
        // -----------------c--------------- //
        String s3 = "5.60000004";
        double d3;
        d3 = Double.parseDouble(s3);                        //string to double
        System.out.println("valor de d3 ->" + d3);
        // -----------------d-------------- //
        String s4 = "true";
        boolean b4;
        b4 = Boolean.parseBoolean(s4);                      //string to bool
        System.out.println("valor de b4 ->" + b4);
        // ---------------e---------------- //
        int i5 = 50;
        String s5;
        s5 = Integer.toString(i5);                          //int to string        
        System.out.println("valor de s5-> " + i5);
        // -------------f----------------- //
        float f6 = 50.05f;
        String s6;
        s6 = Float.toString(f6);                            //float to string
        System.out.println("valor de s6 -> " + s6);
        // ----------------g-------------- //
        double d7 = 0.000025;
        String s7;                                          //double to string
        s7 = Double.toString(d7);
        System.out.println("valor de s7-> " + s7);
        // -------------h----------------- //
        boolean b8 = true;
        String s8;
        s8 = Boolean.toString(b8);                          // bool to string
        System.out.println("valor de s8-> " + s8);
        // ----------------i--------------- //
        int i9 = 10;
        Float f9 = (float) i9;                              // int to float
        System.out.println("valor de f9 -> " + f9);
        // ---------------j-------------- //
        int i10 = 5;
        double d10 = (double) i10;                      // int to double
        System.out.println("valor de i10 -> " + i10);
        // ----------------k------------- //    
        float f11 = (float) 10.123456;
        double d11 = (double) f11;                          // float to double
        System.out.println("valor de d11 -> " + d11);
        // -------------l--------------- //
        double d12 = 0.1234567891011;
        float f12 = (float) d12;                            // double to float
        System.out.println("valor de f12 -> " + f12);
        // -------------m-------------- //
        double d13 = 5.987654321;
        int i13 = (int) d13;                                // double to int
        System.out.println("Valor de i13-> " + i13);
    }
}
