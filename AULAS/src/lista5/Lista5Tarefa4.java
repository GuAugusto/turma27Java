package lista5;
/*
 * Crie uma classe funcion�rio e apresente os atributos e m�todos referentes esta classe, 
 * em seguida crie um objeto funcion�rio, defina as instancias deste objeto e apresente as informa��es deste objeto no console.
 */
import objetos.Funcionario;

public class Lista5Tarefa4 {

	public static void main(String[] args) {


		Funcionario funcionario1 = new Funcionario ();
		
		funcionario1.idade = 20;
		funcionario1.Cargo = "DevJr";
		funcionario1.nome = "Gustavo Augusto";
		funcionario1.Ativo = true;
		funcionario1.TempoDeEmpresa = 1.02;
		funcionario1.Ferias = true;
		
		System.out.println("Funcionario: "+funcionario1.nome);
		System.out.println("Parab�ns voc� completou: "+funcionario1.TempoDeEmpresa+ " anos aqui na empresa");
		System.out.println("� por isso que voc� esta recebendo as suas ferias, diverta-se!");
		System.out.println("Voc� � o nosso melhor "+funcionario1.Cargo+ ", mesmo com apenas "+funcionario1.idade+" de idade. Voc� � muito bom no que faz!!!");
		
		
		

	}

}
