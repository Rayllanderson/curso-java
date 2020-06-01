package exer02;


import java.util.Scanner;

public class Aluno {
    private String nome;
    private double [] notas;
    private double maiorNota;
    private Scanner scan = new Scanner (System.in);
    public Aluno() {}

    
    public Aluno(String nome) {
	this.nome = nome;
	this.notas = new double [3];
	this.maiorNota = 0;
    }

    public void lerTresNotas() {
	for(int i = 0; i<this.notas.length; i++) {
	    System.out.print("Digite a nota " + (i+1) + ": ");
	    notas[i] = scan.nextDouble();
	}
	
	this.maiorNota();
    }

    private double somarNotas() {
	double soma = 0;
	for (int i = 0; i < notas.length; i++) {
	    soma += notas[i];
	}
	return soma;
    }
    
    public void verificarAprovado() {
	double notaFinal = somarNotas();
	System.out.println("Nota final " + notaFinal);
	if (notaFinal > 60) {
	    System.out.println(notaFinal);
	    System.out.println("PASS");
	}else {
	    System.out.println("FAILED");
	    System.out.println("MISSING " + (60 - notaFinal) + " POINTS");
	}
    }
    
    private void maiorNota() {
	for (int i = 0; i < notas.length; i++) {
	    if (notas[i] > this.maiorNota) {
		maiorNota = notas[i];
	    }
	}
    }


    @Override
    public String toString() {
	return  nome + "\n" + notas[0] + "\n" + notas[1] + "\n" + notas[2] + "\n";
    }
    
    
    
}
