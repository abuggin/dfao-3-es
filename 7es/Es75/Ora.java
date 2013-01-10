import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ora {
  //CAMPI STATICI
  private static char separatore = ':';
  private static boolean formato24 = true;

  //CAMPI
  private int ore, min, sec;

  //COSTRUTTORI
  public Ora(int hh, int mm) {
    ore = hh;
    min = mm;
  }

  public Ora() {
    GregorianCalendar adesso = new GregorianCalendar();
    ore = adesso.get(Calendar.HOUR_OF_DAY);
    min = adesso.get(Calendar.MINUTE);
    sec = adesso.get(Calendar.SECOND);
  }

  public Ora(String s) {
    ore = Integer.parseInt(s.substring(0,2));
    min = Integer.parseInt(s.substring(3,5));
    sec = 0;
  }

  //METODI
  public boolean equals(Ora altro) {
    return this.ore == altro.ore && this.min == altro.min && this.sec == altro.sec;
  }

  public boolean isMinore(Ora altro) {
    return ore < altro.ore || (ore == altro.ore && min < altro.min) || (min == altro.min && sec < altro.sec);
  }

  public boolean isMaggiore(Ora altro) {
    return ore > altro.ore || (ore == altro.ore && min > altro.min) || (min == altro.min && sec > altro.sec);
  }

  public int quantoManca(Ora altro) {
    return (altro.ore - ore) * 60 + altro.min - min;
  }


  public int getOre() {
    return ore;
  }

  public int getMinuti() {
    return min;
  }

  public int getSecondi() {
    return sec;
  }

  public String toString() {
    String risultato;
    String stringaMin = (min < 10 ? "0" : "") + min;
    String stringaSec = (sec < 10 ? "0" : "") + sec;
    if (formato24)
      risultato = String.valueOf(ore) + separatore + stringaMin + separatore + stringaSec;
    else {
      int oraRisultato;
      String suffisso;
      if (ore == 0) {
        oraRisultato = 12;
        suffisso = "am";
      } else if (ore > 0 && ore < 12) {
        oraRisultato = ore;
        suffisso = "am";
      } else if (ore == 12) {
        oraRisultato = 12;
        suffisso = "pm";
      } else {
        oraRisultato = ore - 12;
        suffisso = "pm";
      }
      risultato = String.valueOf(oraRisultato) + separatore
                  + stringaMin + separatore + stringaSec + suffisso;
    }
    return risultato;
  }


  //METODI STATICI
  public static void setFormato24(boolean b) {
    formato24 = b;
  }

  public static void setSeparatoreTo(char ch) {
    separatore = ch;
  }

  public static boolean isFormato24Attivo() {
    return formato24;
  }

  public static char getSeparatore() {
    return separatore;
  }
}
