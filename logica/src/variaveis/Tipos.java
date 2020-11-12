package variaveis;

public class Tipos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nome = "Renato Dufloth";	
		
		int idade = 29;
		
		double altura = 1.75;
		
		double peso = 76;
		
		double imc = peso / (altura * altura);
		
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade + " Anos");
		System.out.println("Altura: " + altura + " Metros");
		System.out.println("Peso: " + peso + " Kilos");
		System.out.println("IMC: " + imc );
		
		System.out.printf("imc: %.2f\n", imc);
		System.out.printf("%s seu imc �: %.2f", nome, imc);
		// no printf() usamos:
		// %s para string
		// %f para numeros reais
		// %d para numeros inteiros
		
		/*
		 * Idenficador (nome de classe / nome de variavel / nome do m�todo)
		 * Regras:
		 * 1�) N�o come�ar�s com n�meros. Exemplo errado: 1berto => h1berto
		 * 2�) N�o utilizar�s palavras reservadas de linguagem Exemplo: public, int, double, class...
		 * 3�) N�p far�s uso de caracteres especiais. Exemplo: @, !, , , . , %, ~...
		 * 
		 * 
		 * Padr�es:
		 * 1�) Nomes significativos
		 * 2�) Utilizar o padr�o CamelCase.
		 * Correto: dataDeNascimento Errado: datadenascimento
		 * 3�) Respeite as caixas e padr�es dos recursos:
		 * Classe: Sempre come�a com letra maiscula
		 * Variavel: sempres come�a com minuscula (substantivo)
		 * Metodo: Sempre come�a com minuscula e � seguido de parenteses (verbo)
		 */
		
	
		
		
		
		
	}

}
