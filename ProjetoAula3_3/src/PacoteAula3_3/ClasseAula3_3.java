package PacoteAula3_3;

import java.math.*;
import java.util.*;

public class ClasseAula3_3 {

	public static void main(String[] args) {
	
		double n1, n2, n3, total, mediaAvaliacoes, frequencia;
		Scanner entrada = new Scanner (System.in);
		String situacao;
		
		System.out.println ("Digite a primeira nota" );
		n1 = entrada.nextDouble();
		
		System.out.println ("Digite a segunda nota" );
		n2 = entrada.nextDouble();
		
		System.out.println ("Digite a terceira nota" );
		n3 = entrada.nextDouble();
		
		total = n1 + n2 + n3;
		mediaAvaliacoes = total / 3;
		
		System.out.println ("Digite a frequencia do aluno" );
		frequencia = entrada.nextDouble();
		
		if (total >= 70 && frequencia >= 0.75);
			situacao = "Aprovado";
	
			
			
		
		System.out.printf("O aluno obteve nota total %.2f e m�dia por avalia��o %.2f. "
				+ "A frequencia foi %.2f. Com isso o aluno est� %s.", total, mediaAvaliacoes, 
				frequencia *100, situacao);
		
		
		
				
		
	}
}
