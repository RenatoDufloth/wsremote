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
		System.out.printf("%s seu imc é: %.2f", nome, imc);
		// no printf() usamos:
		// %s para string
		// %f para numeros reais
		// %d para numeros inteiros
		
		/*
		 * Idenficador (nome de classe / nome de variavel / nome do método)
		 * Regras:
		 * 1º) Não começarás com números. Exemplo errado: 1berto => h1berto
		 * 2º) Não utilizarás palavras reservadas de linguagem Exemplo: public, int, double, class...
		 * 3º) Nãp farás uso de caracteres especiais. Exemplo: @, !, , , . , %, ~...
		 * 
		 * 
		 * Padrões:
		 * 1º) Nomes significativos
		 * 2º) Utilizar o padrão CamelCase.
		 * Correto: dataDeNascimento Errado: datadenascimento
		 * 3º) Respeite as caixas e padrões dos recursos:
		 * Classe: Sempre começa com letra maiscula
		 * Variavel: sempres começa com minuscula (substantivo)
		 * Metodo: Sempre começa com minuscula e é seguido de parenteses (verbo)
		 */
		
	
		
		
		
		
	}

}
