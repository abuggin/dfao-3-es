/**
 * 2.7 - Alessandro Buggin
 * programma che calcola la somma in cifre e in parole
 * 
 **/

import prog.io.*;
import prog.utili.Intero;

class Es27 {
	public static void main(String[] args) {
		
		//Input e output
		
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();		
		
		int ad1 = in.readInt("primo addendo? ");
		int ad2 = in.readInt("secondo addendo? ");
		//int som = ad1+ad2;
		
		Intero add1 = new Intero(ad1);
		Intero add2 = new Intero(ad2);
		Intero somm = new Intero(ad1+ad2);
		
		//out.println(ad1+" + "+ad2+" = "+som);
		//out.println(add1.toString()+" + "+add2.toString()+" = "+(add1.intValue()/*int*/+add2.intValue()/*int*/).toString()/*non va bene, è int.toString, quando doveva essere un Intero. questa funzione sta facendo troppe cose. meglio introdurre una variabile*/);
		out.println(ad1+" + "+ad2+" = "+(ad1+ad2));
		out.println(add1.toString()+" + "+add2.toString()+" = "+somm.toString());
		
}
}

