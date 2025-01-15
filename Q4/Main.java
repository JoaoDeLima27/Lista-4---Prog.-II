package Q4;

import java.util.Scanner;

public class Main {
    public static int calcularFatorial(int n) {
        int fatorial = 1;
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }
        return fatorial;
    }

    public static int numEuler(int termos){
        double e = 1.0;
        for (int i = 1; i < termos; i++) {
            e += 1.0 / calcularFatorial(i);
        }
        return (int) e;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número limite para calcular e: ");
        int termos = scanner.nextInt();

        double e = numEuler(termos);
        System.out.println("O valor do número de Euler é: " + e);

        scanner.close();
    }
}
