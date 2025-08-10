package tipos_primitivos_e_arrays;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] notas = new int[5];

        System.out.println("insira as 5 notas:");

        for (int i = 0; i < notas.length; i++) {
            notas[i] = sc.nextInt();
        }

        int soma = 0;

        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }

        double media = (double) soma / notas.length;

        System.out.println("a média das notas é: " + media);

        sc.close();
    }
}
