import prog.io.*;

class Es81{
	public static void main(String[] args) {
		ConsoleOutputManager out = new ConsoleOutputManager();
		Alfa a = new Alfa();
		a.inc();
		out.println(a.getTotale());
		a = new Beta();
		a.inc();
		out.println(a.getTotale());
		Beta b = new Beta();
		b.inc();
		out.println(b.getTotale());
		out.println(a.getTotale());
	}
}
