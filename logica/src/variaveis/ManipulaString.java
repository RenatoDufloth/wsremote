package variaveis;

public class ManipulaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String email = "xpTo@Itau-UniBanco.cOm.Br";
		
		System.out.println("Original: "+ email + 
				"\nMinusculo: " + email.toLowerCase() + 
				"\nMaiscula: " + email.toUpperCase() + 
				"\nQtde de Caracteres: " + email.length() + 
				"\nTem arroba?: "+ email.contains("@"));
        System.out.println("Posi��o do @: " + email.indexOf("@"));
        System.out.println("Do 2� at� 4�: " + email.substring(1,5));
        
       
        int metade_email = email.length() / 2;
        
        System.out.println("Primeira metade do email: " + email.substring(0,metade_email));
        
        System.out.println("usuario do email: " + email.substring(0,email.indexOf("@")));
        
        System.out.println("Servidor: " + email.substring(email.indexOf("@")+1,email.length()));
        
        System.out.println("Compara��o: " + email.equals("xpto@itau-unibanco.com.br"));
        
        System.out.println("Compara��o: " + email.equalsIgnoreCase("xpto@itau-unibanco.com.br"));
	}

}
