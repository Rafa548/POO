package ex02;

public class Piloto implements Comparable<Piloto>{
	private int posicao;
	private String nome;
	private String nacionalidade;
	private String carro;
	private int pontos;
	
	
	public Piloto(int p, String n, String nac, String c, int pont) {
		posicao = p;
		nome = n;
		nacionalidade = nac;
		carro = c;
		pontos = pont;
	}


	public int getPosicao() {
		return posicao;
	}


	public void setPosicao(int posicao) {
		this.posicao = posicao;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getNacionalidade() {
		return nacionalidade;
	}


	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}


	public String getCarro() {
		return carro;
	}


	public void setCarro(String carro) {
		this.carro = carro;
	}


	public int getPontos() {
		return pontos;
	}


	public void setPontos(int pontos) {
		this.pontos = pontos;
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.posicao);
		sb.append(" - ");
		sb.append(this.nome);
		sb.append(" - ");
		sb.append(this.nacionalidade);
		sb.append(" - ");
		sb.append(this.carro);
		sb.append(" - ");
		sb.append(this.pontos);
		return sb.toString();
	}
	
	
		public String toStringUpper() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.posicao);
		sb.append(" - ");
		sb.append(this.nome.toUpperCase());
		sb.append(" - ");
		sb.append(this.nacionalidade);
		sb.append(" - ");
		sb.append(this.carro);
		sb.append(" - ");
		sb.append(this.pontos);
		return sb.toString();
	}
	
	public int compareTo(Piloto obj) {
		if (this.posicao > obj.getPosicao()) {
			return 1;
		} else if (this.posicao < obj.getPosicao()) {
			return -1;
		} else {
			return 0;
		}
	}
	
}
