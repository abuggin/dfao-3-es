/**
 * 4.14 - Alessandro Buggin
 * programma che legge una frazione e un esponente
 * e calcoli il risultato
 * 
 **/

import prog.io.*;
import prog.utili.*;
import java.util.*;

class Es423 {
  public static void main(String[] args) {

    //Input e output

    ConsoleInputManager in = new ConsoleInputManager();
    ConsoleOutputManager out = new ConsoleOutputManager();
    int somma = 0;
    boolean cond=false;
    String sequenza = new String();
    do{
      sequenza = in.readLine("Inserisci una sequenza di numeri interi separati da spazio: ");
      for(int i=0;i<sequenza.length();i++)
        if(!Character.isDigit(sequenza.charAt(i))&&sequenza.charAt(i)!=' '){
          cond=true;
          break;}
        else{
          cond=false;
           out.println("Inserisci solo numeri e spazi");
           }
    }while(cond==true);
    StringTokenizer stk = new StringTokenizer(sequenza, " ");
    while(stk.hasMoreTokens()){
      String token = stk.nextToken();
      somma= somma+Integer.parseInt(token);}
    out.println("La somma dei numeri nella sequenza e\': "+somma);
  }
}

