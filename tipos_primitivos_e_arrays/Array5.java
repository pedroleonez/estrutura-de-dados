package tipos_primitivos_e_arrays;

import java.util.Scanner;

// troca de elementos
public class Array5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] elementos = new int[5];

        System.out.println("digite 5 números:");

        for (int i = 0; i < elementos.length; i++) {
            if (i == 0) {
                elementos[elementos.length - 1] = sc.nextInt();
            } else if (i == elementos.length - 1) {
                elementos[0] = sc.nextInt();
            } else {
                elementos[i] = sc.nextInt();
            }
        }

        System.out.println("a ordem inversa dos números digitados:");

        for (int i = 0; i < elementos.length; i++) {
            System.out.println(elementos[i]);
        }
        
        sc.close();
    }
}
