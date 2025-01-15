package Q3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a: ");
        int a = scanner.nextInt();

        System.out.print("Digite op: ");
        String expre = scanner.next();

        System.out.print("Digite b: ");
        int b = scanner.nextInt();

        int resultado = 0;
        boolean operacaoValida = true;

        switch (expre) {
            case "+":
                resultado = a + b;
                break;

            case "-":
                resultado = a - b;
                break;

            case "*":
                resultado = a * b;
                break;

            case "/":
                if (b != 0) {
                    resultado = a / b;
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida!");
                    operacaoValida = false;
                }
                break;

            default:
                System.out.println("Erro: Operador inválido!");
                operacaoValida = false;
        }

        if (operacaoValida) {
            System.out.println(a + " " + expre + " " + b + " = " + resultado);
        }

        scanner.close();
    }
}
