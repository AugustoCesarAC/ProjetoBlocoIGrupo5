package LojaRPG.Pessoas;

public class Funcionario extends Pessoa
{
	
	private int cod;
	private static int numberInstances;
	private double salario;//GANHA PÃO
	private boolean chave = false;//ACESSAR A LOJA
	private String cargo;

	public Funcionario() {
		numberInstances++;
		cod = numberInstances;
	}

	public String definirSalarioComCargo(String cargo) {
		if(this.cargo.equalsIgnoreCase("Gerente"))
			this.salario = 8000;
		else if(this.cargo.equalsIgnoreCase("Analista"))
			this.salario = 5000;
		else
			this.salario = 2500;
		return cargo;
	}
	
	public int getCod() { 
		return cod;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public boolean isChave() {
		return chave;
	}
	
	public void setChave(boolean chave) {
		this.chave = chave;
	}
	
	public String getCargo() {
		return cargo;
	}
	
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public void entrarLoja() {
		this.chave = true;
	}
	
	public void status() {
		System.out.println(getCod()+"\n"+getNome()+"\n"+getRaca()+"\n"+getSalario()+"\n"+getCargo());
	}
	
}