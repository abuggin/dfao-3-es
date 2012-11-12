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
		final int MAX = in.readInt("quanti n devono essere generati? ");
		int limit = in.readInt("limite per la generatione casuale? ");
		int somma = 0;
		for(int j = 0; j < MAX;j++){
			int i = rand.nextInt(limit);
			out.println(i);
			somma+=i;
			}
		out.println("la somma e\' : "+somma);
}}

		
		
