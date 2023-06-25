
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
import java.util.LinkedList;


public class POO2021rec {
	public static void main(String[] args) throws FileNotFoundException {
		String pre = Files.exists(Paths.get(System.getProperty("user.dir"),"src")) ?  "src/" :  "";
		PrintStream fl = new PrintStream(new File(pre+"POO2021recB.txt"));
		test(System.out); // executa e escreve na consola
		fl.println(System.getProperty("user.name") + "\n" + System.getProperty("user.dir"));
		test(fl); // executa e escreve no ficheiro
		fl.close();
	} 

	private static void test(PrintStream out) {
		alinea1(out);
		alinea2(out);
	}

	private static void alinea1(PrintStream out) {
		out.println("\nAlínea 1) ----------------------------------\n");

		// Adicione a seguir o código necessário, conforme pedido no enunciado





		// Não modifique o metodo a partir daqui. Pode comentar para executar o programa

		Cliente cl1 = new Cliente("Jose", 30);
		Cliente cl2 = new Cliente("Hugo", 60);
		for(int i = 1; i<=3; i++) {
			out.println(cl1 + " - Caixa tipo " + superm.getCaixa(i).getTipoCaixa() + " - Desconto obtido = " + cl1.pagar(superm.getCaixa(i)));
			out.println(cl2 + " - Caixa tipo " + superm.getCaixa(i).getTipoCaixa() + " - Desconto obtido = " + cl2.pagar(superm.getCaixa(i)));
		}
		out.println("* Caixas cujo máximo de produtos é maior do que o número de produtos do cliente cl2");
		out.println("Cliente " + cl2.getNome() + ": " + superm.getCaixasCliente(cl2));
	}

	private static void alinea2(PrintStream out) {
		out.println("\nAlínea 2) ----------------------------------\n");



	}
}
