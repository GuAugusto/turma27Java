package lista1;

import java.util.Scanner;
public class lista1Tarefa1 {

	public static void main(String[] args) {
		int ano;
		int mes;
		int dia;
		int diasDeVida;
		Scanner ler = new Scanner(System.in);
		System.out.println("\nOl�, tudo bem?\nPor favor, Informe o dia do seu nascimento: ");
		dia = ler.nextInt();
		System.out.println("\nPor favor, Informe o mes de seu nascimento: ");
		mes= ler.nextInt();
		System.out.println("\nE Por fim, Informe quantos anos voc� tem: ");
		ano = ler.nextInt();
		
		diasDeVida = ((ano * 365) + mes * 30) + dia;

		System.out.println("\nParab�ns, voce j� viveu: " +diasDeVida+" Dias. Continue se cuidando e sempre use mascara #forabolsonaro! ");
		

	}

}
