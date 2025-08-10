package tipos_primitivos_e_arrays;

import java.util.Scanner;

// contar números pares
public class Array4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] numeros = new int[10];

        int pares = 0;

        System.out.println("digite 10 números:");

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();

            if (numeros[i] % 2 == 0) {
                pares++;
            }
        }

        System.out.println("a quantidade de números pares é: " + pares);

        sc.close();
    }
}
