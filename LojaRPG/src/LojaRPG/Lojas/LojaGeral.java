package LojaRPG.Lojas;

import java.util.Random;

import LojaRPG.Item;
import LojaRPG.Loja;

public class LojaGeral implements Loja
{

	Random rand = new Random();
	
	private double caixaLoja;// DINHEIRO NO CAIXA
	private int espacoLoja;// TAMANHO A DEFINIR DA LOJA
	private int metroQuadro[];// METRO QUADRADO DA LOJA
	private Item produto[];//PRODUTOS DIVERSOS
	private double especimeCobre;//A MOEDA DO LOCAL
	private double valorItem;
	
	//METODO CONSTRUTOR
	public LojaGeral()
	{
		this.caixaLoja = 2000.50;
	}
	
	public double valorItem()
	{
		this.valorItem  = rand.nextDouble(10,51);
		return valorItem;
	}

	@Override
	public void comprar()
	{
		// TODO Auto-generated method stub
		
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
