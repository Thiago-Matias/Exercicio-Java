package biblioteca;

public class BibliotecaApp {
	
	public static void main(String[] args) {
		
		Emprestimo exemplo = new Emprestimo("Thiago",19,500.00,20.0,5);
				
		
		exemplo.imprimir();
		
		System.out.println(exemplo.calcularEmprestimo());
		
		

	}
	
	
}
