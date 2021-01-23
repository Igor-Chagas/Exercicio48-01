import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Por favor, insira sua senha:");
		int senha = sc.nextInt();
		if (senha != 2002) {
			while (senha != 2002) {
			System.out.println("Senha invalida");
			System.out.println("Por favor, insira sua senha:");	
			senha = sc.nextInt();
			}
		}
		System.out.println("Acesso Permitido");
		sc.close();
		}
	
	}


