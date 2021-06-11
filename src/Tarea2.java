package src;

import java.util.*;

	public class Tarea2 {
		public static void main(String[] args) {
			Tarea2 t = new Tarea2();
		}
		int[] elementos = new int[10];
		Scanner scanner = new Scanner(System.in);
		int n, comp, mayor;

		public Tarea2(){
			for (int i=0 ; i<10; i++){
				numeroaleatorio(n);
			}

			System.out.println("El número mayor es: "+mayor);
						
			
		}
			public void numeroaleatorio(int numero){
				n = (int)(Math.random()*99); 
				System.out.println("Los numero aleatorios: "+n);

				if ( n > mayor){
				mayor = n;
				
				}
			}
		
	}