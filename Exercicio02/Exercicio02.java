import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) throws Exception {

        System.out.print("Digite um número: ");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        sc.close();

        System.out.println("O número informado foi" + numero);
    }
}
