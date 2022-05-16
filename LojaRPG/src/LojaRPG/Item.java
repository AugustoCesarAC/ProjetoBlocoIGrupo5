package LojaRPG;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;

public class Item
{

	Random rand = new Random();
	DecimalFormat df = new DecimalFormat("#.##");
	
	private String nome[] = {"Armadura ","Elmo ","Botas ","Luvas ","Adaga ","Espada ","Arco ","Cajado "};
	private String plus[] = {"do Trovão","do Fogo","da Agua","do Ar","da Terra","do Sangue"};
	private String armazenar; 
	private double valorItem;
	private double peso;
	private double calc;
	
	ArrayList<String> listItem = new ArrayList<>();
	
	public double valorItem()
	{
		this.valorItem  = rand.nextDouble(10,51);
		return valorItem;
	}
	
	public void criarItem()
	{
		for(int x = 0; x < 5; x++)
		{
			this.peso = rand.nextDouble(3,7);
			this.armazenar = nome[rand.nextInt(8)] + plus[rand.nextInt(6)] + " " + df.format(peso) + "Kg";
			this.listItem.add(this.armazenar);
			System.out.println(this.armazenar);
		}
	}
	
	public void valorItemLoja()
	{
		for(int x = 0; x < 5; x++)
		{
			this.calc = (this.valorItem()*1.2) + (peso*3);
			System.out.print(listItem.get(x));
			System.out.printf(" e o valor em cobre é: %.2f%n", this.calc);
			System.out.println("");
		}
	}
	
	public void valorItemClient()
	{
		for(int x = 0; x < 5; x++)
		{
			this.calc = (this.valorItem()*0.8);
			System.out.print(this.listItem.get(x));
			System.out.printf(" e o valor em cobre é: %.2f%n", this.calc);
			System.out.println("");
		}
	}
	
}
