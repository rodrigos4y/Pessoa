package application;

import entities.Pessoa;

public class Main {
	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		
		pessoa.setNome("Rodrigo");
		pessoa.setAltura(1.70);
		pessoa.setDiaNascimento(17);
		pessoa.setMesNascimento(12);
		pessoa.setAnoNascimento(1976);
		
		pessoa.calcularIdade(2020);
		pessoa.imprimir();
		
		
		
	}
}