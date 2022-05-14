package LojaRPG;

import LojaRPG.Pessoas.Funcionario;

public class DiaaDia
{

	public static void main(String[] args)
	{
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Joao");
		funcionario.setRaca("Elfo");
		funcionario.setCargo("Vendedor");
		funcionario.definirSalarioComCargo(funcionario.getCargo());
		
		funcionario.status();
		
		System.out.println();
		
		Funcionario funcionario2 = new Funcionario();
		funcionario2.setNome("Joaorggggf");
		funcionario2.setRaca("Elfofgfgfggf");
		funcionario2.setCargo("Vendedor");
		funcionario2.definirSalarioComCargo(funcionario2.getCargo());
		
		funcionario2.status();
		
		System.out.println();
		
		Funcionario funcionario3 = new Funcionario();
		funcionario3.setNome("Joaorggggf");
		funcionario3.setRaca("Elfofgfgfggf");
		funcionario3.setCargo("Gerente");
		funcionario3.definirSalarioComCargo(funcionario3.getCargo());
	
		funcionario3.status();
		

	}

}