package questao2;

import java.util.Scanner;

public class Questao2 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		//System.out.print("Digite a senha: ");
		//String senha = scan.next();
		String senha = "QWERTY*Uo9";
		System.out.println(minCh(senha));
	

	}
	
	
	static int minCh(String senha) //minimo de caracteres
	{
		int num = 0;
			if(senha.length()<6) 
			{
				num = 6 - senha.length();
				return num;
			}
			
			else {
				
				num+= verDig(senha) + verUp(senha) + verLow(senha) + verSpc(senha);
				
				return num;
			}

	}
	
	
	public static int verDig(String senha) //Verifica se há digitos
	{
			for (int i = 0; i<senha.length(); i++) 
			{
			   char c = senha.charAt(i);
			   if(Character.isDigit(c))
			   		return 0;   
			}
		return 1;
	}
	
	public static int verUp(String senha) { //verifica se há caracteres maiusculos
			for (int i = 0; i<senha.length(); i++) 
			{
			   char c = senha.charAt(i);
			   if(Character.isUpperCase(c))
			   {
			   	   return 0;
			   }
			}
		return 1;
	}
	
	public static int verLow(String senha) { //verifica se há caracteres minusculos
			int num = 0;
		for (int i = 0; i<senha.length(); i++) 
			{
			   char c = senha.charAt(i);
			   if(Character.isLowerCase(c)){
				   num = 0;
			   		return num;   }
			}
		num = 1;
		return num;
	}
	
	public static int verSpc(String senha) {
		String especiais = "!@#$%^&*()-+";
		int num = 0;
			for (int i = 0; i<senha.length(); i++) //Verificação de requisitos
			{
			   char c = senha.charAt(i);
			   for(int j=0;j<especiais.length();j++)
			   {
				   char dig = especiais.charAt(j);
				   if(c == dig) 
				   {
					   num = 0;
					   return num;
				   }
			   } 
			}
			num = 1;
		return num;	
	}
	
}
