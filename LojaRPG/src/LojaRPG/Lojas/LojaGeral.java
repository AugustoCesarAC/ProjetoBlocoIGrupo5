package LojaRPG.Lojas;

import java.util.Arrays;
import java.util.List;

import LojaRPG.Item;
import LojaRPG.Transacoes;
import LojaRPG.Pessoas.Funcionario;
import LojaRPG.Pessoas.Pessoa;

public  class LojaGeral implements Transacoes {

	protected double caixaLoja;// DINHEIRO NO CAIXA
	protected String espacoLoja;// FRASE CONTEXTUALIZANDO LOJA
	protected List<Funcionario> listaDefuncionarios = Arrays.asList(new Funcionario("Joao", "Elfo", "Gerente"),
			new Funcionario("Nome2", "raça", "Analista"), new Funcionario("Nome3", "raça", "Gerente"));
	protected LojaRepo repositorio; // ESTOQUE DA LOJA

	public void menuLoja() {
	}

	public void catalogo(String tipo) {

	}

	@Override
	public void comprar(Item item) {
		// TODO Auto-generated method stub
		
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

	@Override
	public void adicionar(List<Item> listaItens) {
		// TODO Auto-generated method stub
		
	}
}
