
public class Restaurante {
	private String nome;
	private TipoComida tipo;
	
	public Restaurante(String nome, TipoComida tipo) {
		this.nome = nome;
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TipoComida getTipo() {
		return tipo;
	}

	public void setTipo(TipoComida tipo) {
		this.tipo = tipo;
	}
}
