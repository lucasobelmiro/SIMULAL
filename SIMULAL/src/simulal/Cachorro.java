package simulal;

public class Cachorro extends Animal {

	public Cachorro(int id) {
		super(0.4,'P',id);

	}
	
	public void setTamanho(char tamanho) {
		this.tamanho = tamanho;
	}
	
	@Override
	public String toString() {
		return "CAO " + this.id + " - " + this.peso + " kg - " + this.idade + " - " + this.tamanho;
	}

	@Override
	public void crescer() {
		this.setPeso(0.7);
		this.setIdade(1);
		if(this.peso > 10) {
			this.setTamanho('M');
		}
	}
}