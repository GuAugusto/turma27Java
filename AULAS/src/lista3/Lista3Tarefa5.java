package lista3;
import java.util.*;
/*
 * Crie um programa que leia um n�mero do teclado 
 * at� que encontre um n�mero igual a zero. 
 * No final, mostre a soma dos n�meros digitados.(DO...WHILE)
 */
public class Lista3Tarefa5 {

	public static void main(String[] args) {
		int numero=0;
		int soma=0;
		
		Scanner leia = new Scanner (System.in);
		
		
		do {
		System.out.println("Digite um numero: ");
		
		numero = leia.nextInt();
		soma +=numero;
		
		}while(numero !=0);
		System.out.printf("Soma =%d", soma);
			

	}

}
