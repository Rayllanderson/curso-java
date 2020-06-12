package application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

class Usuarios {
    private String nome;
    private Date dataAcesso;

    public Usuarios(String nome, Date dataAcesso) {
	this.nome = nome;
	this.dataAcesso = dataAcesso;
    }

    public String getNome() {
	return nome;
    }

    public void setNome(String nome) {
	this.nome = nome;
    }

    public Date getDataAcesso() {
	return dataAcesso;
    }

    public void setDataAcesso(Date dataAcesso) {
	this.dataAcesso = dataAcesso;
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((nome == null) ? 0 : nome.hashCode());
	return result;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	Usuarios other = (Usuarios) obj;
	if (nome == null) {
	    if (other.nome != null)
		return false;
	} else if (!nome.equals(other.nome))
	    return false;
	return true;
    }
}

public class SetExercicio {

    public static void main(String[] args) {

	String path = "C:\\Users\\Anna Lucia\\eclipse-workspace\\Arquivos-Java\\input.txt";

	Set<Usuarios> set = new HashSet<>();

	try (BufferedReader br = new BufferedReader(new FileReader(path))) {

	    String itens = br.readLine();
	    while (itens != null) {
		String[] dados = itens.split(",");
		Date dateAcess = Date.from(Instant.parse(dados[1]));
		set.add(new Usuarios(dados[0], dateAcess));
		itens = br.readLine();
	    }
	    System.out.println(set.size() + " usuários cadastrados");

	} catch (FileNotFoundException e) {
	    e.printStackTrace();
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }
}
