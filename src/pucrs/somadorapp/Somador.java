package pucrs.somadorapp;

public class Somador {
	
	//Criar dois atributos 
	private int a; 
	private int b;
	
	//Construtor
	public Somador() {
		super();
	}	
	
	//Criar o metodo Publico para somar não precisa de parametros
	//pois os dois numeros ja estão armazenados dentro do somador
	
	public int getSoma(){
		int soma;
		soma  = a + b ;
		return soma;
	}


	public int getA() {
		return a;
	}


	public void setA(int a) {
		this.a = a;
	}


	public int getB() {
		return b;
	}


	public void setB(int b) {
		this.b = b;
	}

	

}
