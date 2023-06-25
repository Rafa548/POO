import java.util.Set;
import java.util.TreeSet;

public class Supermercado {
	private String nome;
	private Set<Caixa> caixas;
	private Set<Trabalhador> trabalhadores;
	
	public Supermercado(String n) {
		nome = n;
		caixas = new TreeSet<Caixa>();
		trabalhadores = new TreeSet<Trabalhador>();
	}
	
	public void addCaixa (int n, TipoCaixa t) {
		caixas.add(new Caixa(n, t));
	}

	public Caixa getCaixa(int id) {
		for (Caixa c : caixas) {
			if (id == c.getNum())
				return c;
		}
		return null;
	}

	public String supermercadoInfo() {
		return "SUPERMERCADO: "+nome+" tem "+caixas.size()+" e "+trabalhadores.size()+" trabalhadores.\n";
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("SUPERMERCADO:"+this.nome+" [\n");
		sb.append("Trabalhadores = ");
		for (Trabalhador t : trabalhadores) {
			sb.append(t);
			sb.append(",");
		}
		sb.append("\nCaixas = {");
		int i = 0;
		for (Caixa c : caixas) {
			i++;
			sb.append(i+"="+c+", ");
		}
		sb.append("}");
		sb.append("]\n");
		return sb.toString();
	}

	public void addTrabalhador(Trabalhador obj) {
		trabalhadores.add(obj);
		
	}
	
	
}
