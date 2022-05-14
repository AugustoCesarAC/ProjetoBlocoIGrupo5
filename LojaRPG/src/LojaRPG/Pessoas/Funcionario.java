package LojaRPG.Pessoas;

import java.util.ArrayList;
import java.util.Scanner;

public class Funcionario extends Pessoa{

	private int cod;
	private static int numberInstances; // contador de objetos instanciados.
	private double salario;
	private String cargo;
	private boolean disp; // se está disponível para atender o cliente
	
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
	
	public static int menu() {
		
		ArrayList<Funcionario> funcionarios = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int nmr=0;
		
		Funcionario funcionario1 = new Funcionario();
		funcionario1.setNome("Joao");
		funcionario1.setRaca("Elfo");
		funcionario1.setCargo("Gerente");
		funcionario1.setDisp(false);
		funcionario1.definirSalarioComCargo(funcionario1.getCargo());
		
		Funcionario funcionario2 = new Funcionario();
		funcionario2.setNome("Rebecca");
		funcionario2.setRaca("Demonio");
		funcionario2.setCargo("Analista");
		funcionario2.setDisp(true);
		funcionario2.definirSalarioComCargo(funcionario2.getCargo());
		
		Funcionario funcionario3 = new Funcionario();
		funcionario3.setNome("Tadeu");
		funcionario3.setRaca("Humano");
		funcionario3.setCargo("Vendedor");
		funcionario3.setDisp(true);
		funcionario3.definirSalarioComCargo(funcionario3.getCargo());
	
		funcionarios.add(funcionario1);
		funcionarios.add(funcionario2);
		funcionarios.add(funcionario3);
		
		do
		{
		
			System.out.println("\nOlá \"nome do cliente\" você deseja ser atendido por qual funcionário? ");
			System.out.println("Temos os seguintes funcionários disponíveis: \n");
			
			for(int i = 0; i<funcionarios.size();i++) {
				if(funcionarios.get(i).isDisp())
					System.out.println(i+1+" - " + funcionarios.get(i));
			}
		
			System.out.println();
			System.out.println(funcionarios.size()+1+" - Para ver maiores informações sobre os funcionários.");
			nmr = sc.nextInt();
			
			if(nmr==funcionarios.size()+1) {
				System.out.println("\nLista de todos os Funcionários na nossa Loja: \n");
				for(Funcionario func : funcionarios) {
					System.out.println(func.status());
				}
			}
		
			System.out.println("1 - para voltar a tela anterior\n0 - para sair do programa");
			nmr = sc.nextInt();
	
		}while(nmr != 0);
		sc.close();
		nmr = 0;
		return nmr;
	}
	
	public boolean isDisp() {
		return disp;
	}

	public void setDisp(boolean disp) {
		this.disp = disp;
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
	
	public String getCargo() {
		return cargo;
	}
	
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public String status() {
		return "Nome: "+getNome()+", Raça: "+getRaca()+", Cargo: "+getCargo()+", Salário: "+getSalario();
	}
	
	public String toString() {
		return "Nome: "+getNome()+", Raça: "+getRaca()+", Cargo: "+getCargo();
		
	}
	
}