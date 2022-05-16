package LojaRPG;

import LojaRPG.Lojas.LojaGeral;
import LojaRPG.Pessoas.Pessoa;

public interface Transacoes
{

	void comprar(Item item);
	
	void vender(Pessoa vendedor, LojaGeral comprador);
	void vender(LojaGeral comprador, Pessoa vendedor);
	
	void adicionar();
	
	void remover();
	
	void catalogo(String tipo);
	
	void listarItens();
	
}
