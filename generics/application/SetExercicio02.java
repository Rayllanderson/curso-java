package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class User{
    
    private int id;
    
    public User(int id) {
	this.id = id;
    }

    public int getId() {
        return id;
    }
    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + id;
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
	User other = (User) obj;
	if (id != other.id)
	    return false;
	return true;
    }
}

public class SetExercicio02 {

    private static Scanner scan = new Scanner (System.in);
    
    public static void main(String[] args) {
	
	Set <User> set = new HashSet<>();
	
	System.out.print("Quantos alunos para o curso de java? ");
	int n = scan.nextInt();
	setUser(n, set);
	System.out.print("Quantos alunos para o curso de Python? ");
	n = scan.nextInt();
	setUser(n, set);
	System.out.print("Quantos alunos para o curso de Javascript? ");
	n = scan.nextInt();
	setUser(n, set);
	
	System.out.println();
	
	System.out.println("Total de estudantes cadastrados: " + set.size());
    }
    
    public static void setUser(int n, Set <User> set) {
	for (int i = 0; i < n; i++) {
	    System.out.print("ID #" + (i+1) + ": ");
	    int id = scan.nextInt();
	    set.add(new User (id));
	}
    }
}
