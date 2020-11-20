package entities;

public class Pessoa {
	
	private String nome;
	private String data;
	private Double altura;
	
	public Pessoa() {
	}

	public Pessoa(String nome, String data, Double altura) {
		this.nome = nome;
		this.data = data;
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}
	
		
}
