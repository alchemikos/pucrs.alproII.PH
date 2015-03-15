package pucrs.somadorapp2;

public class Somador {
	private int a;
	private int b;
	
	
	
	public Somador() {
		super();
		a = 0;
		b = 0;
		
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



	public int getSoma(){
		int soma;
		soma = a + b;
		return soma;
	}

}
