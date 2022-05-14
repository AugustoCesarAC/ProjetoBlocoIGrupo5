package LojaRPG;

import java.util.Random;

public class Item
{

	Random rand = new Random();
	
	public String nome[] = {"Armadura ","Elmo ","Botas ","Luvas ","Adaga ","Espada ","Arco ","Cajado "};
	public String plus[] = {"do Trovão","do Fogo","da Agua","do Ar","da Terra","do Sangue"};
	public int tamanho = rand.nextInt(10);
	public String armazenar[] = new String[this.tamanho]; 
	public double valorItem;
	public double peso = rand.nextDouble(3,7);
	public double calc;
	
	
	public double valorItem()
	{
		this.valorItem  = rand.nextDouble(10,51);
		return valorItem;
	}
	
	public double calcValorLoja()
	{
	
		this.calc = (valorItem()*1.2) + (peso*3);
		return calc;
	}
	
	public double calcValorCliente()
	{
		this.calc = (valorItem()*0.8);
		return calc;
	}
	
	public void criarItemLoja()
	{
		for(int x = 0; x < this.armazenar.length; x++)
		{
			this.armazenar[x] = nome[rand.nextInt(8)] + plus[rand.nextInt(6)];
			System.out.print(this.armazenar[x]);
			System.out.printf(" e o valor em cobre é: %.2f%n", this.calcValorLoja());
			System.out.println("");
		}
	}
	
	public void criarItemClient()
	{
		for(int x = 0; x < this.armazenar.length; x++)
		{
			this.armazenar[x] = nome[rand.nextInt(8)] + plus[rand.nextInt(6)];
			System.out.print(this.armazenar[x]);
			System.out.printf(" e o valor em cobre é: %.2f%n", this.calcValorCliente());
			System.out.println("");
		}
	}
	
}
