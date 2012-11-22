/**
 * 4.14 - Alessandro Buggin
 * programma che legge una frazione e un esponente
 * e calcoli il risultato
 * 
 **/

import prog.io.*;
import prog.utili.*;

class Es420 {
	public static void main(String[] args) {

		//Input e output

		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();

    int op1 = in.readInt("primo operando ");
    int op2 = in.readInt("secondo operando ");
    boolean cond = false;
    char c='\n';
    while(cond==false){
    String  op = in.readLine("operatore ");
    c=op.charAt(0);
    //out.println(c);//debug
    if(c!='+'&&c!='*'&&c!='/'&&c!='%'&&c!='-'){
      out.println("gli operatori ammessi sono:\n\t+\n\t*\n\t-\n\t/\n\t%");
      cond=false;}
    else{
      cond=true;
      break;}}
    switch(c){
      case '+':
        out.println(op1+op2);
        break;
      case '-':
        out.println(op1-op2);
        break;
      case '/':
        out.println(op1/op2);
        break;
      case '%':
        out.println(op1%op2);
        break;
      case '*':
        out.println(op1*op2);
        break;
      }
    }
}
      

