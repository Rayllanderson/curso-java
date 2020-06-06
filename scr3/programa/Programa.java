package programa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Departament1;
import entities.HorasContratadas;
import entities.Level;
import entities.Trabalhador;

public class Programa {

    public static void main(String[] args) throws ParseException {
	Locale.setDefault(Locale.US);
	Scanner scan = new Scanner(System.in);
	SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
	
	System.out.print("Qual o nome do departamento: ");
	String nomeDepartamento = scan.nextLine();
	System.out.println("Entrando com os dados do trabalhador(a)...");
	System.out.print("Nome: ");
	String nomeWorker = scan.nextLine();
	System.out.print("Qual nível do trabalhador(a)? ");
	String nivel = scan.nextLine();
	System.out.print("Salario base: R$");
	double salarioBase = scan.nextDouble();
	Trabalhador worker = new Trabalhador(nomeWorker, Level.valueOf(nivel), salarioBase, new Departament1(nomeDepartamento));
	System.out.println("Trabalhador cadastrado com sucesso!");
	System.out.println();
	
	System.out.println("Cadastrando contratos...");
	System.out.print("Quantos contratos quer cadastrar? ");
	int n = scan.nextInt();
	for(int i = 0; i<n; i++) {
	    System.out.println("Contrato #" + (i+1));
	    System.out.print("Entre com a data do trabalho (DD/MM/YYYY): ");
	    Date dataTrabalho = formatoData.parse(scan.next());
	    System.out.print("Ganho por hora: R$");
	    double ganhoPerHour = scan.nextDouble();
	    System.out.print("Trabalhou por quantas horas? ");
	    int horasTrabalhadas = scan.nextInt();
	    HorasContratadas contrato = new HorasContratadas(dataTrabalho, ganhoPerHour, horasTrabalhadas);
	    worker.addContrato(contrato);
	}
	System.out.println();
	
	System.out.println("Conferindo ganho por mes...");
	System.out.print("Entre com o mês e o ano você trabalhou (MM/YYYY): ");
	String diaMes = scan.next();
	int mes = Integer.parseInt(diaMes.substring(0, 2));
	int ano = Integer.parseInt(diaMes.substring(3));
	
	System.out.println();
	System.out.println("Nome: " + worker.getNome());
	System.out.println("Departamento: " + worker.getDepartamento().getNome());
	System.out.println("Ganho em " + mes + "/" + ano + ": " + String.format("%.2f", worker.ganhoTotalMes(mes, ano)));
	
	
	scan.close();

    }

}
