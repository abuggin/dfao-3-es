/**
 * 2.9 - Alessandro Buggin
 * programma che calcola lo scontrino
 * 
 **/

import prog.io.*;
import prog.utili.Importo;

class Es29 {
	public static void main(String[] args) {
		
		//Input e output
		
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();		
	
		int euro = in.readInt("Prezzo: euro? ");
		int cent = in.readInt("        cent? ");
		int sconto = in.readInt("Sconto percentuale? ");
	
		Importo prezzo = new Importo(euro,cent);
		Importo prezz1 = prezzo.per(sconto);
		Importo prezz2 = prezz1.diviso(100);//sconto
		Importo prezz3 = prezzo.meno(prezz2);//prezzo scontato
		
		out.println("Prezzo: EURO "+prezzo.toString());
		out.println("Sconto: EURO "+prezz2.toString());
		out.println("Prezzo scontato: EURO "+prezz3.toString()+" (Lire "+prezz3.toLire()+")");
		}
		}
		//giusto al primo colpo. e me la meno
		
