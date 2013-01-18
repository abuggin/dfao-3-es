import prog.utili.*;
import prog.io.*;

public class Alfa extends Importo {
	private String w = "ratto";
	private static int k = 1;
	public Alfa() {
		super(10);
		k++;
	}

	public Alfa(String s) {
		this();
		w=s;
	}
	public int getIntero(){
		return this.getEuro() + w.length();
	}
	public static int getStatico() {
		return k;
	}
}
