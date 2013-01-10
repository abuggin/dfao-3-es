import prog.io.*;

class ProvaOra {

  public static void main(String[] args) {
    //predisposizione dei canali di comunicazione
    ConsoleInputManager in = new ConsoleInputManager();
    ConsoleOutputManager out = new ConsoleOutputManager();

    String s = in.readLine("Inserire un orario (hh:mm) ");
    Ora o = new Ora(s);
    Ora adesso = new Ora();
    out.println("Sono le " + adesso.toString());
    if (o.isMinore(adesso)) 
      out.println("Dalle " + o.toString() + " di oggi sono passati " + 
                  o.quantoManca(adesso) + " minuti");
    else if (o.isMaggiore(adesso)) 
      out.println("Mancano " + adesso.quantoManca(o) + " minuti alle " +
                  o.toString() + " di oggi");
    else
      out.println("L'ora inserita e\' quella attuale: " + o.toString());
  }
}
