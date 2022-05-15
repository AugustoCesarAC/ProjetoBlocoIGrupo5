package LojaRPG;

import java.util.Scanner;

import LojaRPG.Lojas.LojaArco;
import LojaRPG.Lojas.LojaEspada;
import LojaRPG.Lojas.LojaGeral;
import LojaRPG.Lojas.LojaPocao;
import LojaRPG.Pessoas.Pessoa;

public class Programa {

	private static Scanner scan = new Scanner(System.in);

	public void menu() throws Exception {
		fraseIntrodutoria();
		String condicao = " ";

		do {

			StringBuilder sb = new StringBuilder();
			sb.append("\n  =========================");
			sb.append("\n | Seja bem-vindo! Digite: |");
			sb.append("\n |                         |");
			sb.append("\n |    1 - Jogar            |");
			sb.append("\n |     2 - Info criadores |");
			sb.append("\n |     0 - Encerrar        |");
			sb.append("\n=========================");
			sb.append("\nOpc�o --> ");
			System.out.println(sb);
			condicao = scan.next();
			System.out.println(condicao);

			switch (condicao) {

			case "0":
				System.out.println("Saindo.....");

				break;
			case "1":
//				limpatela();
				System.out.println("jogar");
				iniciarJogo();
//				limpatela();
				break;
			case "2":
				System.out.println("Info criadores");
				infoCriadores();
				break;
			default:
				System.out.println("Op��o inv�lida! Tente novamente.");
				break;

			}

		} while (!condicao.equals("0"));
	}

	public void iniciarJogo() {
		System.out.println("Iniciando jogo!");
		criarPersonagem();
		String condicao = " ";
		do {
			
			StringBuilder sb = new StringBuilder();
			sb.append("\n  =========================");
			sb.append("\n |                         |");
			sb.append("\n |    1 - Criar personagem |");
			sb.append("\n |     2 - Gerenciar Loja |");
			sb.append("\n |     0 - Encerrar        |");
			sb.append("\n=========================");
			sb.append("\nOpc�o --> ");
			System.out.println(sb);
			condicao = scan.next();
			System.out.println(condicao);

			switch (condicao) {

			case "0":
				System.out.println("Saindo.....");
				break;
			case "1":
//				limpatela();
				System.out.println("criar Personagem***");
				criarPersonagem();
				LojaGeral lojinha = escolhaLoja();
				if (lojinha == null)// por garantia moment�nea
					return;
				lojinha.menuLoja();
//				limpatela();
				break;
			case "2":
				System.out.println("Escolha um funcionario: ");
//				escolhaFuncionario();
				break;
			default:
				System.out.println("Op��o inv�lida! Tente novamente.");
				break;

			}

			
			switch (condicao) {
			case "":
				LojaGeral lojinha = escolhaLoja();
				if (lojinha == null)
					return;
				lojinha.menuLoja();
				break;

			default:
				break;
			}
			
		}while(condicao.equals("0"));

	}
	
	private Pessoa criarPersonagem() {
//		String racaPersonagem = menuRacaPersonagem();
//		String classePersonagem = menuClassepersonagem();
//		
		Pessoa personagem = new Pessoa(menuRacaPersonagem(), menuClassepersonagem());
		return personagem;
	}

	private String menuRacaPersonagem() {

		String racaPersonagem = " ";
		String condicao = " ";
		do {
			StringBuilder sb = new StringBuilder();
			sb.append("\n  =========================");
			sb.append("\n |                         |");
			sb.append("\n |     1 - An�o         |");
			sb.append("\n |     2 - Elfo           |");
			sb.append("\n |     3 - Minotauro        |");
			sb.append("\n |     4 - Gnomo        |");
			sb.append("\n |     5 - Goblin|");
			sb.append("\n Opc�o --> ");
			System.out.println(sb);
			condicao = scan.next();

			switch (condicao) {
			case "1":
				System.out.println("An�o***");
				racaPersonagem = "An�o";
				condicao = "0";
				break;
			case "2":
				System.out.println("Elfo***");
				racaPersonagem = "Elfo";
				condicao = "0";
				break;
			case "3":
				System.out.println("Minotauro***");
				racaPersonagem = "Minotauro";
				condicao = "0";
				break;
			case "4":
				System.out.println("Gnomo***");
				racaPersonagem = "Gnomo";
				condicao = "0";
				break;
			case "5":
				System.out.println("Goblin***");
				racaPersonagem = "Goblin";
				condicao = "0";
				break;

			default:
				System.out.println("Op��o inv�lida! Tente novamente.");
			}

		} while (!condicao.equals("0"));

		return racaPersonagem;
	}

	private String menuClassepersonagem() {

		String classePersonagem = " ";
		String condicao = " ";
		do {
			StringBuilder sb = new StringBuilder();
			sb.append("\n  =========================");
			sb.append("\n |                         |");
			sb.append("\n |     1 - Guerreiro         |");
			sb.append("\n |     2 - Arqueiro           |");
			sb.append("\n |     3 - Mago        |");
			sb.append("\n |     4 - Ladr�o        |");
			sb.append("\n |     5 - Curandeiro|");
//			sb.append("\n |     0 - voltar|");
			sb.append("\n  =========================");
			sb.append("\n Opc�o --> ");
			System.out.println(sb);
			System.out.print("Opc�o --> ");
			condicao = scan.next();

			switch (condicao) {
			case "1":
				System.out.println("Guerreiro***");
				classePersonagem = "Guerreiro";
				condicao = "0";
				break;
			case "2":
				System.out.println("Arqueiro***");
				classePersonagem = "Arqueiro";
				condicao = "0";
				break;
			case "3":
				System.out.println("Mago***");
				classePersonagem = "Mago";
				condicao = "0";
				break;
			case "4":
				System.out.println("Ladr�o***");
				classePersonagem = "Ladr�o";
				condicao = "0";
				break;
			case "5":
				System.out.println("Curandeiro***");
				classePersonagem = "Curandeiro";
				condicao = "0";
				break;
//			case "0":
//				System.out.println("voltando***");
//				condicao = "0";
//				break;

			default:
				System.out.println("Op��o inv�lida! Tente novamente.");
			}

		} while (!condicao.equals("0"));

		return classePersonagem;
	}

	private LojaGeral escolhaLoja() {
		String condicao = " ";
		LojaGeral lojaEscolhida = null;
		do {

			StringBuilder sb = new StringBuilder();
			sb.append("\n  =========================");
			sb.append("\n |                         |");
			sb.append("\n |     1 - Loja de Po��es         |");
			sb.append("\n |     2 - Loja de Espadas           |");
			sb.append("\n |     3 - Loja de Arco e Flechas        |");
//			sb.append("\n |     0 - voltar        |");
			sb.append("\n  =========================");
			sb.append("\nOpc�o --> ");
			System.out.println(sb);
			condicao = scan.next();

			switch (condicao) {
			case "1":
				System.out.println("Loja de po��es***");
				lojaEscolhida = new LojaPocao();
				condicao = "0";
				break;
			case "2":
				System.out.println("Loja de Espadas***");
				lojaEscolhida = new LojaEspada();
				condicao = "0";
				break;
			case "3":
				System.out.println("Loja de Arco e Flecha***");
				lojaEscolhida = new LojaArco();
				condicao = "0";
				break;

			default:
				System.out.println("Op��o inv�lida! Tente novamente.");
				break;
			}
		} while (!condicao.equals("0"));

		return lojaEscolhida;
	}

	private static void infoCriadores() {
		StringBuilder sb = new StringBuilder();
		sb.append("Augusto");
		sb.append("\nCamilla");
		sb.append("\nEdgar");
		sb.append("\nHenrique");
		sb.append("\nJonathan");
		sb.append("\nVit�ria");
		System.out.println(sb);
	}

	public static void limpatela() {
		System.out.println(
				"\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	}

	public static void fraseIntrodutoria() throws Exception {
		String fraseInicial = "FRASE DE INTRODU��O DE EXEMPLO DO RAGNAROK"
				+ "\n Quando a pequena cidade de Edda, na Noruega, passa a sofrer com invernos muito quentes e"
				+ "\n tempestades violentas, um grupo de amigos do ensino m�dio come�a a achar que o Ragnar�k,"
				+ "\n sequ�ncia de eventos que levariam ao apocalipse de acordo com a mitologia n�rdica,"
				+ "\n est� mais pr�ximo do que eles imaginam.";
		int pulaLinha = 10;
		for (int i = 0; i < fraseInicial.length(); i++) {
			System.out.print(fraseInicial.charAt(i));
			// Thread.sleep(5);//usar 5

		}
	}

}