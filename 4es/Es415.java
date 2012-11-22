/**
 * 4.14 - Alessandro Buggin
 * programma che legge una frazione e un esponente
 * e calcoli il risultato
 * 
 **/

import prog.io.*;
import prog.utili.Frazione;

class Es415 {
	public static void main(String[] args) {

		//Input e output

		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
    
    String s1 = in.readLine("Stringa> ");
    int cont = 0;
    char c = '\n';
    out.println(s1.toUpperCase());
    for(int i=0; i<s1.length();i++){
      out.print("-");
      c=s1.charAt(i);
      if(c>='a'&&c<='z')
        cont++;
      }
    out.println("\n"+cont);
  }
}

