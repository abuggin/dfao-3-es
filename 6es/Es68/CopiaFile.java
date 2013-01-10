import prog.io.*;

class CopiaFile {
  public static void main(String[] args) {
    ConsoleInputManager in = new ConsoleInputManager();
      
    //legge il nome del file da copiare e crea l'oggetto corrispondente
    String nomeIngresso = in.readLine("Nome del file da copiare? ");
    while(!FileInputManager.exists(nomeIngresso)){
      nomeIngresso = in.readLine("Nome file da copiare non trovato, reimmettere > ");
    }
      
    FileInputManager ingresso = new FileInputManager(nomeIngresso);
    //legge il nome del file su cui copiare e crea l'oggetto 
    //corrispondente
    String nomeCopia = in.readLine("Nome della copia? ");
    if(FileInputManager.exists(nomeCopia)){
      boolean over = in.readSiNo("File gia' esistente\nSovrascrivere? s/n ");
        if(!over)
          nomeCopia = in.readLine("Inserire differente nome della copia > ");
          }
    FileOutputManager uscita = new FileOutputManager(nomeCopia);

    String riga;
    while ((riga = ingresso.readLine()) != null)
      //trascrizione della riga letta
      uscita.println(riga);
      
    //chiusura dei file
    ingresso.close();
    uscita.close();
  }
}
