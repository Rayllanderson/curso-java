package entities;

import java.util.Date;

public class HorasContratadas {
    private Date data;
    private Double valorPorHora;
    private Integer horas;
    
    public HorasContratadas(Date data, Double valorPorHora, Integer horas) {
	this.data = data;
	this.valorPorHora = valorPorHora;
	this.horas = horas;
    }
    

    public Date getData() {
        return data;
    }

    public Double getValorPorHora() {
        return valorPorHora;
    }


    public Integer getHoras() {
        return horas;
    }

    public double ganhoTotal() {
	return this.valorPorHora * this.horas;
    }

    
    
    

}
