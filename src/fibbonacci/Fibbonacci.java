package fibbonacci;

import java.util.Scanner;

public class Fibbonacci {

    public static void main(String[] args) {
        int a=0, b=1, c, n;
        
        Scanner opccion = new Scanner(System.in);
        
        System.out.println("por favor ingrese el valor a calcular la Serie Fibonacci");
        n = opccion.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.println("serie: "+ a);
            
            c=a+b;
            a=b;
            b=c;
        }
    }

}
