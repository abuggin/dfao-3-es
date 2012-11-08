/**
 * 3.15 - Alessandro Buggin
 * programma che legge sequenza di frazioni
 * determini la maggiore e la minore e le stampi
 * 
 **/

import prog.io.*;
import prog.utili.Frazione;

class Es315 {
	public static void main(String[] args) {
		
		//Input e output
		
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();	
		Frazione max = new Frazione(1,1);
		Frazione min = new Frazione(1,1);
		
		String m = "si";
		int cont = 0;
		while(true){
			m=in.readLine("Inserire altra frazione?");
			if(m.equals("no"))
				break;
			//lettura e costruzione della prima frazione
			int num, den;
			num = in.readInt("Numeratore frazione "+cont+" > ");
			den = in.readInt("Denominatore frazione "+cont+" > ");
			Frazione f = new Frazione(num, den);
			//out.println("Inserire altra frazione?");
			if (f.isMaggiore(max))
				max=f;
			else if (f.isMinore(min))
				min=f;//assegno il riferimento all'oggetto f anche a min
			cont++;}
		out.println("La frazione maggiore e\' "+max.toString());
		out.println("La frazione minore e\' "+min.toString());
}}
