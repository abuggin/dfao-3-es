/**
 * 4.14 - Alessandro Buggin
 * programma che legge una frazione e un esponente
 * e calcoli il risultato
 * 
 **/

import prog.io.*;
import prog.utili.*;

class Es422 {
  public static void main(String[] args) {

    //Input e output

    ConsoleInputManager in = new ConsoleInputManager();
    ConsoleOutputManager out = new ConsoleOutputManager();

    int a =in.readInt("inserisci un numero "),b = in.readInt("un'altro ");
    int c= a+b;
    String riga="";
    String ad=String.valueOf(a), bd=String.valueOf(b), cd=String.valueOf(c), max=ad, add="",bdd="",cdd="";
    if(cd.length()>ad.length()&&cd.length()>bd.length())
      max=cd;
    else
      if(bd.length()>ad.length()&&bd.length()>cd.length())
        max=bd;
      else
        max=ad;
    for(int i=1;i<=max.length();i++){
      riga+="-";
      if(ad.length()!=max.length())
        add+=" ";
      if(bd.length()!=max.length())
        bdd+=" ";
      if(cd.length()!=max.length())
        cdd+=" ";
      ad=add+a;
      bd=bdd+b;
      cd=cdd+c;
    }
    ad+="+";
    bd+="=";
    out.println("\n"+ad+"\n"+bd+"\n"+riga+"\n"+cd);
  }
}
