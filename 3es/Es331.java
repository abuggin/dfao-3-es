/**
 * 3.31 - Alessandro Buggin
 * programma che genera 20 numeri casuali
 * 
 **/

import prog.io.*;
import prog.utili.*;
import java.util.Random;

class Es331 {
	public static void main(String[] args) {

		//Input e output
		Random rand = new Random();
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();		
		int testa = 0,croce = 0,differenza;
		final int numerolanci= in.readInt("Inserire il numero di lanci: ");
		for (int i=0; i< numerolanci; i++)
			if(rand.nextBoolean()==true)
				testa++;
			else
				croce++;
		if(testa<croce)
			differenza=croce-testa;
		else
			differenza=testa-croce;
		out.println("testa "+testa+" volte\ncroce "+croce+" volte\ndifferenza: "+differenza);
		}}
