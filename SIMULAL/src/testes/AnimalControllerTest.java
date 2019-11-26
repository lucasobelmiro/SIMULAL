package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import simulal.AnimalController;

class AnimalControllerTest {
	
	AnimalController ac;
	
	@BeforeEach
	void setUp() {
		ac = new AnimalController();
	}

	@Test
	void testRemocaoMaiorPeso() {
		//cadastrando animais
		assertEquals(1, ac.cadastrarCachorroFilhote());
		assertEquals(2, ac.cadastrarElefanteFilhote());
		assertEquals(3, ac.cadastrarMorcegoFilhote());
		
		//crescendo cachorro 3x
		ac.crescer(1);
		ac.crescer(1);
		ac.crescer(1);
		
		//crescendo elefante 2x
		ac.crescer(2);
		ac.crescer(2);
		
		//crescendo morcego 1x
		ac.crescer(3);
		
		//removendo o animal mais pesado
		assertEquals(2, ac.remove());
	}
	
	@Test
	void testRemocaoMaiorIdade() {
		//cadastrando animais
		assertEquals(1, ac.cadastrarCachorroFilhote());
		assertEquals(2, ac.cadastrarElefanteFilhote());
		assertEquals(3, ac.cadastrarMorcegoFilhote());
		
		//crescendo cachorro 3x
		ac.crescer(1);
		ac.crescer(1);
		ac.crescer(1);
		
		//crescendo elefante 2x
		ac.crescer(2);
		ac.crescer(2);
		
		//crescendo morcego 1x
		ac.crescer(3);
		
		//configurando remocao por idade
		ac.configurarRemocao("IDADE");
		assertEquals(1, ac.remove());
	}
}