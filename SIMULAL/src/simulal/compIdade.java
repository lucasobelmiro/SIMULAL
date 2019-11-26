package simulal;

import java.util.Comparator;

public class compIdade implements Comparator<Animal>{

	@Override
	public int compare(Animal o1, Animal o2) {
		if(o1.idade < o2.idade) {
			return -1;
		}else if(o1.idade == o2.idade) {
			return 0;
		}else {
			return 1;
		}
	}
}