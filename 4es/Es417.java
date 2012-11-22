/**
 * 4.14 - Alessandro Buggin
 * programma che legge una frazione e un esponente
 * e calcoli il risultato
 * 
 **/

import prog.io.*;
import prog.utili.*;

class Es417 {
	public static void main(String[] args) {

		//Input e output

		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
    
    int g = in.readInt("Inserisci la tua data di nascita\nGiorno? ");
    int m = in.readInt("Mese? ");
    int a = in.readInt("Anno? ");
    Data data = new Data(g,m,a);
    Data oggi = new Data();
    out.println("Data Odierna: "+oggi.toString()+"\nData di nascita: "+data.toString()+"\nDifferenza rispetto a oggi: "+data.quantoManca(oggi));
  }
}
