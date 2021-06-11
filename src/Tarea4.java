package src;

import java.util.*;

	public class Tarea4 {
		public static void main(String[] args){
			Tarea4 t = new Tarea4();

		}

		int[] elementos = new int[10];
		Scanner scanner = new Scanner(System.in);
		int n, mayor, residuo, operacion, operacion2, s;

		public Tarea4(){
			for (int i = 0 ; i<10 ; i++){
					numerosaleatorios(n);
			}
			

			

		}

		public void numerosaleatorios(int numero){
			n = (int)(Math.random()*100); 
				System.out.println("Los numero aleatorios: "+n);
				if ( n > mayor){
				mayor = n;
				mayor = s
				residuo = s - n;
				System.out.println("La diferencia del número mayor a "+n+"  es: "+residuo);

				}

								
		}


	}