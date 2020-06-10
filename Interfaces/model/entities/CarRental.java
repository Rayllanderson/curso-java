package model.entities;

import java.util.Date;

public class CarRental {
    
    private Date start;
    private Date finish;
    
    private Veiculo veiculo;
    private NotaFiscal nota;
    
    public CarRental() {
    }

    public CarRental(Date start, Date finish, Veiculo veiculo) {
	this.start = start;
	this.finish = finish;
	this.veiculo = veiculo;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getFinish() {
        return finish;
    }

    public void setFinish(Date finish) {
        this.finish = finish;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public NotaFiscal getNota() {
        return nota;
    }

    public void setNota(NotaFiscal nota) {
        this.nota = nota;
    }
    
    

}
