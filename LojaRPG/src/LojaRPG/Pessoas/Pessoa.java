package LojaRPG.Pessoas;

import LojaRPG.Item;

public class Pessoa
{
	
	private String nome;
	private String raca;
	//private String raca[] = {"Elfo","Anão","Humano","Demonio"};
	//public String classe[] = {"Barbaro","Arqueiro","Mago"};
	private Item item = new Item();
//	private List<Item> item = new ArrayList<>();
	
	//METODO CONSTRUTOR
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, String raca) {
		this.nome = nome;
		this.raca = raca;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return raca;
	}


	public void setRaca(String raca) {
		this.raca = raca;
	}


	public Item getItem() {
		return this.item;
	}

	public void setItem(Item item) {
		if(this.item != null) {
			System.out.println("Você só pode ter um item, venda ou vá embora!");
			
		}
			this.item = item;
		
//		this.item.add(item);
	}

	public void charNome()
	{
		
	}
	
	public void charRaca()
	{
		
	}
	
	public void itemRelatorio()
	{
		
	}
	
	
}
