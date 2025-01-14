package Lista4.Q2;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Escolha um dia da semana entre 1 e 7:");
        String mes = s.next();

        switch(mes) {
            case "Janeiro":
            case "Fevereiro":
            case "Março":
            case "Abril":
            case "Maio":
            case "Junho":
                System.out.print("Primeiro semestre");
                break;
            case "Julho":
            case "Agosto":
            case "Setembro":
            case "Outubro":
            case "Novembro":
            case "Dezembro":
                System.out.print("Segundo semestre");
                break;
            default:
                System.out.println("Opção inválida, escreva o nome inteiro de um mês do ano.");

                s.close();
        }
    }
}
