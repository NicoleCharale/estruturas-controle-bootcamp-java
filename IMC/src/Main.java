import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a sua altura em metros (m): ");
        float altura = scanner.nextFloat();

        System.out.print("Digite o seu peso em quilos (kg): ");
        float peso = scanner.nextFloat();

        float imc = peso / (altura * altura);
        String resultado;

        if(imc <= 18.5) {
            resultado = "Abaixo do peso";
        }
        else if(imc >= 18.6 && imc <= 24.9) {
            resultado = "Peso ideal";
        }
        else if(imc >= 25.0 && imc <= 29.9) {
            resultado = "Levemente acima do peso";
        }
        else if(imc >= 30.0 && imc <= 34.9) {
            resultado = "Obesidade Grau I";
        }
        else if(imc >= 35.0 && imc <= 39.9) {
            resultado = "Obesidade Grau II (Severa)";
        }
        else {
            resultado = "Obesidade Grau III (Mórbida)";
        }

        System.out.printf("IMC = %.1f\nSituação: %s", imc, resultado);
    }
}
