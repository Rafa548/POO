package Aula11.Ex2;

public class voos {
	private Tempo hora;
	private String id;
	private String companhia;
	private String origem;
	private Tempo atraso;
	private String previsto;

	public voos(Tempo hora, String id, String companhia, String origem, Tempo atraso) {
		this.hora = hora; this.id = id; this.companhia = companhia; this.origem = origem; this.atraso = atraso;
		this.previsto = "Previsto : " + calcPrevisto(hora, atraso);
	}
	
	public Tempo getHora() {
		return hora;
	}

	public String getId() {
		return id;
	}

	public String getCompanhia() {
		return companhia;
	}

	public String getOrigem() {
		return origem;
	}

	public Tempo getAtraso() {
		return atraso;
	}

	public String getPrevisto() {
		return previsto;
	}

	@Override
	public String toString() {
		return String.format("%-15s%-15s%-30s%-25s%-15s%-15s", hora, id, companhia, origem, atraso, previsto);
	}

	public Tempo calcPrevisto(Tempo h, Tempo a) {
		return h.sub(a);
	}
}
