package conta;

import java.util.Scanner;

import conta.model.Conta;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;
import conta.util.Cores;

public class Menu {
	
    public static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		int opcao;
				
		while(true) {

			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
					+ "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                BANCO DO BICHO                       ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Conta                          ");
			System.out.println("            2 - Listar todas as Contas               ");
			System.out.println("            3 - Buscar Conta por Numero              ");
			System.out.println("            4 - Atualizar Dados da Conta             ");
			System.out.println("            5 - Apagar Conta                         ");
			System.out.println("            6 - Sacar                                ");
			System.out.println("            7 - Depositar                            ");
			System.out.println("            8 - Transferir valores entre Contas      ");
			System.out.println("            9 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");
			
			opcao = leia.nextInt();
				
			if (opcao == 9) {
				System.out.println("\nBanco do Bicho - Onde a confiança é Selvagem!");
				sobre();
				leia.close();
				System.exit(0);
			}
				
			switch (opcao) {
				case 1:
					System.out.println("\n Criar Conta");
				
                    		break;
				case 2:
					System.out.println("\n Listar todas as Contas");
					
                    		break;
				case 3:
					System.out.println("\n Buscar Conta por número");
	
                    		break;
				case 4:
					System.out.println("\n Atualizar dados da Conta");
					
                    		break;
				case 5:
					System.out.println("\n Apagar Conta");
		
                   	 	break;
				case 6:
					System.out.println("\n Sacar");

                   	 	break;
				case 7:
					System.out.println("\n Depositar");
					
                    		break;
				case 8:
					System.out.println("\n Transferir");
					
                    		break;
				default:
					System.out.println("\nOpção Inválida");
                    		break;
			}
		}	
    }

    public static void sobre() {
	System.out.println("\n*********************************************************");
	System.out.println("Projeto Desenvolvido por: Gabriel Macedo ");
	System.out.println("Apoiado por: Generation Brasil - generation@generation.org");
	System.out.println("github.com/gabrielqms");
	System.out.println("*********************************************************");

	}

}
