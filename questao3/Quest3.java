package questao3;

import java.util.Arrays;
import java.util.Scanner;

public class Quest3 {

	public static void main(String[] args) 
	{
		String palavra = "ifailuhkqq";
		String palavra2 = "ovo";
		
		System.out.print("Palavra: " + palavra);
		System.out.println("\n"+anagrama(palavra));
		System.out.print("Palavra: " + palavra2);
		System.out.println("\n"+anagrama(palavra2));
		

	}
	
	 public static int anagrama(String palavra) 
	 {
		int cont = 0;
		char[] str = palavra.toCharArray();
		
			for(int i=0; i<palavra.length(); i++) 
			{
				char c = str[i];
				
					for(int j=i+1; j<palavra.length(); j++) 
					{
						char cc = str[j];
						if(c == cc)
						{
							cont++;	
							int o = 0, p = 0;

							char[] strinv = new char[palavra.length()];
							char[] copia = new char[palavra.length()];
							String extra;
							String extra2;//copia invertida
							
							for(int un = j; un>=i; un--, o++)
							{
								strinv[o] += str[un];
							}
							for(int un = i; un<=j;un++,p++)
							{
								copia[p] += str[un];
							}

										if(j-i>1) 
											{
											extra = String.valueOf(strinv);
											extra2 = String.valueOf(copia);
											cont+=1;
											}
										else if((j-1)==1){
											extra = String.valueOf(strinv);
											extra2 = String.valueOf(copia);
										}

										if(j-i>1) 
										{
										if(Arrays.equals(copia, strinv)) 
											{
											cont+=1;
											}
										
										}
								
								
								
								
						}
					}	
					
			}
			return cont;
	}
}