import java.util.*;

public class ContaTerminal
{
	public static void main(String[] args) {
	    
Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Por favor, digite o número da Agência!");
    int numero = scanner.nextInt();

    System.out.println("Por favor, digite o codigo de sua Agência!");
    String agencia = scanner.next();

    System.out.println("Por favor, digite seu nome!");
    String nome = scanner.next();

    System.out.println("Por favor, digite seu saldo!");
    double saldo = scanner.nextDouble();
    
	System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + 
	                   ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

	scanner.close();
	}
}
