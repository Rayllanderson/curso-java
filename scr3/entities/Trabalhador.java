package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Trabalhador {
    private String nome;
    private Level level;
    private double salarioBase;
    private Departament1 departamento;
    
    List <HorasContratadas> contrato = new ArrayList <>();
    
    public Trabalhador(String nome, Level level, double salarioBase, Departament1 departamento) {
	this.nome = nome;
	this.level = level;
	this.salarioBase = salarioBase;
	this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public Level getLevel() {
        return level;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public Departament1 getDepartamento() {
        return departamento;
    }

    public List<HorasContratadas> getContrato() {
        return contrato;
    }
    
    
    public void addContrato(HorasContratadas contrato) {
	this.contrato.add(contrato);
    }
    public void removeContrato (HorasContratadas contrato) {
	this.contrato.remove(contrato);
    }
    
    public double ganhoTotalMes (int mes, int ano) {
	double soma = this.salarioBase;
	Calendar cal = Calendar.getInstance();
	for (HorasContratadas c : this.contrato ) {
	    cal.setTime(c.getData());
	    int contratoMes = 1 + cal.get(Calendar.MONTH);
	    int contratoAno = cal.get(Calendar.YEAR);
	    if (contratoMes == mes && contratoAno == ano) {
		soma += c.ganhoTotal();
	    }
	}
	
	return soma;
    }
    
    
    
    

}
