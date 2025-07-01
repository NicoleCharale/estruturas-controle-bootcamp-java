import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número inicial: ");
        int numInicial = scanner.nextInt();

        System.out.println("Informe mais números até que o resto de divisão por %d seja diferente de 0:");

        do {
            int num = scanner.nextInt();
            if(num > numInicial) {
                int resto = num % numInicial;
                if(resto != 0) {
                    System.out.printf("\n%d / %d tem resto igual a %d!\n", num, numInicial, resto);
                    break;
                }
            }
        } while(true);
    }
}
