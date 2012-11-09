/**
 * 3.14 - Alessandro Buggin
 * programma che riceve due interi a,b e stampa tutti i numeri compresi per cui
 * la lunghezza del loro nome in italiano e' meta del numero stesso
 * 
 **/

import prog.io.*;
import prog.utili.Intero;

class Es314 {
	public static void main(String[] args) {
		
		//Input e output
		
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();	
		
		int x = in.readInt("Estremo inferiore? ");
		int y = in.readInt("Estremo superiore? ");
		while(x!=y){
				
		Intero a = new Intero(x);
		if(a.toString().length() == a.intValue()/2)
			out.println(a.intValue());
		x++;
			
			}}}
