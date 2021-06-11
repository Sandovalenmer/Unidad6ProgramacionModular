package src;

import java.util.*;

	public class Tarea1{
		public static void main(String[] args){
		Tarea1 t = new Tarea1();
	}

		int[] elementos = new int[5];
			Scanner scanner = new Scanner(System.in);
			public Tarea1(){
				for(int i = 0 ; i<5; i++){
			pedirValor(i);
		}
			for(int i = 0 ; i<5; i++){
			mostrarDato(i);
			}
			
			public void mostrarDato(int numero){
			System.out.println("El indice es "+numero+ " el valor es: "+ elementos[numero]);
		}
			public void pedirValor(int numero){
			System.out.print("\nIngres el valor No. "+numero+": ");
			elementos[numero] = scanner.nextInt();
	}
}