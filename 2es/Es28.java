/**
 * 2.8 - Alessandro Buggin
 * programma che calcola la lunghezza di
 * stringa data (pippo) -> cifre (5) e lettere (cinque)
 * lettere (cinque) -> cifre (6) e lettere (sei)
 * cifre -> cifre (1) e lettere (uno)
 * 
 **/

import prog.io.*;
import prog.utili.Intero;

class Es28 {
	public static void main(String[] args) {
		
		//Input e output
		
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();		
		
		//bordello
		String stringa = in.readLine("Stringa? ");					//prende la stringa "Pippo"
		Intero cifreData = new Intero(stringa.length());			//crea un Intero con valore la lunghezza della stringa == 5
		String lettereData = cifreData.toString();					//essendo un oggetto Intero, mi scrive il valore int in char == "cinque"

		Intero cifreLettere = new Intero(lettereData.length());		//con la lunghezza della stringa creo un nuovo oggetto Intero == 6
		String lettereLettere = cifreLettere.toString();			//essendo un oggetto Intero, mi scrive il valore int in char == "sei"
		
		String diAppoggio = new String(""+cifreData.intValue());	//l'idea è di creare una stringa che contenga solo il valore 5 come se fosse un char, non un valore int o Intero == "5"
		/**
		 * hack : avevo un int e non mi faceva il cast automatico, 
		 * quindi gli ho messo una stringa vuota
		 * + l'intero di prima ed ecco che mi fa il cast.
		 * non credo sia la soluzione più bella del mondo.
		 */
		Intero cifreCifre = new Intero(diAppoggio.length());		//==1
		String lettereCifre = cifreCifre.toString();				//==uno
		
		//output tutto
		out.println(
		"La lunghezza della stringa \""
		+stringa
		+"\" è "
		+cifreData.intValue()
		+" ("
		+lettereData+")");
		out.println("La lunghezza della stringa \""
		+lettereData
		+"\" è "
		+cifreLettere.intValue()
		+" ("
		+lettereLettere
		+")");
		out.println("La lunghezza della stringa \""
		+cifreData.intValue()
		+"\" è "
		+cifreCifre.intValue()
		+" ("
		+lettereCifre
		+")");
		//debug per trovare l'errore nell'algoritmo
		//out.println(diAppoggio+" "+diAppoggio.length());
		}
		}
		
