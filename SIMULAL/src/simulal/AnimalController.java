package simulal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnimalController {
	
	public Map<Integer, Animal> animais;
	public int cont;
	Comparator<Animal> comp = new compPeso();
	
	public AnimalController() {
		this.animais = new HashMap<>();
		cont = 0;
	}
	
	public int cadastrarCachorroFilhote() {
		cont ++;
		int id = cont;
		Cachorro cachorro = new Cachorro(id);
		animais.put(id, cachorro);
		return id;
	}
	
	public int cadastrarElefanteFilhote() {
		cont ++;
		int id = cont;
		Elefante elefante = new Elefante(id);
		animais.put(id, elefante);
		return id;
	}
	
	public int cadastrarMorcegoFilhote() {
		cont ++;
		int id = cont;
		Morcego morcego = new Morcego(id);
		animais.put(id, morcego);
		return id;
	}
	
	public String exibirAnimal(int id) {
		if (animais.containsKey(id)) {
			return animais.get(id).toString();
		}
		else {
			throw new IllegalArgumentException("Animal nao cadastrado");
		}
	}
	
	public void crescer(int id) {
		if(animais.containsKey(id)) {
			animais.get(id).crescer();
		}
		else {
			throw new IllegalArgumentException("Animal nao cadastrado");
		}
	}
	
	public void configurarRemocao(String estrategia) {
		if(estrategia.equals("PESO")) {
			comp = new compPeso();
		}
		else if(estrategia.equals("IDADE")) {
			comp = new compIdade();
		}
		else {
			throw new IllegalArgumentException("Estrategia invalida");
		}
	}
	
	public int remove() {
		List<Animal> lista = new ArrayList<Animal>();
		for (Animal animal : animais.values()) {
			lista.add(animal);
		}
		Animal removido = Collections.max(lista, comp);
		animais.remove(removido.id);
		return removido.id;
	}
}