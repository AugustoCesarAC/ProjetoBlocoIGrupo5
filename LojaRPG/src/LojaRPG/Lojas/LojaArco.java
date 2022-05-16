package LojaRPG.Lojas;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import LojaRPG.Item;
import LojaRPG.Programa;
import LojaRPG.Pessoas.Pessoa;

public class LojaArco extends LojaGeral {

	public static Scanner scan = new Scanner(System.in);
	@Override
	public void menuLoja() {

		System.out.println("Menu da loja Arco e Flecha");
		String condicao = " ";
		do {

			StringBuilder sb = new StringBuilder();
			sb.append("\n  =========================");
			sb.append("\n |                         |");
			sb.append("\n |    1 - Comprar Item |"); // A LOJA VENDE PARA O CLIENTE
			sb.append("\n |     2 - vender Item |"); // A LOJA COMPRA DO CLIENTE
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
				vender(Programa.loja, Programa.personagem); // VENDENDO PARA O CLIENTE
				condicao = "0";
				break;
			case "2":
				System.out.println("vender Item***");
				vender(Programa.personagem, Programa.loja);// VENDENDO PARA a LOJA
				condicao = "0";
				break;
			case "3":
				System.out.println("ver catálogo***");
				listarItens();
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
	public void catalogo(String tipo) {
//		this.repositorio.catalogoLoja(); //ERRO REPO VAZIO - RESOLVER
		List<Item> listinha = Arrays.asList(new Item(), new Item());

		List<Item> novaLista = listinha.stream().filter(g -> g.getNome().equalsIgnoreCase("Arco"))
				.collect(Collectors.toList());

		int n = 0;
		
		for (Item item : novaLista) {
			System.out.println(n + ":" + item.getNome() + " " + item.getPlus());
		}
		

	}

	@Override
	public void vender(Pessoa vendedor, LojaGeral comprador) {
		// TODO Auto-generated method stub

	}

	@Override
	public void vender(LojaGeral comprador, Pessoa vendedor) {
		// TODO Auto-generated method stub

	}@Override
	public void listarItens() {
		repositorio.listarItens();
		
		
	}

}
