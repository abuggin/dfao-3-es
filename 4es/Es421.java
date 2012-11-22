/**
 * 4.14 - Alessandro Buggin
 * programma che legge una frazione e un esponente
 * e calcoli il risultato
 * 
 **/

import prog.io.*;
import prog.utili.*;

class Es421 {
  public static void main(String[] args) {

    //Input e output

    ConsoleInputManager in = new ConsoleInputManager();
    ConsoleOutputManager out = new ConsoleOutputManager();

    String s1 = in.readLine("Stringa> ");
    int cont=0;
    for(int i = 0; i<s1.length();i++){
      out.print(s1.charAt(i));
      for(int j=0; j<s1.length();j++){
        if(s1.charAt(i)==s1.charAt(j))
          cont++;
      }
      out.println(" si trova "+cont+" volte in "+s1);
      cont=0;}
  }
}

