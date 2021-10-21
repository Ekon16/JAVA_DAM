package Adivina;

import java.util.Scanner;

public class Adivina {
	
public static void main(String[]args) {
	 Scanner sc = new Scanner(System.in);
	 
	 
	 int numusu; // Número introducido por el usuario.
	 int numfor; // Intentos.
	 
	 
	 byte opcion = 0;
	 
	 
	 do {
		 System.out.println("1. Facil");
         System.out.println("2. Intermedio");
         System.out.println("3. Avanzado");
         System.out.println("4. Experto");
         System.out.println("5. Salir"); 
         
         
         
         System.out.println("Introduce un número: ");
         
         opcion = sc.nextByte();
         
         
	} while (opcion < 1 || opcion > 5);
	 
	 switch(opcion) {
     case 1:
    	 int numrand = (int) ((Math.random() * 10)+1); // Número aleatorio de 1 a 100.
    	 System.out.println("Ha elegido Facil");
    	 System.out.println("El juego consiste en averiguar un número secreto del 1 al 10");

    	 System.out.print("Tienes 5 intentos. Escribe un número entre 1 y 10: ");
    	 numusu = sc.nextInt();
    	 
    	 for (numfor=0; numfor<=4; numfor++) { 

 		    // Primero se evalúa si se ha acertado.
 		    
 		    if (numrand == numusu) {  
 		      System.out.println("Has acertado!"); 
 		      break; } 
 		    
 		    // partida perdida si ya has gastado 5 los intentos.     
 		    
 		    else if (numfor == 4) { 
 		      System.out.println("Lo siento: ¡has perdido!. El número era el: " + numrand); 
 		      break; } 
 		    
 		    // Si no es ninguno de los casos anteriores.
 		    
 		    else if (numrand > numusu) 
 		      System.out.println("El número secreto es MAYOR que " + numusu);
 		    else if (numrand < numusu)
 		      System.out.println("El número secreto es MENOR que " + numusu);

 		    // ultima oportunidad y pistas.
 		    
 		    if (numfor <=1) { 
 		     System.out.print("Otro intento: "); 
 		     numusu = sc.nextInt(); } 
 		    else if (numfor ==2) { 
 		    int x = (int) (numrand/10);
 		    System.out.println("Una pista, la primera cifra es " + x);
 		    System.out.print("Inténtalo de nuevo: ");
 		    numusu = sc.nextInt(); } 
 		   else if (numfor >= 3) {
 		   System.out.print("ÚLTIMO intento: ");
 		   numusu = sc.nextInt(); }
    	 }
    	
    	 
         break;
           
     case 2:
    	 int numrand2 = (int) ((Math.random() * 50)+1); // Número aleatorio de 1 a 100.
         System.out.println("Ha elegido intermedio");
         System.out.println("El juego consiste en averiguar un número secreto del 1 al 100");

    	 System.out.print("Tienes 5 intentos. Escribe un número entre 1 y 100: ");
    	 numusu = sc.nextInt();
    	 
    	 for (numfor=0; numfor<=4; numfor++) { 

 		    // Primero se evalúa si se ha acertado.
 		    
 		    if (numrand2 == numusu) {  
 		      System.out.println("Has acertado!"); 
 		      break; } 
 		    
 		    // partida perdida si ya has gastado 5 los intentos.     
 		    
 		    else if (numfor == 4) { 
 		      System.out.println("Lo siento: ¡has perdido!. El número era el: " + numrand2); 
 		      break; } 
 		    
 		    // Si no es ninguno de los casos anteriores.
 		    
 		    else if (numrand2 > numusu) 
 		      System.out.println("El número secreto es MAYOR que " + numusu);
 		    else if (numrand2 < numusu)
 		      System.out.println("El número secreto es MENOR que " + numusu);

 		    // ultima oportunidad y pistas.
 		    
 		    if (numfor <=1) { 
 		     System.out.print("Otro intento: "); 
 		     numusu = sc.nextInt(); } 
 		    else if (numfor ==2) { 
 		    int x = (int) (numrand2/10);
 		    System.out.println("Una pista, la primera cifra es " + x);
 		    System.out.print("Inténtalo de nuevo: ");
 		    numusu = sc.nextInt(); } 
 		   else if (numfor >= 3) {
 		   System.out.print("ÚLTIMO intento: ");
 		   numusu = sc.nextInt(); }
    	 }
         break;
       
     case 3:
         System.out.println("Ha elegido Avanzado");
         int numrand3 = (int) ((Math.random() * 100)+1); // Número aleatorio de 1 a 100.
         
         System.out.println("El juego consiste en averiguar un número secreto del 1 al 100");

    	 System.out.print("Tienes 5 intentos. Escribe un número entre 1 y 100: ");
    	 numusu = sc.nextInt();
    	 
    	 for (numfor=0; numfor<=4; numfor++) { 

 		    // Primero se evalúa si se ha acertado.
 		    
 		    if (numrand3 == numusu) {  
 		      System.out.println("Has acertado!"); 
 		      break; } 
 		    
 		    // partida perdida si ya has gastado 5 los intentos.     
 		    
 		    else if (numfor == 4) { 
 		      System.out.println("Lo siento: ¡has perdido!. El número era el: " + numrand3); 
 		      break; } 
 		    
 		    // Si no es ninguno de los casos anteriores.
 		    
 		    else if (numrand3 > numusu) 
 		      System.out.println("El número secreto es MAYOR que " + numusu);
 		    else if (numrand3 < numusu)
 		      System.out.println("El número secreto es MENOR que " + numusu);

 		    // ultima oportunidad y pistas.
 		    
 		    if (numfor <=1) { 
 		     System.out.print("Otro intento: "); 
 		     numusu = sc.nextInt(); } 
 		    else if (numfor ==2) { 
 		    int x = (int) (numrand3/10);
 		    System.out.println("Una pista, la primera cifra es " + x);
 		    System.out.print("Inténtalo de nuevo: ");
 		    numusu = sc.nextInt(); } 
 		   else if (numfor >= 3) {
 		   System.out.print("ÚLTIMO intento: ");
 		   numusu = sc.nextInt(); }
    	 }
         break;
       
     case 4:
         System.out.println("Ha elegido Experto");
         int numrand4 = (int) ((Math.random() * 100)+1); // Número aleatorio de 1 a 100.
         System.out.println("El juego consiste en averiguar un número secreto del 1 al 100");

    	 System.out.print("Tienes 4 intentos. Escribe un número entre 1 y 100: ");
    	 numusu = sc.nextInt();
    	 
    	 for (numfor=0; numfor<=3; numfor++) { 

 		    // Primero se evalúa si se ha acertado.
 		    
 		    if (numrand4 == numusu) {  
 		      System.out.println("Has acertado!"); 
 		      break; } 
 		    
 		    // partida perdida si ya has gastado 5 los intentos.     
 		    
 		    else if (numfor == 3) { 
 		      System.out.println("Lo siento: ¡has perdido!. El número era el: " + numrand4); 
 		      break; } 
 		    
 		    // Si no es ninguno de los casos anteriores.
 		    
 		    else if (numrand4 > numusu) 
 		      System.out.println("El número secreto es MAYOR que " + numusu);
 		    else if (numrand4 < numusu)
 		      System.out.println("El número secreto es MENOR que " + numusu);

 		    // ultima oportunidad y pistas.
 		    
 		    if (numfor <=1) { 
 		     System.out.print("Otro intento: "); 
 		     numusu = sc.nextInt(); } 
 		    else if (numfor ==2) { 
 		    System.out.print("Inténtalo de nuevo: ");
 		    numusu = sc.nextInt(); } 
 		   else if (numfor >= 2) {
 		   System.out.print("ÚLTIMO intento: ");
 		   numusu = sc.nextInt(); }
    	 }
         break;
       
     case 5:
         System.out.println("Ha salido");
         break;
	 
	 }
	 
		 
}
}

//--------------JOSE IGNACIO GODINO---------------------
		



	




	 
