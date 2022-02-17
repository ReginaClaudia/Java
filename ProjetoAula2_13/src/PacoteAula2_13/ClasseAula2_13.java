package PacoteAula2_13;

import java.math.*;

public class ClasseAula2_13 {
	
	public static void main(String[] args) {
		
		double nota1, nota2, nota3, nota4, frequencia, totalNotas;
		char statusAluno;
		boolean aprovado;
		String nomeAluno;
		
		nomeAluno = "Ana Paula da Silva Couto" ;
		statusAluno = 'M';
		
		nota1 = 20;
		nota2 = 20;
		nota3 = 10;		
		nota4 = 25;
		
		frequencia = 0.8;
		
		totalNotas = nota1 + nota2 + nota3 + nota4;
		
		aprovado = totalNotas >= 70 && frequencia >= 0.75;
		
		System.out.printf("O(a) aluno(a) %s obtrve nota final %.2f  e frequencia %.2f%%.\n A situação do(a) aluno(a) é %c. \n, "
				+ "Aluno aprovado? %b ", nomeAluno, totalNotas, frequencia*100, statusAluno, aprovado);
		
	
		
		
		
		
			

	}

}
