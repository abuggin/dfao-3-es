import prog.io.*;


class Es37 {
  
  public static void main(String [] args) {
    //predisposizione dei canali di comunicazione
    ConsoleInputManager in = new ConsoleInputManager();
    ConsoleOutputManager out = new ConsoleOutputManager();
    
    //lettura della stringa
    String s1 = in.readLine("Inserire la prima stringa > ");
    String s2 = in.readLine("Inserire la seconda stringa > ");
    
    if (s1.compareTo(s2)==0)
    out.println("Le due stringhe sono uguali");
    else{
    	if (s1.compareTo(s2)<0)
    		//s1 minore di s2
    		out.println("Ordine alfabetico:\n"+s1+"\n"+s2);
    	else
    		out.println("Ordine alfabetico:\n"+s2+"\n"+s1);
    if (s1.length()<s2.length())
    	out.println("\nOrdine di lunghezza:"+s1+"\n"+s2);
    else 
    	if(s1.length()>s2.length())
    		out.println("\nOrdine di lunghezza:"+s2+"\n"+s1);
    	else
    		out.println("Le due stringhe hanno la stessa lunghezza");}
    }
    }
