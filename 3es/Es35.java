import prog.io.*;

class Es35 {

  public static void main(String[] args) {
    //predisposizione dei canali di comunicazione
    ConsoleInputManager in = new ConsoleInputManager();
    ConsoleOutputManager out = new ConsoleOutputManager();    

    String nome,cognome, diffString; 
    int lunghezza,luncog,lunom,diff;
    
    //lettura del nome e calcolo della lunghezza
    nome = in.readLine("Inserisci il tuo nome> ");
    lunom = nome.length();
    cognome = in.readLine("Inserisci il tuo cognome> ");
    luncog = cognome.length();
    diffString = "";
    if (luncog<lunom){
    	lunghezza = lunom;
    	diff = lunom - luncog;
    	for (int i=0;i<diff/2;i++)
    		diffString = diffString.concat(" ");
    	cognome = diffString+cognome+diffString;
    }else{
    	lunghezza = luncog;
    	diff = luncog - lunom;
    	for (int i=0;i<diff/2;i++)
    		diffString = diffString.concat(" ");
    	nome = diffString+nome+diffString;}
    //costruzione delle stringhe che costituiranno la cornice
    String rigaCornice = "";
    for (int i = 0; i < lunghezza + 6; i = i + 1)
      rigaCornice = rigaCornice.concat("*");
    String spazi = "";
    for (int i = 0; i < lunghezza + 4; i = i + 1)
      spazi = spazi.concat(" ");
    String rigaIntermedia, rigaTesto1, rigaTesto2;
    rigaIntermedia = "*" + spazi + "*";
    rigaTesto1 = "*  " + nome + "  *";
    rigaTesto2 = "*  " + cognome + "  *";
    //visualizzazione della cornice
    out.println(rigaCornice);
    out.println(rigaIntermedia);
    out.println(rigaTesto1);
    out.println(rigaIntermedia);
    out.println(rigaTesto2);
    out.println(rigaIntermedia);
    out.println(rigaCornice);
  }
}
