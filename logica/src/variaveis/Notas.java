package variaveis;

import javax.swing.JOptionPane;

public class Notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String aluno = JOptionPane.showInputDialog("Digite nome do Aluno");
		double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota"));
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota"));
	    double media = (nota1  + nota2) / 2 ;
	    double faltante = 10 - media;		
		
	    System.out.printf("Aluno %s, sua média obtida foi: %.2f para 10 faltaram: %.2f", aluno, media, faltante);

	    /*Tipos primitivos:
	     * boolean => Boolean => true ou false
	     * char => Character => 1 charecter ('w')
	     
	     * São os inteiros
	     * byte => byte (-127/+128)
	     * short => Short (-32.../ +32....)
	     * int => Integer (-2bi/+2bi)
	     * long => Long (número cientifico)
	      
	     
	     * float => usar até 5 casas decimais
	     * double => usar com >5 casas decimais 
	     */
	    
	    
	    
	    
	    
	}

}
