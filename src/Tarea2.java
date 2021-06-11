package src;

import java.util.*;

	public class Tarea2 {
		public static void main(String[] args) {
			Tarea2 t = new Tarea2();
		}
		int[] elementos = new int[10];
		Scanner scanner = new Scanner(System.in);
		int n; 

		public Tarea2(){
			for (int i=0 ; i<10; i++){
				numeroaleatorio(n);
			}

			
		}

			public void numeroaleatorio(int numero){
				n = (int)(Math.random()*99); 
				System.out.println("Los numero aleatorios: "+n);
			}
		
			public void comapracion(){
			
			}
	}