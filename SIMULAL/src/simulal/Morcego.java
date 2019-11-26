package simulal;

public class Morcego extends Animal {

	public Morcego(int id) {
		super(0.002, 'P', id);
	}
	
	public void crescer() {
		this.setIdade(1);
		this.setPeso(0.002);
	}
	
	@Override
	public String toString() {
		return "BAT " + this.id + " - " + this.peso + " kg - " + this.idade + " - " + this.tamanho;
	}
}