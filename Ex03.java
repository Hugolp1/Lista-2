import java.util.Scanner;

public class Ex03 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a quantidade de numeros: ");
        int qntNums = leitor.nextInt();
        int[] nums = new int[qntNums];
        int[] dobro = new int[qntNums];

        for (int i = 0; i < qntNums; i++) {
            System.out.println("Digite o numero " + (i + 1) + ": ");
            nums[i] = leitor.nextInt();
        }

        for (int i = 0; i < qntNums; i++) {
            dobro[i] = nums[i] * 2;
        }

        for (int i = 0; i < qntNums; i++) {
            System.out.println("Número " + nums[i] + " / Dobro : " + dobro[i]);
        }
    }
}
