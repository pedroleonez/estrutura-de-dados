package tipos_primitivos_e_arrays;

import java.util.Scanner;

// maior e menor valor
public class Array3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] valores = new int[8];
        int maior, menor;

        System.out.println("digite o primeiro número:");
        valores[0] = sc.nextInt();
        maior = valores[0];
        menor = valores[0];

        System.out.println("digite os outros sete números:");
        for (int i = 1; i < valores.length; i++) {
            valores[i] = sc.nextInt();
            if (valores[i] > maior) {
                maior = valores[i];
            }
            if (valores[i] < menor) {
                menor = valores[i];
            }
        }

        System.out.println("o maior número digitado foi: " + maior);
        System.out.println("o menor número digitado foi: " + menor);

        sc.close();
    }
}
