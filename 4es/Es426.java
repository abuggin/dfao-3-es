/**
 * Alessandro Buggin
 * programma che legge due importi
 * visualizza somma, media e differenza
 */
import prog.io.*;
import prog.utili.*;

class Es426 {
  public static void main (String[] args){

  ConsoleInputManager in = new ConsoleInputManager();
  ConsoleOutputManager out = new ConsoleOutputManager();

  int euro = in.readInt("Inserire Euro primo importo ");
  int cent = in.readInt("Inserire Cent primo importo ");
  Importo a = new Importo(euro,cent);

  euro = in.readInt("Inserire Euro secondo importo ");
  cent = in.readInt("Inserire Cent secondo importo ");
  Importo b = new Importo(euro,cent);

  out.println("La somma e\' "+a.piu(b).toString());
  out.println("La media e\' "+a.piu(b).diviso(2));
  if(a.isMinore(b))
    out.println("La differenza e\' "+b.meno(a).toString());
  else
    out.println("La differenza e\' "+a.meno(b).toString());
  }
}
