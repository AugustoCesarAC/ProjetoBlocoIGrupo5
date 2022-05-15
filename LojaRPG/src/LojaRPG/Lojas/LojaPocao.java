package LojaRPG.Lojas;

public class LojaPocao extends LojaGeral
{

	private int tipo;
	private String nome;
	private int estoque;
	private double valorUnitario;
	
	public LojaPocao(int tipo, String nome) {
	
		this.tipo = tipo;
		
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	
	public void incluirEstoque(int quantidade) {
		estoque = estoque + quantidade;
		
	}
	
	public void tirarEstoque(int quantidade) {
		
		if(quantidade <= estoque) {
			
			estoque = estoque - quantidade;
			
		}
		else 
		{
			System.out.println("Estoque indisponivel!!!");
		
		}
	
	}
}
