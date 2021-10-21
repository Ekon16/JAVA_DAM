package Adivina;

import java.util.Scanner;

public class Adivinador2 {
	public static void main(String[] args) 
	{

		Scanner teclado = new Scanner(System.in);

		
		// Variables 
		int min = 0;
		int max = 100;
		int num1;
		char rep = 'y';

		System.out.println("Piensa un puto numero del " + min + " al " + max);
		
		while(rep =='Y' || rep == 'y')
		{
				
			if (min == max)
			{
				num1 = min;
			}
			else 
			{
				// Empieza a pensar
				num1 = (max+min)/2;
			}
			
			if (num1 <= min || num1 >= max) {
				System.out.println("La chupas por tramposo");
				break;
			}
			System.out.println("Que te parece el " + num1 + " (<,=,>)? " );
			
			// -------------------------
		
			String input = teclado.nextLine();
			
			// ------------------------------
			if(input.equals(">"))
			{
				// si es mayor se cambia el minimo
				min = num1;
			}
			else if (input.equals("<"))
			{
				// Si es menor
				max = num1;
			}
			else if (input.equals("="))
			{
				System.out.println("tu numero es " + num1);
				System.out.println("Buena partida GG :v");
				System.out.println("Echamos otra partida (y,n)?");		
			}
			String second = teclado.nextLine();
			
			if (second.equals('y'))
				{
					rep = input.charAt(0);
					
					rep = 'y';		
						
				} 
			}
		}
	}
//--------------JOSE IGNACIO GODINO---------------------
