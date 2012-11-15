/**
 * 4.14 - Alessandro Buggin
 * programma che legge una frazione e un esponente
 * e calcoli il risultato
 * 
 **/

import prog.io.*;
import prog.utili.Frazione;

class Es414 {
	public static void main(String[] args) {

		//Input e output

		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();

		String s1=in.readLine();
		String s2=in.readLine();
		int count1=0, count2=0, countA=0;
		for(int i = 0; i<s1.length();i++){
			count1++;
			if(s1.charAt(i)=='A'||s1.charAt(i)=='a')
				countA++;
		}
		for(int i = 0; i<s2.length();i++)
			count2++;
		out.println(count1+count2);
		if(count1>count2)
			out.println(s1);
		else
			out.println(s2);
		out.println(countA);
	}
}

