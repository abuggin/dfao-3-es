/**
 * 3.29 - Alessandro Buggin
 * programma che genera 20 numeri casuali
 * 
 **/

import prog.io.*;
import prog.utili.*;
import java.util.Random;

class Es329 {
	public static void main(String[] args) {

		//Input e output
		Random rand = new Random();
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();		
		int somma = 0;
		for(int j = 0; j<20;j++){
			int i = rand.nextInt();
			out.println(i);
			somma+=i;
			}
		out.println("la somma e\' : "+somma);
}}

		
		
