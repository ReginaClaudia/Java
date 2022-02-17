package PacoteAula2_11;
public class ClasseAula2_11 {
	public static void main(String[] args) {
		boolean ult3EmpretQuitadosPrazos, posuiRendaComprovada,clienteDezEstrelas, restricaoCredito;
		
		 ult3EmpretQuitadosPrazos = true;
		 posuiRendaComprovada = false;
		 clienteDezEstrelas = false;
		 restricaoCredito = false;
		 
		 boolean concederEmprestimo = (ult3EmpretQuitadosPrazos && posuiRendaComprovada || clienteDezEstrelas) && !restricaoCredito;
		 System.out.printf("Emprestimo concedido? \n%b", concederEmprestimo);
	}

}
 