package classeProjetoAula2_6;

public class Aula2_6 {

	public static void main(String[] args) {
		
		String nome, nome2;
		nome  = "José da Silva Costa";
		nome2 = "Maria Clara da Silva Almeida";
		
		System.out.println(nome);
		System.out.println(nome2);
		
		int tamanhoDoNome = nome.length(),tamanhoDoNome2 = nome2.length();
		//metodo length()conta a quantidade de caracteres
		
		System.out.println("A variável nome tem" + tamanhoDoNome + "caracteres");
		System.out.println("A variável nome2 tem" + tamanhoDoNome2 + "caracteres");
		int totalCaracteres = tamanhoDoNome + tamanhoDoNome2;
		System.out.println("O total de caracteres das duas variáveis é: " + totalCaracteres);
		
		String nomesConcatenados = nome.concat(nome2);
		System.out.println(nomesConcatenados);
		
		String NomeSemA = nome.replace('a', '9');
		System.out.println(NomeSemA);
		//método replace substitui caractere char usa-se aspas simples ' 
		
		String somenteNome = nome2.substring(6, 11);
		System.out.println(somenteNome);
		
		String nome2TudoMaiusculo = nome2.toUpperCase();
		System.out.println(nome2TudoMaiusculo);
		
		String nomeTudoMinusculo = nome.toLowerCase();
		System.out.println(nomeTudoMinusculo);	
		
		
	}

}
