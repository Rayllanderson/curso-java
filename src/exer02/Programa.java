package exer02;

public class Programa {

    public static void main(String[] args) {
	Aluno a1 = new Aluno("João");
	a1.lerTresNotas();
	a1.verificarAprovado();
	Aluno a2 = new Aluno("Pedro jose");
	a2.lerTresNotas();
	a2.verificarAprovado();
	
	System.out.println();
	System.out.println(a1.toString() + "\n" + a2);
	

    }

}
