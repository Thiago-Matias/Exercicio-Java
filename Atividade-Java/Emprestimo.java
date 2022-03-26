package biblioteca;

public class Emprestimo {
	 	public String nomeUsuario;
	    public int idade;
	    public double valorImprestimo;
	    public double percentualJurosMes;
	    public int mesesParaPagar;

	    public Emprestimo(){

	    }
	    
	    public Emprestimo(String nome, int idade, double valorEmprestimo, double percentual, int mes) {
	    	this.nomeUsuario = nome;
	    	this.idade = idade;
	    	this.valorImprestimo = valorEmprestimo;
	    	this.percentualJurosMes = percentual;
	    	this.mesesParaPagar = mes;
	    }

	    public void imprimir(){
	        String aux = "";
	        aux = "Nome: " + nomeUsuario + " \r" +
	        	 "Idade: " + idade + " \r" +
	        	 "Valor Emprestimo: "+ valorImprestimo + " \r" + 
	        	 "Percentual Jutos Mês: "+ percentualJurosMes + " \r" + 
	        	 "Meses Para Pagar: " + mesesParaPagar;
	        System.out.println(aux);
	    }
	    
	    public double calcularEmprestimo() {
	    	
	    	if(this.idade >= 18 && this.idade < 23) {
	    		
	    		return this.valorImprestimo += (this.valorImprestimo/this.mesesParaPagar)* this.percentualJurosMes;
	    		
	    	}else if (this.idade > 23 && this.idade <= 33) {
	    		
	    		return (this.valorImprestimo*10);
	    		
	    	}else {
	    		
	    		return 0;
	    	}
	    }

		

}
