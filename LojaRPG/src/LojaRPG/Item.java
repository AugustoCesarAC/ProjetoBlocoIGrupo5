package LojaRPG;

import java.util.ArrayList;
import java.util.Random;

import LojaRPG.Lojas.LojaGeral;

public class Item extends LojaGeral
{

	Random rand = new Random();
	
	ArrayList<String> listItem = new ArrayList<>();
	public String nome[] = {"Armadura ","Elmo ","Botas ","Luvas ","Adaga ","Espada ","Arco ","Cajado "};
	public String plus[] = {"do Trovão","do Fogo","da Agua","do Ar","da Terra","do Sangue"};
	public int tamanho = rand.nextInt(10);
	public String armazenar[] = new String[this.tamanho]; 
	public double peso = rand.nextDouble(3,7);
	public double calc;
	
	public double calcValorLoja()
	{
		this.calc = (this.valorItem()*1.2) + (peso*3);
		return calc;
	}
	
	public double calcValorCliente()
	{
		this.calc = (this.valorItem()*0.8);
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
