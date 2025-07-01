import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para gerar a tabuada do 1 ao 10: ");
        int num = scanner.nextInt();

        for(int i = 1; i <= 10; i++) {
            int result = num * i;
            System.out.printf("%d x %d = %d\n", num, i, result);
        }
    }
}
