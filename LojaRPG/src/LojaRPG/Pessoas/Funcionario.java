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
		cod = numberInstances;
		numberInstances++;
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
		
		
		// eu nao sei se é melhor deixar tudo no metodo main ou aqui.
		//se for passar pelo metodo main pode passar o codigo da linha 35 até a 151
		
		ArrayList<Funcionario> funcionarios = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int nmr=-1;
		boolean funcNaoDisp = false;
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Joao");
		funcionario.setRaca("Elfo");
		funcionario.setCargo("Gerente");
		funcionario.setDisp(false);
		funcionario.definirSalarioComCargo(funcionario.getCargo());
		
		Funcionario funcionario1 = new Funcionario();
		funcionario1.setNome("Rebecca");
		funcionario1.setRaca("Demonio");
		funcionario1.setCargo("Analista");
		funcionario1.setDisp(true);
		funcionario1.definirSalarioComCargo(funcionario1.getCargo());
		
		Funcionario funcionario2 = new Funcionario();
		funcionario2.setNome("Rogerio");
		funcionario2.setRaca("Humano");
		funcionario2.setCargo("Vendedor");
		funcionario2.setDisp(true);
		funcionario2.definirSalarioComCargo(funcionario2.getCargo());
		
		Funcionario funcionario3 = new Funcionario();
		funcionario3.setNome("Julia");
		funcionario3.setRaca("Elfo");
		funcionario3.setCargo("Vendedor");
		funcionario3.setDisp(true);
		funcionario3.definirSalarioComCargo(funcionario3.getCargo());
	
		funcionarios.add(funcionario);
		funcionarios.add(funcionario1);
		funcionarios.add(funcionario2);
		funcionarios.add(funcionario3);
	
		while(nmr < 0 || nmr > 5) {
		
			System.out.println("\nOlá \"nome do cliente\" você deseja ser atendido por qual funcionário? ");
			System.out.println("Temos os seguintes funcionários disponíveis: \n");
			
			for(int i = 0; i<funcionarios.size();i++) {
				if(funcionarios.get(i).isDisp())
					System.out.println(i+" - " + funcionarios.get(i));
			}
			
			System.out.println(funcionarios.size()+" - Sair");
			System.out.println(funcionarios.size()+1+" - Para ver maiores informações sobre os funcionários.\n");
			nmr = sc.nextInt();
			
			// só vai executar se escolher a opçao 4, listar todos funcionarios
			if(nmr==funcionarios.size()+1) {// 4
				System.out.println("\nLista de todos os Funcionários na nossa Loja: \n");
				for(Funcionario func : funcionarios) {
					System.out.println(func.status());
				}

				System.out.println();
				
				System.out.println("Temos os seguintes funcionários disponíveis: \n");
				
				for(int i = 0; i<funcionarios.size();i++) {
					if(funcionarios.get(i).isDisp())
						System.out.println(i+" - " + funcionarios.get(i));
				}
				
				nmr = sc.nextInt();
				
				while(nmr < 0 || nmr >= funcionarios.size()) {
					System.out.println("Informe um número válido!!");

					System.out.println("Temos os seguintes funcionários disponíveis: \n");
					
					for(int i = 0; i<funcionarios.size();i++) {
						if(funcionarios.get(i).isDisp())
							System.out.println(i+" - " + funcionarios.get(i));
					}
					
					nmr = sc.nextInt();
				}
			
			}
			
			for(int i =0; i<funcionarios.size(); i++) {
				if(nmr == funcionarios.get(i).getCod() && funcionarios.get(i).isDisp() == false) {
					System.out.println("Funcionário não disponível no momento!!");
					funcNaoDisp = true;
				}
			}
			
			if(funcNaoDisp) {
				System.out.println("Informe um número válido!!");

				System.out.println("Temos os seguintes funcionários disponíveis: \n");
				
				for(int i = 0; i<funcionarios.size();i++) {
					if(funcionarios.get(i).isDisp())
						System.out.println(i+" - " + funcionarios.get(i));
				}
				
				nmr = sc.nextInt();
			}
			
			for(int i = 0; i<funcionarios.size();i++) {
				if(nmr == funcionarios.get(i).getCod() && funcionarios.get(i).isDisp()) {
					System.out.println("Bem vindo a loja de Espadas.");
					System.out.println("Eu sou "+funcionarios.get(i).getNome()+", me diga como posso ajudá-lo: ");
				}
			}
			
			
		}
		
		sc.close();
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
	
	public String toString() {
		return "Nome: "+getNome()+", Raça: "+getRaca()+", Cargo: "+getCargo();
	}
	
	public String status() {
		return "Cod: "+getCod()+", Nome: "+getNome()+", Cargo: "+getCargo()+", isDisp: "+isDisp();
	}
	
}