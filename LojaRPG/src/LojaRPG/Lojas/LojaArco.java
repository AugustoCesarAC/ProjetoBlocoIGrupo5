package LojaRPG.Lojas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import LojaRPG.Item;
import LojaRPG.Pessoas.Pessoa;

public class LojaArco extends LojaGeral {

	@Override
	public void menuLoja() {
		System.out.println("Menu da loja Arco e flecha");
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

	}

	@Override
	public void listarItens() {
		// TODO Auto-generated method stub
		
	}

}
