import java.util.Scanner;

public class SomaN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número N: ");
        int N = sc.nextInt();

        int soma = 0;
        for (int i = 1; i <= N; i++) {
            soma += i;
        }
        System.out.println("Soma dos " + N + " primeiros números é: " + soma);
        sc.close();
    }
}
