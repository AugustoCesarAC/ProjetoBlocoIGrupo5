package LojaRPG;

import java.util.Scanner;

import LojaRPG.Lojas.LojaArco;
import LojaRPG.Lojas.LojaEspada;
import LojaRPG.Lojas.LojaGeral;
import LojaRPG.Lojas.LojaPocao;
import LojaRPG.Lojas.LojaVariedades;
import LojaRPG.Pessoas.Funcionario;
import LojaRPG.Pessoas.Pessoa;

public class Programa {

	private static Scanner scan = new Scanner(System.in);
	public static Pessoa personagem = new Pessoa("Personagem Genérico", "Raça Genérica");
	public static Funcionario funcionario = new Funcionario("Funcionário Genérico", "Elfo", "Gerente");
	public static LojaGeral loja;

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
			sb.append("\nOpcão --> ");
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
				System.out.println("Opção inválida! Tente novamente.");
				break;

			}

		} while (!condicao.equals("0"));
	}

	public void iniciarJogo() throws Exception {
		System.out.println("Iniciando jogo!");
//		criarPersonagem();
		String condicao = " ";
		do {

			StringBuilder sb = new StringBuilder();
			sb.append("\n  =========================");
			sb.append("\n |                         |");
			sb.append("\n |    1 - Criar personagem |");
//			sb.append("\n |     2 - Escolher vendedor |");
			sb.append("\n |     3 - Visitar Lojas |");
			sb.append("\n |     0 - Encerrar        |");
			sb.append("\n=========================");
			sb.append("\nOpcão --> ");
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
				escolhaLoja();
				Programa.loja.menuLoja();
//				limpatela();
				break;
//			case "2":
//				System.out.println("Escolha um funcionario: ");
//				menuFuncionario();
////				escolhaFuncionario();
//				break;
			case "3":
				System.out.println("Visitando Lojas***");
				escolhaLoja();
				Programa.loja.menuLoja();
				break;
			default:
				System.out.println("Opção inválida! Tente novamente.");
				break;

			}

		} while (!condicao.equals("0"));

	}

	public static void menuFuncionario() {

		String condicao = " ";
		do {
			StringBuilder sb = new StringBuilder();
			sb.append("\n  =========================");
			sb.append("\n |                         |");
			sb.append("\n |     1 - João, O Goblin         |");
			sb.append("\n |     2 - Rebecca, A Elfa           |");
			sb.append("\n |     3 - Rogerio, Humano        |");
//			sb.append("\n |     0 - sair        |");
			sb.append("\n Opcão --> ");
			System.out.println(sb);
			condicao = scan.next();

			switch (condicao) {
			case "1":
				System.out.println("Vendedor***");
				Programa.funcionario = new Funcionario("Vendedor Genérico", "Raça Genérica", "Vendedor");
				condicao = "0";
				break;
			case "2":
				System.out.println("Analista***");
				Programa.funcionario = new Funcionario("Analista Genérico", "Raça Genérica", "Analista");
				condicao = "0";
				break;
			case "3":
				System.out.println("Gerente***");
				Programa.funcionario = new Funcionario("Gerente Genérico", "Raça Genérica", "Gerente");
				condicao = "0";
				Artes.minotauroArt();
				break;

			default:
				System.out.println("Opção inválida! Tente novamente.");
			}

		} while (!condicao.equals("0"));

	}

	private void criarPersonagem() {
//		String racaPersonagem = menuRacaPersonagem();
//		String classePersonagem = menuClassepersonagem();
		Programa.personagem = new Pessoa(menuRacaPersonagem(), menuClassepersonagem());
	}

	private String menuRacaPersonagem() {

		String racaPersonagem = " ";
		String condicao = " ";
		do {
			StringBuilder sb = new StringBuilder();
			sb.append("\n  =========================");
			sb.append("\n |                         |");
			sb.append("\n |     1 - Anão         |");
			sb.append("\n |     2 - Elfo           |");
			sb.append("\n |     3 - Minotauro        |");
			sb.append("\n |     4 - Gnomo        |");
			sb.append("\n |     5 - Goblin|");
			sb.append("\n Opcão --> ");
			System.out.println(sb);
			condicao = scan.next();

			switch (condicao) {
			case "1":
				System.out.println("Anão***");
				racaPersonagem = "Anão";
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
				Artes.minotauroArt();
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
				System.out.println("Opção inválida! Tente novamente.");
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
			sb.append("\n |     4 - Ladrão        |");
			sb.append("\n |     5 - Curandeiro|");
//			sb.append("\n |     0 - voltar|");
			sb.append("\n  =========================");
			sb.append("\n Opcão --> ");
			System.out.println(sb);
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
				System.out.println("Ladrão***");
				classePersonagem = "Ladrão";
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
				System.out.println("Opção inválida! Tente novamente.");
			}

		} while (!condicao.equals("0"));

		return classePersonagem;
	}

	private void escolhaLoja() {
		String condicao = " ";
		do {

			StringBuilder sb = new StringBuilder();
			sb.append("\n  =========================");
			sb.append("\n |                         |");
			sb.append("\n |     1 - Loja de Poções         |");
			sb.append("\n |     2 - Loja de Espadas           |");
			sb.append("\n |     3 - Loja de Arco e Flechas        |");
			sb.append("\n |     4 - Loja variedade        |");
			sb.append("\n  =========================");
			sb.append("\nOpcão --> ");
			System.out.println(sb);
			condicao = scan.next();

			switch (condicao) {
			case "1":
				System.out.println("Loja de poções***");
				Programa.loja = new LojaPocao();
				condicao = "0";
				break;
			case "2":
				System.out.println("Loja de Espadas***");
				Programa.loja = new LojaEspada();
				condicao = "0";
				break;
			case "3":
				System.out.println("Loja de Arco e Flecha***");
				Programa.loja = new LojaArco();
				condicao = "0";
				break;
			case "4":
				System.out.println("Loja variedades***");
				Programa.loja = new LojaVariedades();
				condicao = "0";
				break;

			default:
				System.out.println("Opção inválida! Tente novamente.");
				break;
			}
		} while (!condicao.equals("0"));

	}

	private static void infoCriadores() {
		StringBuilder sb = new StringBuilder();
		sb.append("Augusto");
		sb.append("\nCamilla");
		sb.append("\nEdgard");
		sb.append("\nHenrique");
		sb.append("\nJonathan");
		sb.append("\nVitória");
		sb.append("\nRenan");
		sb.append("\nRenan novamente");
		System.out.println(sb);
	}

	public static void limpatela() {
		System.out.println(
				"\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	}

	public static void fraseIntrodutoria() throws Exception {
		String fraseInicial = "FRASE DE INTRODUÇÃO DE EXEMPLO DO RAGNAROK"
				+ "\n Quando a pequena cidade de Edda, na Noruega, passa a sofrer com invernos muito quentes e"
				+ "\n tempestades violentas, um grupo de amigos do ensino médio começa a achar que o Ragnarök,"
				+ "\n sequência de eventos que levariam ao apocalipse de acordo com a mitologia nórdica,"
				+ "\n está mais próximo do que eles imaginam.";
		for (int i = 0; i < fraseInicial.length(); i++) {
			System.out.print(fraseInicial.charAt(i));
//			Thread.sleep(5);// usar 5
		}
	}

}