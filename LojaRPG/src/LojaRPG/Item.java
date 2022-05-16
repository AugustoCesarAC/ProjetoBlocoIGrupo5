package LojaRPG;

import java.util.Random;

public class Item {

	Random rand = new Random();

	private String nome;
	private String plus;
	public int tamanho = rand.nextInt(10);
//	public String armazenar[] = new String[this.tamanho]; 
	private double valorItem;
	private double peso = rand.nextDouble(3, 7);
//	public double calc;//???

	public Item() {
		String nome[] = { "Armadura ", "Elmo ", "Botas ", "Luvas ", "Adaga ", "Espada ", "Arco ", "Cajado " };
		this.nome = nome[rand.nextInt(8)];

		String plus[] = { "do Trovãoo", "do Fogo", "da Agua", "do Ar", "da Terra", "do Sangue" };
		this.plus = plus[rand.nextInt(6)];
//		this.nome = geraNome(8);
//		this.plus = geraPlus(6);
	}

//	public Item(int valorNome, int valorPlus) {
//		this.nome = geraNome(valorNome);
//		this.plus = geraPlus(valorPlus);
//	}

//	private String geraNome(int posicao)//posicao 8 {
//		String nome[] = {"Armadura ","Elmo ","Botas ","Luvas ","Adaga ","Espada ","Arco ","Cajado "};
//		return nome[rand.nextInt(posicao)];
//	}

//	private String geraPlus(int posicao)posicao 6 {
//		String plus[] = {"do Trovãoo","do Fogo","da Agua","do Ar","da Terra","do Sangue"};
//		return plus[rand.nextInt(posicao)];
//	}

	public double valorItem() {
		this.valorItem = rand.nextDouble(10, 51);
		return valorItem;
	}

	

	public double calcValorLoja() {

		return (valorItem() * 1.2) + (peso * 3);
	}

	public double calcValorCliente() {
		return (valorItem() * 0.8);
	}

//	public void criarItemClient()
//	{
//		for(int x = 0; x < this.armazenar.length; x++)
//		{
//			this.armazenar[x] = nome[rand.nextInt(8)] + plus[rand.nextInt(6)];
//			System.out.print(this.armazenar[x]);
//			System.out.printf(" e o valor em cobre é: %.2f%n", this.calcValorCliente());
//			System.out.println("");
//		}
//	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("nome: " + this.nome);
		sb.append(" " + this.plus);
		sb.append(" Peso " + String.format("%.2f", this.peso) + "Kgs");
		sb.append(" Valor: " + String.format("$%.2f", this.valorItem) +" Cobres");
		return sb.toString();
	}

}