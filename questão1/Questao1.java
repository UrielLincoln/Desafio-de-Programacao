package questão1;

import java.util.Scanner;

public class Questao1 
{

	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		System.out.print("Digite o valor de n: ");
		int n = tec.nextInt();
		//int n = 6;
		
		for(int i = 1; i <=n; i++) 
		{
			System.out.println("");
			for(int j = n - i; j > 0; j--) 
				{
					System.out.print(" ");
				}
			
			for(int k = 1; k<=i; k++) 
				{	
					System.out.print("*");
				}	
		}	
	}
	
	
	
	
	
	
	
	

}
