package src;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> produtores = new ArrayList<>();
		
		int opcao = 0;
		
		while(opcao !=4) {
			System.out.println("\n=== SISTEMA RURAL ===");
			System.out.println("1 - Cadastrar produtor");
			System.out.println("2 - Listar produtores");
			System.out.println("3 - Remover produtor");
			System.out.println("4 - Sair");
			System.out.println("Escolha: ");
			
			
			opcao = sc.nextInt();
			sc.nextLine();
			
			if (opcao == 1) {
				System.out.println("Nome do produtor: ");
				String nome = sc.nextLine();
				produtores.add(nome);
				System.out.println("Produtor Cadastrado!");
			}
			
			else if (opcao == 2) {
				System.out.println("\nProdutores Cadastrados: ");
				for(int i = 0; i< produtores.size(); i+=1) {
					System.out.println(i + " - " + produtores.get(i));
				}
			}
			
			else if (opcao == 3) {
				System.out.println("Digite o número do produtor para remove-lo: ");
				int indice = sc.nextInt();
				sc.nextLine();
				produtores.remove(indice);
				System.out.println("Produtor Removido!");
			}
		}
	
	}
	
}
