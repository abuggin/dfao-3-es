/**
 * 2.6 - Alessandro Buggin
 * programma che calcola la media lunghezza di due stringhe inserite
 **/

import prog.io.*;
import prog.utili.Frazione;

class Es26 {
	public static void main(String[] args) {
		
		//Input e output
		
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();		
		
		//Stringhe
		String prima = in.readLine("Inserire la prima stringa> ");
		String seconda = in.readLine("Inserire la seconda stringa> ");
		
		int p = prima.length();
		int s = seconda.length();
		// introdotto proporzione perché per errore non avevo ragionato su come tradurre media e avevo sbagliato algoritmo, in sostanza. Quando ho capito cosa avevo codificato, ho deciso di tenerlo :)
		Frazione proporzione = new Frazione(p,s);
		Frazione media = new Frazione(p+s,2);
		
		out.println("La lunghezza di "+prima+" è: "+p);
		out.println("La lunghezza di "+seconda+" è: "+s);
		out.println("La proporzione delle loro lunghezze è: "+proporzione.toString());
		out.println("La media delle loro lunghezze è: "+media.toString());
		
		}
		}
		
