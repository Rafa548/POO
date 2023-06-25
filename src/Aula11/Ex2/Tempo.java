package Aula11.Ex2;

public class Tempo {
	private int mins;
	
	public Tempo(String s) {
		this.mins = (Integer.parseInt(s.split(":")[0])*60) + Integer.parseInt(s.split(":")[1]);
	}
	public Tempo(int mins) {
		this.mins = mins;
	}
	
	
	@Override
	public String toString() {
		String h = String.valueOf(mins / 60);
		String m = String.valueOf(mins % 60);
		if(Integer.parseInt(h)<10) {
			h = "0"+h;
		}
		if(Integer.parseInt(m)<10) {
			m = "0"+m;
		}
		return h+":"+m;
	}
	public Tempo sub(Tempo t) {
		return new Tempo(this.mins + t.mins);
	}

}
