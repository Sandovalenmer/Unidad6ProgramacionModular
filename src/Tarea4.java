package src;

import java.util.*;

	public class Tarea4 {
		public static void main(String[] args){
			Tarea4 t = new Tarea4();

		}

		int[] elementos = new int[10];
		Scanner scanner = new Scanner(System.in);
		int n, mayor, residuo, i, operacion2, s;

		public Tarea4(){
			for (int i = 0 ; i<10 ; i++){
					numerosaleatorios(n);
			}

			for(int i = 0 ; i<10; i++){
            mostrarDato(i); 
       	 	}
        
        determMayor();
        
        System.out.println("El numero Mayor es: "+mayor+".");
        
        distanciaMayor();
			
		}

		public void numerosaleatorios(int numero){
			n = (int)(Math.random()*100); 
				System.out.println("Los numero aleatorios: "+n);
				if ( n > mayor){
				mayor = n;
				
				
				}


		}
		public void mostrarDato(int num){
        System.out.println("El indice es "+(num+1)+ " el valor es: "+ elementos[num]);
    	}    
    	public void distanciaMayor(){
    	int separacion;
    	for(int i=0;i<elementos.length;i++){
    		separacion=mayor-elementos[i];
    		System.out.println("La separacio de "+mayor+" con "+elementos[i]+" es: "+separacion);
    	}
   		 }
    
    	public void determMayor() {
    	    for(int i = 0 ; i<10; i++) {
            if (elementos[i] > mayor) {
                mayor = elementos[i];
            }
        }       
        for (int j = 0; j < 10; j++) {
        } 

    }
	}	