import prog.io.*;
import prog.utili.*;

class Es436{
  public static void main(String args[]){
    ConsoleInputManager in = new ConsoleInputManager();
    ConsoleOutputManager out = new ConsoleOutputManager();
    //int min = 0, max = 0;
    Integer min = 0, max = 0;
    boolean continuare;

    do{
      //int attuale = in.readInt("inserisci numero ");
      Integer attuale = in.readInt("inserisci numero ");
      //if(min==0||attuale<=min)
      if(min.compareTo(new Integer(0))==0||attuale.compareTo(min)<0)
        min=attuale;
      //if(max==0||attuale>=max)
      if(max.compareTo(new Integer(0))==0||attuale.compareTo(max)>0)
        max=attuale;
      continuare = in.readSiNo("continuare? s/n ");
    }while(continuare);

    out.println("Il numero piu' piccolo e' "+min.toString());
    out.println("Il numero piu' grande e' "+max.toString());
  }
}
