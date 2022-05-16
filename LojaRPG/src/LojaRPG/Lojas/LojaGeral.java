package LojaRPG.Lojas;

import java.util.ArrayList;
import java.util.List;

import LojaRPG.Item;
import LojaRPG.Loja;

public abstract class LojaGeral implements Loja {

	protected double caixaLoja;// DINHEIRO NO CAIXA
	protected List<Item> produto = new ArrayList<>();// PRODUTOS DIVERSOS

	
	
	public void menuLoja() {

	}

	
}
