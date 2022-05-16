package LojaRPG.Lojas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import LojaRPG.Item;
import LojaRPG.Programa;
import LojaRPG.Pessoas.Pessoa;

public class LojaRepo extends LojaGeral {
	private static Scanner scan = new Scanner(System.in);
	private List<Item> produtos = new ArrayList<>();// PRODUTOS DIVERSOS

	public LojaRepo() {
		criarItemLoja();
	}

	public LojaRepo(String tipo) {
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

//	@Override
//	public void comprar(Item item) {
//		criarItemLoja();
//		
//
//	}

	@Override
	public void vender(Pessoa comprador, LojaGeral vendedor) { // LOJA VENDE PARA CLIENTE
		listarItens();
		System.out.print("Informe o n° do Item: ");
		int posicaoProduto = scan.nextInt() - 1;

		if (posicaoProduto > produtos.size() || posicaoProduto < 0) {
			System.out.println("Posição inválida!");
			return;
		}
		
		
		
        

        
		String nomeProduto = produtos.get(posicaoProduto).getNome();
		Item produto = produtos.get(posicaoProduto);
		Programa.personagem.setItem(produto);
		produtos.remove(posicaoProduto);
		caixaLoja = caixaLoja + produto.valorItemLoja();
		System.out.println(nomeProduto + " == Vendido!");

	}

	@Override
	public void adicionar() {
		Item item = new Item();
		produtos.add(item);

	}

	@Override
	public void remover() {
		catalogo("tipo");
		System.out.print("Informe o n° do Item: ");
		int posicaoProduto = scan.nextInt() - 1;

		if (posicaoProduto > produtos.size() || posicaoProduto < 0) {
			System.out.println("Posição inválida!");
			return;
		}

		Item item = produtos.get(posicaoProduto);
		produtos.remove(posicaoProduto);
		System.out.println(item + " - removido!");

	}

	
	private void criarItemLoja() {

		for (int i = 0; i < 4; i++) {
			Item item = new Item();
			item.valorItem();
			this.produtos.add(item);
		}
	}

	@Override
	public void vender(LojaGeral comprador, Pessoa vendedor) { // CLIENTE VENDE PARA LOJA

		
		
		
		
		
		Item produto = Programa.personagem.getItem();
		comprador.repositorio.produtos.add(produto);
		caixaLoja = caixaLoja - produto.valorItemCliente();
		System.out.println(produto + " == Produto comprado pela loja!");

//		vendedor.setItem(null); // PODE ESTOURAR UM NULL POINTER NA TELA

	}

	@Override
	public void comprar(Item item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void catalogo(String tipo) {

		
		

	}

	@Override
	public void listarItens() {
		// TODO Auto-generated method stub
		
	}

}
