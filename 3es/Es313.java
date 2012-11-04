/**
 * 3.13 - Alessandro Buggin
 * programma che calcola se n è primo
 * versione a
 * calcolo tutti
 **/

import prog.io.*;

class Es313 {
	public static void main(String[] args) {
		
		//Input e output
		
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();		
		
		int n = in.readInt("inserire numero >  ");
		boolean diviso = false;
		for (int i = 2; i!=n/2; i++){
			if (n%i != 0)
				out.println("non divisibile per "+i);
				
			else{
				out.println("divisibile per "+i);
				diviso = true;
				break;
}
				
			}
			if(diviso == false)
				out.println("quindi è primo");
		}
		}
