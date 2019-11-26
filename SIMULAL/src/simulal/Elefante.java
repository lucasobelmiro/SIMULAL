package simulal;

public class Elefante extends Animal {

	public Elefante(int id) {
		super(120, 'G', id);
	}
	
	public void crescer() {
		this.setIdade(1);
		if(this.idade <= 20) {
			this.setPeso(250);
		}
	}
	
	@Override
	public String toString() {
		return "FANTE " + this.id + " - " + this.peso + " kg - " + this.idade + " - " + this.tamanho;
	}
}