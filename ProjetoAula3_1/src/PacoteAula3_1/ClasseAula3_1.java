package PacoteAula3_1;

import java.math.*;
import java.util.*;

public class ClasseAula3_1 {

	public static void main(String[] args) {
		
		double nota1, nota2, nota3, nota4, frequencia, totalNotas;
		char statusAluno;
		boolean aprovado;
		
		Scanner entradaNotas = new Scanner(System.in);
		Scanner entradaCaractere = new Scanner(System.in);
		
		System.out.print ("Digite o nome do aluno");
		String nomeAluno = entradaCaractere.nextLine();
		
		System.out.print ("Digite um caractere para a situacao do aluno (O -->Ok, P -->Pendencia):");
		statusAluno = entradaCaractere.nextLine().charAt(0);
		
		System.out.print ("Digite a primeira nota" );
		nota1 = entradaNotas.nextDouble();
		
		System.out.print ("Digite a segunda nota" );
		nota2 = entradaNotas.nextDouble();
		
		System.out.print ("Digite a terceira nota" );
		nota3 = entradaNotas.nextDouble();
		
		System.out.print ("Digite a quarta nota" );
		nota4 = entradaNotas.nextDouble();
		
		System.out.print ("Digite a frequencia do aluno" );
		frequencia = entradaNotas.nextDouble();
		
		totalNotas = nota1 + nota2 + nota3 + nota4;
	    aprovado = totalNotas >=70 && frequencia >=0.75;
		
		System.out.printf("O(a) aluno(a) %s obteve nota final %.2f e frequencia %.2f%%. A situa��o do(a) aluno(a) � %c. \n"
				+ "Aluno(a) aprovado(a)? %b.", nomeAluno, totalNotas, frequencia * 100, statusAluno, aprovado);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
