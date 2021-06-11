package src;

import java.util.*;

	public class Tarea3 {
		public static void main(String[] args){
			Tarea3 t = new Tarea3();
		}

		int[] elementos = new int[8];
		Scanner scanner = new Scanner(System.in);
		int n, s;

		public Tarea3(){
			
			System.out.println("Ingrese el número a buscar: ");
			s = scanner.nextInt();

			for (int i=0 ; i<8; i++){
				numeroaleatorio(n);

			if (s == n){
				System.out.println("True");
			}

			else {
				System.out.println("False");
			}

			}





		}

		public void numeroaleatorio(int numero){
				n = (int)(Math.random()*8); 
				System.out.println("Número aleatorio es: "+n);
				}


	}