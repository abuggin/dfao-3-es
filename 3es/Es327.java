/**
 * 3.27 - Alessandro Buggin
 * programma che calcola lo scontrino
 * 
 **/

import prog.io.*;
import prog.utili.*;

class Es327 {
	public static void main(String[] args) {

		//Input e output

		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();		
		
		Intero eur = new Intero(in.readInt("Inserire il prezzo:\n --- euro? "));
		Intero cen = new Intero(in.readInt(" --- centesimi? "));
		Importo prezzo = new Importo(eur.intValue(),cen.intValue());
		Intero lire = new Intero(prezzo.toLire());
		out.println("Prezzo: EURO "+prezzo.toString()+" ("+eur.toString()+"/"+prezzo.getCent()+")"+"\nPrezzo: Lire "+lire.intValue()+" ("+lire.toString()+")");
		int perc = in.readInt("Percentuale di sconto: ");
		//out.println("prezzo.getCent()=="+prezzo.getCent());
		Importo sconto = prezzo.per(perc).diviso(100);
		Importo scontato = prezzo.meno(sconto);
		out.println("Sconto: EURO "+sconto.toString()+"\nPrezzo scontato: EURO "+(scontato));
		Importo pagato = new Importo(in.readInt("Inserire l'importo pagato: \n --- euro? "),in.readInt(" --- centesimi? "));
		out.println("Importo pagato: EURO "+pagato.toString());
		if(pagato.isMinore(sconto))
			//debito
			out.println("Debito: "+scontato.meno(pagato));
		else
			//resto
			out.println("Resto: "+scontato.meno(pagato));
	}}
		
