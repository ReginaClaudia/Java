package PacoteAula2_4;

public class ClasseAula2_4 {

	public static void main(String[] args) {
		int nota = 20;
		char tipoAluno = 'B';
		double horasCursadas = 2.5;
		boolean aprovado = true;
		
		System.out.println("Nota:" + nota);
		System.out.println("Tipo de Aluno:" + tipoAluno);
		System.out.println("Horas Cursadas:" + horasCursadas);
		System.out.println("Aprovado:" + aprovado);
		//nesse caso o sinal de  + n�o est� somando,  est� concatenando, ligando
		
		nota = 30;
		tipoAluno = 'G';
		horasCursadas = 4.0;
		aprovado = false;
		
		System.out.println("Nota:" + nota);
		System.out.println("Tipo de Aluno:" + tipoAluno);
		System.out.println("Horas Cursadas:" + horasCursadas);
		System.out.println("Aprovado:" + aprovado);
					
	}

}
