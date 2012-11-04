/**
 * 2.10 - Alessandro Buggin
 * programma che calcola lo scontrino indentato
 * 
 **/

import prog.io.*;
import prog.utili.Importo;

class Es210 {
	public static void main(String[] args) {
		
		//Input e output
		
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();		
	
		int euro = in.readInt("Prezzo: euro? ");
		int cent = in.readInt("        cent? ");
		int sconto = in.readInt("Sconto percentuale? ");
		int decSconto;
		Importo prezzo = new Importo(euro,cent);
		Importo prezz1 = prezzo.per(sconto);
		Importo prezz2 = prezz1.diviso(100);//sconto
		Importo prezz3 = prezzo.meno(prezz2);//prezzo scontato
		
		String indentazione =  
		"                    "+
		"                    "+
		"                    "+
		"                    ";//assumendo terminale di 80 caratteri, se c'è modo più intelligente, fatemi sapere.
		
		//blocco per sistemare la prima riga dello scontrino
		String prezzoString = prezzo.toString();//"10,60"
		int prezzoStringLength = prezzoString.length();//5
		String riga1 = indentazione.substring(0,80-7-(prezzoString.length()));
		
		//blocco per sistemare la seconda riga dello scontrino
		if (sconto<10)
			decSconto=1;
		else
			decSconto=2;
		String prezz2String = prezz2.toString();
		int prezz2StringLength = prezz2String.length();
		String riga2 = indentazione.substring(0,80-7-1-decSconto-(prezz2String.length()));
		
		//blocco per sistemare la terza riga dello scontrino
		
		int prezz3StringLength = (prezz3.toString()).length();
		String riga3 = indentazione.substring(0,80-9-5-prezz3StringLength);
		
		//blocco per sistemare la quarta riga dello scontrino
		
		int prezz3LireStringLength = ((Integer.toString(prezz3.toLire())).length());
		String riga4 = indentazione.substring(0,80-6-prezz3LireStringLength-1);
		
		//printa tutto
		out.println("IMPORTO"+riga1+prezzo.toString());
		out.println("SCONTO "+sconto+"%"+riga2+prezz2.toString());
		out.println("DA PAGARE"+riga3+"EURO "+prezz3.toString()+"\n"+riga4+"(Lire "+prezz3.toLire()+")");
		}
		}
