package vetor;

import java.util.Locale;
import java.util.Scanner;

public class ProdutoTeste {

    public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner scan = new Scanner(System.in);
	
	Produto [] produtos;
	
	System.out.print("Quantos produtos quer registrar? ");
	int qtd = scan.nextInt();
	
	produtos = new Produto [qtd];
	
	/*for (int i=0; i < produtos.length; i++) {
	    produtos[i] = new Produto();
	    System.out.print("Nome do produto "+ (i+1)+ ": ");
	    scan.nextLine();
	    String nome = scan.nextLine();
	    produtos[i].setNome(nome);
	    System.out.print("Preço: ");
	    double preco = scan.nextDouble();
	    produtos[i].setPreco(preco);
	}*/
	for (int i=0; i < produtos.length; i++) {
	    System.out.print("Nome do produto "+ (i+1)+ ": ");
	    scan.nextLine();
	    String nome = scan.nextLine();
	    System.out.print("Preço: ");
	    double preco = scan.nextDouble();
	    produtos[i] = new Produto(nome, preco);
	}
	
	double sum = 0;
	for (int i = 0; i < qtd; i++) {
	    sum += produtos[i].getPreco();
	}
	System.out.printf("Preço médio dos produtos: %.2f", (sum / produtos.length));
	
	scan.close();

    }

}
