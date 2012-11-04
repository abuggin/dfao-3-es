
import prog.io.*;
import prog.utili.Intero;

class Es38{
	public static void main(String[] args) {
		
		//Input e output
		
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();		
		
		Intero n = new Intero(in.readInt("numero? "));
		String ns = n.toString();
		int nsl = ns.length();

		if(nsl==n.intValue()/2)
			out.println("La lunghezza della parola "+ns+" e' "+ (nsl)+", uguale alla meta' di "+n.toString());
		else
			out.println("La lunghezza della parola "+ns+" e' "+ Integer.toString(nsl)+", mentre la meta' di "+n.toString()+" e' "+Integer.toString((n.intValue())/2));
	}
}
