package LojaRPG.Lojas;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import LojaRPG.Item;
import LojaRPG.Programa;
import LojaRPG.Pessoas.Funcionario;
import LojaRPG.Pessoas.Pessoa;

public class LojaVariedades extends LojaGeral {
	private static Scanner scan = new Scanner(System.in);
//	private LojaRepo repositorio = new LojaRepo();

	public LojaVariedades() {

	}

	@Override
	public void menuLoja() {
		String pergunta = " ";
		while (!pergunta.equals("0")) { // GAMBIARRA TEMPORÁRIA

			System.out.println("Menu da loja geral");
			System.out.println("Olá, eu sou " + Programa.funcionario.getNome()
					+ "Bem vindo a Loja Tal, aqui temos os melhores produtos que você poderia encontrar em toda Raftel,"
					+ " por favor, se aproxime e veja os itens");
			String condicao = " ";
			do {

				StringBuilder sb = new StringBuilder();
				sb.append("\n  =========================");
				sb.append("\n |                         |");
				sb.append("\n |    1 - Comprar Item |");
				sb.append("\n |     2 - vender Item |");
				sb.append("\n |     3 - Infos da Loja |");
				sb.append("\n |     4 - Escolher funcionário|");
				sb.append("\n |     0 - voltar        |");
				sb.append("\n=========================");
				sb.append("\nOpcão --> ");
				System.out.println(sb);
				condicao = scan.next();
				System.out.println(condicao);

				switch (condicao) {

				case "0":
//					System.out.println("Volte sempre!");
					condicao = "0";
					break;
				case "1":
					System.out.println("Comprar Item***");
//					comprar(new Item());
					condicao = "0";
					break;
				case "2":
					System.out.println("vender Item***");
//					escolhaFuncionario();
					condicao = "0";
					break;
				case "3":
					System.out.println("ver catálogo***");
					for (Funcionario f : listaDefuncionarios)
						System.out.println(f.status());
					System.out.println(this.espacoLoja);

					System.out.println("Saiu de catalogoLoja e deveria voltar pra menu da loja");
					condicao = "0";
					break;
				case "4":
					System.out.println("exibindo listas de funcionários***");
					System.out.println("Escolha um funcionario: ");
					Programa.menuFuncionario();
//					
					condicao = "0";
					break;
				default:
					System.out.println("Opção inválida! Tente novamente.");
					break;

				}

			} while (!condicao.equals("0"));
			System.out.println("Deseja continuar na loja? sim - s | sair - [0]");
			pergunta = scan.next();
			System.out.println(pergunta);

		}
		System.out.println("Volte sempre, amigx!");

	}

	@Override
	public void vender(LojaGeral dono, Pessoa cliente) {
		System.out.println("rodando vendendo item loja>cliente loja variedades");
		repositorio.vender(dono, cliente);

	}

	@Override
	public void vender(Pessoa vendedor, LojaGeral comprador) {
		System.out.println("rodando vendendo item cliente>loja loja variedades");

	}

//	@Override
//	public void adicionar() {
//		// TODO Auto-generated method stub
//
//	}

//	@Override
//	public void remover() {
//		// TODO Auto-generated method stub
//
//	}

	@Override
	public void catalogo(String tipo) {
//		this.repositorio.catalogoLoja(); //ERRO REPO VAZIO - RESOLVER
		List<Item> listinha = Arrays.asList(new Item(), new Item());

		List<Item> novaLista = listinha.stream().filter(g -> g.getNome().equalsIgnoreCase("Espada"))
				.collect(Collectors.toList());

		int n = 0;
		
		for (Item item : novaLista) {
			System.out.println(n + ":" + item.getNome() + " " + item.getPlus());
		}
		

	}

	@Override
	public void comprar(Item item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void adicionar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remover() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listarItens() {
		// TODO Auto-generated method stub
		
	}

	

	

//	@Override
//	public void comprar(Item item) {
//		this.catalogoLoja();
//
//	}

//	private void criarItemLoja() {
//	}

}
