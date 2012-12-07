/**
 * Alessandro Buggin
 * programma che legge due importi in Lire
 * visualizza somma, media e differenza
 */
import prog.io.*;
import prog.utili.*;

class Es427 {
  public static void main (String[] args){

  ConsoleInputManager in = new ConsoleInputManager();
  ConsoleOutputManager out = new ConsoleOutputManager();

  int lire = in.readInt("Inserire il primo importo in Lire ");
  Importo a = Importo.fromLire(lire);

  lire = in.readInt("Inserire il secondo importo in Lire ");
  Importo b = Importo.fromLire(lire);

  out.println("La somma e\' "+a.piu(b).toString());
  out.println("La media e\' "+a.piu(b).diviso(2));
  if(a.isMinore(b))
    out.println("La differenza e\' "+b.meno(a).toString());
  else
    out.println("La differenza e\' "+a.meno(b).toString());
  }
}
