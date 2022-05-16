package LojaRPG.Lojas;

public class LojaArco extends LojaGeral
{
	private String nomeArco;
	
	private String materialArco;  
	private String magiaArco;
	private int danoArco;
	private int estoque;
	
	
	
	public String getNomeArco() {
		return nomeArco;
	}
	
	
	public void setNomeArco(String nomeArco) {
		this.nomeArco = nomeArco;
	}
	

	
	public String getMaterialArco() {
		return materialArco;
	}
	
	public void setMaterialArco(String materialArco) {
		this.materialArco = materialArco;
	}
	
	
	public String getMagiaArco() {
		return magiaArco;
	}
	
	
	public void setMagiaArco(String magiaArco) {
		this.magiaArco = magiaArco;
	}
	
	
	public int getDanoArco() {
		return danoArco;
	}
	
	
	public void setDanoArco(int danoArco) {
		
		this.danoArco = danoArco;
		
		if ((danoArco<6) && (danoArco >0)) {
			System.out.println("Dano é: " +this.danoArco);
		}
		else {
			System.out.println("Dano inválido");
		}
	}
	
	
	public int getEstoque() {
		return estoque;
	}
	
	
	public void setEstoque(int estoque) {
		
		this.estoque = estoque;
	}
	public void incluirEstoque(int quantidade) {
		estoque = estoque + quantidade;
		}
	
	
	
	public void tirarEstoque(int quantidade) {
		if (quantidade <= estoque) {
			estoque = estoque - quantidade;
		}
		else {
			System.out.println("Estoque indisponível!!");
		}
	}
	//ideia: deixar estoque na loja geral*
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

    
