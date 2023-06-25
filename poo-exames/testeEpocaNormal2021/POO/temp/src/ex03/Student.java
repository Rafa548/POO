package ex03;

public class Student {
	private int nmec;
	private String nome;
	private double atp;
	private double ac;
	private double ap;
	private int notaFinal;
	
	public Student(int nmec, String nome, double atp, double ac, double ap) {
		this.nmec = nmec;
		this.nome = nome;
		this.atp = atp;
		this.ac = ac;
		this.ap = ap;
		this.notaFinal = (int) Math.round(0.3*this.atp+ 0.2*this.ac+0.5*this.ap);
	}

	public int getNmec() {
		return nmec;
	}

	public void setNmec(int nmec) {
		this.nmec = nmec;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getAtp() {
		return atp;
	}

	public void setAtp(double atp) {
		this.atp = atp;
	}

	public double getAc() {
		return ac;
	}

	public void setAc(double ac) {
		this.ac = ac;
	}

	public double getAp() {
		return ap;
	}

	public void setAp(double ap) {
		this.ap = ap;
	}

	public int getNotaFinal() {
		return notaFinal;
	}

	public void setNotaFinal(int notaFinal) {
		this.notaFinal = notaFinal;
	}
	
	
}
