package simulal;

public abstract class Animal {
	
	protected int idade;
	protected double peso;
	protected char tamanho;
	protected int id;
	
	public void setIdade(int idade) {
		this.idade += idade;
	}
	
	public void setPeso(double peso) {
		this.peso += peso;
	}
	
	public abstract void crescer();
	
	public Animal(double peso, char tamanho, int id) {
		this.idade = 0;
		this.peso = peso;
		this.tamanho = tamanho;
		this.id = id;
	}
}