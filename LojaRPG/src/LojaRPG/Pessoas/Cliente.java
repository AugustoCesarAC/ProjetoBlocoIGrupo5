package LojaRPG.Pessoas;

import java.util.Random;

import LojaRPG.Item;

public class Cliente extends Pessoa
{

	Random rand = new Random();
	Item item = new Item();
	
	public int CRF;//CPF DE RAÇA
	public double carteira;//SALDO DINHEIRO
	
	public void geradorCRF()
	{
		this.CRF = rand.nextInt(100000,999999);
	}
	public void invCli()
	{
		this.item.criarItem();
	}
	
	
	
	
}
