package lista2;

import java.util.Scanner;

/*
 * Fa�a um programa em que permita a entrada de um n�mero qualquer 
 * e exiba se este n�mero � par ou �mpar. 
 * Se for par exiba tamb�m a raiz quadrada do mesmo; 
 * se for �mpar exiba o n�mero elevado ao quadrado.
 */


import java.util.Scanner;
public class lista3Tarefa4 {

	public static void main(String[] args) {
		double numero;
	
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		numero = ler.nextInt();
		
		if (numero < 0) {
			System.out.println("Infelizmente n�o consigo ler numeros negativos, apenas positivos!");	
			}
		
			else if (numero == 0){
					System.out.println("\nO numero: " + numero + ", � neutro.\nDigite um numero positivo impar ou par!!!");
					
			 }
		
			else if (numero % 2 ==0&& Math.sqrt(numero)){
				System.out.println("\nO numero: " + numero + ", � par!");
		
			} 
		
			 else if (numero % 2 ==1 &&  Math.pow(numero, 2) )
			 {
				System.out.println("\nO numero: " + numero + ", � �mpar!");
				
			}
			
			 System.out.println("\n\n\nFim do programa!");
	}

}
