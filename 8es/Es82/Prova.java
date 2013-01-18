import prog.io.*;
class Prova{
	public static void main (String[] args){
		ConsoleOutputManager out = new ConsoleOutputManager();
		out.println(Alfa.getStatico());
		Alfa a = new Alfa();
		out.println(a.getIntero());
		a = new Alfa("pappagallo");
		out.println(a.getIntero());
		out.println(Alfa.getStatico());
	}
}
