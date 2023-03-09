package controller;

public class ThreadVetor extends Thread{
	private int valor;
	private int vetor[];
	
	public ThreadVetor(int valor1, int vetor1[]){
		// TODO Auto-generated constructor stub
		valor=valor1;
		vetor=vetor1;
	}
	
	public void run(){
		CalculaTempo();
	}
	
	// Comparar tempos de percorrer vetor com lenght e for each;
	private void CalculaTempo() {
		if(valor%2==0) {
			double TempoInicial=System.nanoTime();
			for (int i = 0 ; i < vetor.length; i++) {
				
			}
			double TempoFinal=System.nanoTime();
			double Resultado = TempoFinal - TempoInicial;
			Resultado = Resultado/Math.pow(10,9);
			System.out.println("Vetor com Lenght:" +Resultado + " s.");
		}
		else {
			double TempoInicial=System.nanoTime();
			for(int vetor2:vetor) {
				
			}
			double TempoFinal=System.nanoTime();
			double Resultado = TempoFinal - TempoInicial;
			Resultado = Resultado/Math.pow(10,9);
			System.out.println("Vetor com for each:" +Resultado + " s.");
		}
	}
}
