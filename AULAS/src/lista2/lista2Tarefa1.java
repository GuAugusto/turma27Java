package lista2;
/*
 * Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
 */
	


import java.util.*;
public class lista2Tarefa1 {
public static void main(String[] args) {
		
		int n1;
		int n2;
		int n3;
		int maiorNumero;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Entre com o valor de N1: ");
		n1 = ler.nextInt();
		
		System.out.println("Entre com o valor de N2: ");
		n2 = ler.nextInt();
		
		System.out.println("Entre com o valor de N3: ");
		n3 = ler.nextInt();
		
		if (n1>n2 && n1>n3) {
			System.out.printf("O MAIOR NUMERO �: %d", n1);
		} else if (n2>n3 && n2>n1) {
			System.out.printf("O MAIOR NUMERO �: %d", n2);
		}
		else {
			System.out.printf("O MAIOR NUMERO �: %d", n3);
		}
	
		
		
		
	}

}
