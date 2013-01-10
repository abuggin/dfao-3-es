import java.util.Calendar;
import java.util.GregorianCalendar;
import prog.utili.MeseDellAnno;
import prog.utili.GiornoDellaSettimana;

public class Data {
  private int d,m,y;
  private static char separatore = '.';
  
  public Data(int dd, int mm, int yy){
    d= dd;
    m= mm;
    y= yy;
  }

  public Data(String s){
  //s= "21.12.2012"
    d = Integer.parseInt(s.substring(0,2));
    m = Integer.parseInt(s.substring(3,5));
    y = Integer.parseInt(s.substring(6,10));
  }
  public Data(){
    GregorianCalendar now = new GregorianCalendar();
    d = now.get(Calendar.DATE);
    m = now.get(Calendar.MONTH) + 1 ;
    y = now.get(Calendar.YEAR);
  }
  public int getAnno(){
    return y;
  }
  public int getGiorno(){
    return d;
  }
  public int getMese(){
    return m;
  }

//  public GiornoDellaSettimana getGiornoDellaSettimana(){
//    return GiornoDellaSettimana.getGiorno(this);
//  }

//  public MeseDellAnno getMesedellAnno(){
//    return MeseDellAnno.getMese(this);
//  }
  private boolean isAnnoBisestile(int anno){
    return anno % 4 == 0 && (anno % 100 != 0 || anno % 400 == 0);
  }

  public boolean isInAnnoBisestile(){
    return isAnnoBisestile(y);
  }
  public int quantoManca(Data altra){
    //numero di giorni
    int risultato = 0;
    int giornianno = 365;
    int difanni = 0, difmesi = 0, difgiorni=0;
    if (y<altra.y || (y==altra.y&&m<altra.m) || (m==altra.m&&d<altra.d)){
      difgiorni=altra.d-this.d;
      difmesi=(altra.m-this.m);
      difanni=altra.y-this.y;
      for(int delta = altra.y; delta < this.y; delta-- ){
        if(isAnnoBisestile(delta))
          difgiorni++;
      }}
    if (y>altra.y || (y==altra.y&&m>altra.m) || (m==altra.m&&d>altra.d)){
      difgiorni=d-altra.d;
      difmesi=m-altra.m;
      difanni=y-altra.y;
      for(int delta = y; delta < altra.y; delta--){
        if(isAnnoBisestile(delta))
          difgiorni++;
      }
    }
    risultato = difanni+difmesi+difgiorni;
      return risultato;
  }

  public String toString(){
    String giorni = (d < 10 ? "0": "") + d;
    String mesi = (m<10?"0":"")+m;
    String anni = "";
    if (y< 10)
      anni = "000"+y;
    else
    if(y<100)
      anni = "00"+y;
    else
    if(y<1000)
      anni = "0"+y;
    else
      anni = ""+y;
    return giorni+separatore+mesi+separatore+anni;
  }
}
