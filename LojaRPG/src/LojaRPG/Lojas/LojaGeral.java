package LojaRPG.Lojas;

import LojaRPG.Item;
import LojaRPG.Loja;

public abstract class LojaGeral implements Loja {
	

	protected double caixaLoja;// DINHEIRO NO CAIXA
	protected Item produto[];// PRODUTOS DIVERSOS

	public void menuLoja() {
		
		System.out.println("Menu da loja geral");
		
		
	}
}
