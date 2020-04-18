package negocio;

public class Funcionario {
	private String nome;
	private int qtdMeses;
	private float salarioBase;
	

	public float CalcularSalario() {
		
		return this.getQtdMeses()* this.getSalarioBase();
	}
	@Override
	public String toString() {
		
		return String.format(
				"O funcionário %s ganhou R$ %.2f", 
				this.getNome(),
				this.CalcularSalario());
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQtdMeses() {
		return qtdMeses;
	}
	public void setQtdMeses(int qtdMeses) {
		this.qtdMeses = qtdMeses;
	}
	public float getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}

}
