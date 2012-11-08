/**
 * 3.16 - Alessandro Buggin
 * programma che legge una frazione e un esponente
 * e calcoli il risultato
 * 
 **/

import prog.io.*;
import prog.utili.Frazione;

class Es316 {
	public static void main(String[] args) {

		//Input e output

		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();	

		int num, den, n, tmp, numa, dena;
		num = in.readInt("Numeratore prima frazione> ");
		den = in.readInt("Denominatore prima frazione> ");
		n = in.readInt("esponente> ");
		numa = num;
		dena = den;
		if(n!=0){
			tmp = 0;
			if(n<0){
				tmp=num;
				num=den;
				den=tmp;
				n=-n;				
			}
			numa = num;
			dena = den;
			for(int j=n;j!=1;j--)
				numa=numa*num;
			for(int k=n;k!=1;k--)
				dena=dena*den;
		}
		else if(n==0){
			num=1;
			den=1;
		}
		Frazione r = new Frazione(numa,dena);
		out.println(r.toString());
	}
}
