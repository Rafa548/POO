package ex02;

import java.util.Comparator;

public class sortPontosDecr implements Comparator<Piloto>{
	@Override
	public int compare(Piloto p1, Piloto p2) {
		return p2.getPontos() - p1.getPontos();
	}
}
