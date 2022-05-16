package LojaRPG.Lojas;

import java.util.Scanner;

import LojaRPG.Item;
import LojaRPG.Programa;

public class LojaVariedades extends LojaGeral {
	private static Scanner scan = new Scanner(System.in);

	public LojaVariedades() {
		criarItemLoja();
	}

	@Override
	public void menuLoja() {

		System.out.println("Menu da loja geral");
		String condicao = " ";
		do {

			StringBuilder sb = new StringBuilder();
			sb.append("\n  =========================");
			sb.append("\n |                         |");
			sb.append("\n |    1 - Comprar Item |");
			sb.append("\n |     2 - vender Item |");
			sb.append("\n |     3 - ver catálogo |");
			sb.append("\n |     0 - voltar        |");
			sb.append("\n=========================");
			sb.append("\nOpcão --> ");
			System.out.println(sb);
			condicao = scan.next();
			System.out.println(condicao);

			switch (condicao) {

			case "0":
				System.out.println("Volte sempre!");
				condicao = "0";
				break;
			case "1":
				System.out.println("Comprar Item***");
				comprar(new Item());
				condicao = "0";
				break;
			case "2":
				System.out.println("vender Item***");
//				escolhaFuncionario();
				condicao = "0";
				break;
			case "3":
				System.out.println("ver catálogo***");
				catalogoLoja();
				condicao = "0";
				break;
			default:
				System.out.println("Opção inválida! Tente novamente.");
				break;

			}

		} while (!condicao.equals("0"));

	}

	@Override
	public void comprar(Item item) {
		Item itemComprado = Programa.personagem.getItem();
		Programa.personagem.setItem(null); // verificar integridade do null
		produto.add(itemComprado);

	}

	@Override
	public void vender() {
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
	public void catalogoLoja() {
		produto.forEach(i -> {
			int n = 1;
			System.out.println("n°" + n + " | " + i);
			n++;
		});

	}

	private void criarItemLoja() {
		for (int i = 0; i < 4; i++) {
			Item item = new Item();
			item.valorItem();
			this.produto.add(item);
		}
	}

}
