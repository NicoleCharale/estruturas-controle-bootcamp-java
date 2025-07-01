import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite outro número inteiro (maior que o anterior): ");
        int num2 = scanner.nextInt();

        System.out.printf("Escolha uma das opções abaixo para listar todos os números entre %d e %d:", num1, num2);
        System.out.print("\n1 - Ímpar\n2 - Par\n:");
        int opcao = scanner.nextInt();

        switch(opcao) {
            case 1 -> {
                System.out.println("Imprimindo todos os número ímpares:");
                for(int i = num1; i <= num2; i++) {
                    if(i % 2 != 0) System.out.println(i);
                }
            }
            case 2 -> {
                System.out.println("Imprimindo todos os número pares:");
                for(int i = num1; i <= num2; i++) {
                    if(i % 2 == 0) System.out.println(i);
                }
            }
        }
    }
}
