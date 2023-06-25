
public class Cliente implements Comprador{
	private int codigo;
	private String nome;
	private int totalCompra;
	private static int cli_cod = 2000;
	
	
	public Cliente(String n,int tc) {
		codigo = cli_cod++;
		nome = n;
		totalCompra = tc;
		
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getTotalCompra() {
		return totalCompra;
	}
	public void setTotalCompra(int totalCompra) {
		this.totalCompra = totalCompra;
	}
	public static int getCli_cod() {
		return cli_cod;
	}
	public static void setCli_cod(int cli_cod) {
		Cliente.cli_cod = cli_cod;
	}
	@Override
	public int pagar(Caixa cx) {
		
		if (cx.getTc().getMaxProdutos() *0.2 < totalCompra)
			return 10;
		
		return 0;
	}
	@Override
	public String toString() {
		return "Cliente [num=" + codigo + ", nome=" + nome + ", nprodutos=" + totalCompra + "]";
	}
	
}
