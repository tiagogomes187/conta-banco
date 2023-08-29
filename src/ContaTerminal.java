import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args) {
		int numero;
		String agencia;
		String clienteNome;
		Double saldo;

		saldo = 237.48;

		Scanner sc = new Scanner(System.in);

		System.out.println("Por favor, digite o seu nome!");
		clienteNome = sc.nextLine();

		System.out.println("Por favor, digite o número da agência!");
		agencia = sc.nextLine();

		System.out.println("Por favor, digite o número da conta!");
		numero = sc.nextInt();

		System.out.println("------");
		System.out.println("------");
		System.out.println("Olá " + clienteNome + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo de " + saldo + " já está disponível para saque.");


		sc.close();
	}
}
