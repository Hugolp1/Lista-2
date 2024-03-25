import java.util.Scanner;

public class Ex01 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        int[] nums = new int[5];

        System.out.println("Digite 5 numeros: ");
        for (int i = 0; i < 5; i++) {
            System.out.println("Numero " + (i + 1) + ": ");
            nums[i] = leitor.nextInt();
        }

        double soma = 0;
        for (int numero : nums) {
            soma += numero;
        }
        double media = soma / nums.length;

        System.out.println("Números menores que a média:");
        for (int numero : nums) {
            if (numero < media) {
                System.out.println(numero);
            }
        }
        System.out.println("\nNúmeros iguais à média:");
        for (int numero : nums) {
            if (numero == media) {
                System.out.println(numero);
            }
        }
        System.out.println("\nNúmeros maiores que a média:");
        for (int numero : nums) {
            if (numero > media) {
                System.out.println(numero);
            }
        }
    }
}
