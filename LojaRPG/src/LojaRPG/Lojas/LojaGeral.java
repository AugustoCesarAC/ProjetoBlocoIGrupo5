package LojaRPG.Lojas;

import java.util.ArrayList;
import java.util.Random;

import LojaRPG.Item;
import LojaRPG.Loja;

public class LojaGeral implements Loja
{

	Random rand = new Random();
	Item item = new Item();
	
	private double caixaLoja;// DINHEIRO NO CAIXA
	private Item produto[];//PRODUTOS DIVERSOS
	private double especimeCobre;//A MOEDA DO LOCAL
	
	
	//METODO CONSTRUTOR
	public LojaGeral()
	{
		this.caixaLoja = 2000.50;
	}

	@Override
	public void comprar()
	{
		
		
	}

	@Override
	public void vender()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void adicionar()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remover()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void catalogoLoja()
	{
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
