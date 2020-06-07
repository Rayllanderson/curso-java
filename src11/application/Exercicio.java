package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio {

    public static void main(String[] args) {
	Locale.setDefault(Locale.US);

	Scanner scan = new Scanner(System.in);

	List<Produto1> list = new ArrayList<>();

	System.out.print("Entre com o caminho da pasta: ");
	String caminhoPasta = scan.nextLine();

	File file = new File(caminhoPasta);
	String path = file.getParent();
	boolean success = new File(path + "\\out").mkdir();
	String targetFileStr = path + "\\out\\summary.txt";

	try (BufferedReader br = new BufferedReader(new FileReader(caminhoPasta))) {
	    String itemCsv = br.readLine();
	    while (itemCsv != null) {
		String[] dados = itemCsv.split(",");
		String nome = dados[0];
		double preco = Double.parseDouble(dados[1]);
		int qtd = Integer.parseInt(dados[2]);
		list.add(new Produto1(nome, preco, qtd));
		itemCsv = br.readLine();
	    }

	    try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {

		for (Produto1 item : list) {
		    bw.write(item.getNome() + "," + String.format("%.2f", item.valorTotal()));
		    bw.newLine();
		}

		System.out.println(targetFileStr + " CREATED!");
	    } catch (IOException e) {
		System.out.println("Error writing file: " + e.getMessage());
	    }

	} catch (IOException e) {
	    System.out.println("Error reading file: " + e.getMessage());
	}
	scan.close();
    }

}
