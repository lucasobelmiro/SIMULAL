package simulal;

import java.util.Comparator;

public class compPeso implements Comparator<Animal> {

	@Override
	public int compare(Animal o1, Animal o2) {
		if(o1.peso < o2.peso) {
			return -1;
		} else if (o1.peso == o2.peso) {
			return 0; 
		} else {
			return 1;
		}
	}
}