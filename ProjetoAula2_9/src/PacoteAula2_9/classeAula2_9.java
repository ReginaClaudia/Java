package PacoteAula2_9;

import java.math.*;

public class classeAula2_9 {

	public static void main(String[] args) {
		//x^2 + 12x - 13 = 0
	   //2x^2 - 16x - 18 = 0
		
		double a, b, c;
		a = 1;
		b = 12;
		c = -13;
		
		double delta = 0;
				
		delta = (b * b) - (4 * a * c);
		System.out.printf("O valor do delta � : %.0f\n", delta);
		
		double x_linha = 0;
		x_linha = (-b + Math.sqrt(delta)) / (2 * a);
		System.out.printf("O valor do x' �: %.0f\n", x_linha);
		
		double x_duasLinhas = 0;
		x_duasLinhas = (-b - Math.sqrt(delta)) / (2 * a);
		System.out.printf("O valor do x'' �: %.0f", x_duasLinhas);
		
		//para fazer com a segunda equa��o � s� substituir os valores a, b, c da equa��o 1 
		//pelos valores da equa��o 2, que s�o, a=2, b=-16 e c--18
		
		

	}

}
