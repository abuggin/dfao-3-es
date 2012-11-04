/**
 * 3.4 - Alessandro Buggin
 * programma che legge due frazioni
 * riscrive in ordine crescente
 * 
 **/

import prog.io.*;
import prog.utili.Frazione;

class Es34 {
	public static void main(String[] args) {
		
		//Input e output
		
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();	
			
		    int num, den; 

    //lettura e costruzione della prima frazione
    num = in.readInt("Numeratore prima frazione> ");
    den = in.readInt("Denominatore prima frazione> ");
    Frazione f1 = new Frazione(num, den);
    out.println("");
    //lettura e costruzione della seconda frazione
    num = in.readInt("Numeratore seconda frazione> ");
    den = in.readInt("Denominatore seconda frazione> ");
    Frazione f2 = new Frazione(num, den);
    
    out.println("\nStampo in ordine crescente\n");
    
	if(f1.isMaggiore(f2)){
    	out.println("\t"+f2.toString());
   		out.println("\t"+f1.toString());
    }
    else{
		out.println("\t"+f1.toString());
    	out.println("\t"+f2.toString());
    }
    out.println("");
    }
    }
