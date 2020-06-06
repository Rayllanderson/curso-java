package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Departament;
import entities.HourContract;
import entities.Woker;
import entities.enums.WorkerLevel;

public class Program {

    public static void main(String[] args) throws ParseException {
	Locale.setDefault(Locale.US);
	Scanner scan = new Scanner(System.in);
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	System.out.print("Entre com o nome do departamento: ");
	String departamentName = scan.nextLine();
	System.out.println("** Dados do Trabalhador **");
	System.out.print("Nome: ");
	String workerName = scan.nextLine();
	System.out.print("Nível: ");
	String workerLevel = scan.nextLine();
	System.out.print("Base Salary: ");
	double baseSalary = scan.nextDouble();

	Woker worker = new Woker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary,
		new Departament(departamentName));

	System.out.println("Quantos contratos esse trabalhador vai ter? ");
	int n = scan.nextInt();

	for (int i = 1; i <= n; i++) {
	    System.out.println("Entre com o contrato #"+ i + ":");
	    System.out.print("Date (DD/MM/YYY): ");
	    Date contractDate = sdf.parse(scan.next());
	    System.out.print("Valor por hora: ");
	    double valuePerHour = scan.nextDouble();
	    System.out.print("Duração (em horas): ");
	    int hours = scan.nextInt();
	    HourContract contract = new HourContract(contractDate, valuePerHour, hours);
	    worker.addContract(contract);
	}
	System.out.println();
	
	System.out.print("Entre com o mês e ano pra calcular o salário (MM/YYYY): ");
	String monthAndYear = scan.next();
	int month = Integer.parseInt(monthAndYear.substring(0, 2));
	int year = Integer.parseInt(monthAndYear.substring(3));
	System.out.println("Nome: " + worker.getName());
	System.out.println("Departamento: " + worker.getDepartament().getName());
	System.out.println("Ganho em " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));

	scan.close();

    }

}
