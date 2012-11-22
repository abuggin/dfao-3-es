/**
 * 4.14 - Alessandro Buggin
 * programma che legge una frazione e un esponente
 * e calcoli il risultato
 * 
 **/

import prog.io.*;
import prog.utili.*;

class Es418 {
	public static void main(String[] args) {

		//Input e output

		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
    Data data;
    Data oggi;
    int diff;
    do{
    int g = in.readInt("Inserisci la tua data di nascita\nGiorno? ");
    int m = in.readInt("Mese? ");
    int a = in.readInt("Anno? ");
    data = new Data(g,m,a);
    oggi = new Data();
    diff = data.quantoManca(oggi);
    if(diff<0)
      out.println("Hai inserito una data futura");
    }while(diff<0);
    out.println("Data Odierna: "+oggi.toString()+"\nData di nascita: "+data.toString());
    out.println("Differenza rispetto a oggi: "+diff);
  }
}
