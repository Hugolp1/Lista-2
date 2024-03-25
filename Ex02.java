import java.util.Scanner;

public class Ex02 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a quantidade de numeros: ");
        int qntNums = leitor.nextInt();
        int[] nums = new int[qntNums];

        for (int i = 0; i < qntNums; i++) {
            System.out.println("Digite o numero " + (i + 1) + ": ");
            nums[i] = leitor.nextInt();
        }

        for (int i = 0; i < qntNums; i++) {
            int numero = nums[i];
            if (numero > 0) {
                System.out.println("Número " + numero + " na posição " + i + " é positivo.");
            } else if (numero < 0) {
                System.out.println("Número " + numero + " na posição " + i + " é negativo.");
            } else {
                System.out.println("Número " + numero + " na posição " + i + " é zero.");
            }
        }

    }
}
