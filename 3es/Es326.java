/**
 * 3.26 - Alessandro Buggin
 * programma che calcola lo scontrino
 * 
 **/

import prog.io.*;
import prog.utili.*;

class Es326 {
	public static void main(String[] args) {

		//Input e output

		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();		
		Sequenza<Importo> prezzi = new Sequenza<Importo>();	
		String s="";
		do{
			s=in.readLine("vuoi inserire un\'importo? (si\\no)");
			if(s.equals("n")||s.equals("no")||s.equals("f"))
				break;
			else{

				int euro = in.readInt("Prezzo: euro? ");
				int cent = in.readInt("        cent? ");

				Importo prezzo = new Importo(euro,cent);
				prezzi.add(prezzo);}}
			while(s.equals("s")||s.equals("si")||s.equals("y"));

			int sconto = in.readInt("Sconto percentuale? ");
			Importo maggiore = new Importo(0,0);
			for(Importo x:prezzi)
				if(x.isMaggiore(maggiore))
					maggiore=x;
			Importo prezz1 = maggiore.per(sconto);
			Importo prezz2 = prezz1.diviso(100);//sconto
			Importo prezz3 = maggiore.meno(prezz2);//prezzo maggiore scontato
			Importo totale = prezz3;
			for(Importo x:prezzi){
				if(x.equals(maggiore))
					;
				else
					totale=x.piu(totale);
					out.println(totale.toString());}
			out.println("TOTALE: EURO "+totale.piu(prezz2).toString());
			out.println("SCONTO "+sconto+"% su "+maggiore.toString()+": EURO "+prezz2.toString());
			out.println("TOTALE SCONTATO: EURO "+totale.toString()+" (Lire "+totale.toLire()+")");
		}
	
}	
