package entities;

public class Pessoa {
	
	private String nome;
	private Integer diaNascimento;
	private Integer mesNascimento;
	private Integer anoNascimento;
	private Double altura;
	private Integer idade;
	
	public Pessoa() {
	}

	public Pessoa(String nome, Integer diaNascimento, Integer mesNascimento, Integer anoNascimento, Double altura) {
		this.nome = nome;
		this.diaNascimento = diaNascimento;
		this.mesNascimento = mesNascimento;
		this.anoNascimento = anoNascimento;
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getDiaNascimento() {
		return diaNascimento;
	}

	public void setDiaNascimento(Integer diaNascimento) {
		this.diaNascimento = diaNascimento;
	}

	public Integer getMesNascimento() {
		return mesNascimento;
	}

	public void setMesNascimento(Integer mesNascimento) {
		this.mesNascimento = mesNascimento;
	}

	public Integer getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(Integer anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Integer calcularIdade(Integer anoAtual) {
		idade = anoAtual - this.anoNascimento;
		
		return idade;
	}
	
	public void imprimir() {
		System.out.println(nome);
		System.out.println(diaNascimento + "/" + mesNascimento + "/" + anoNascimento);
		System.out.println(altura);
		System.out.println(idade);
	}
		
}
