import prog.io.*;
import prog.utili.*;
import java.util.*;

class Es424 {
  public static void main (String [] args){
    ConsoleInputManager in = new ConsoleInputManager();
    ConsoleOutputManager out = new ConsoleOutputManager();
    int num,den=0;
    Frazione somma = new Frazione(0);

    String input = in.readLine("Inserisci sequenza di frazioni ");
    StringTokenizer stk = new StringTokenizer(input," + ");
    while(stk.hasMoreTokens()){
      String token = stk.nextToken();
      StringTokenizer stk2 = new StringTokenizer(token,"/");
      Frazione current;
      while(stk2.hasMoreTokens()){
        String token2 = stk2.nextToken();
        num = Integer.parseInt(token2);
        //        if(stk2.hasMoreTokens()){
        token2 = stk2.nextToken();
        den = Integer.parseInt(token2);
        //       }else
        //          den = 1;
        current = new Frazione(num,den);
        //out.println(current.toString());
        somma = current.piu(somma);
      }
    }    
    out.println("La somma e\' "+somma.toString());
  }
}
