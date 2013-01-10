/**
 * La classe <code>Orario</code> rappresenta un orario. 
 * @author Alessandro Buggin
 * @version 15
 */

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Orario implements Comparable<Orario>{
  // CAMPI
private int m;// minuti
  // COSTRUTTORI
  /**
   * Costruisce un nuovo orario da due interi 
   @param hh ore 
   @param mm minuti
   */
  public Orario(int hh, int mm){
    m = hh*60+mm;
  }
  /**
  Costruisce un nuovo orario da un intero   
  @param x minuti
  */
  public Orario(int x){
    this(0,x);
  }
  /**
  Costruisce un orario dell'ora corrente
  */
  public Orario(){
    GregorianCalendar adesso = new GregorianCalendar();
    m= adesso.get(Calendar.HOUR_OF_DAY)*60+adesso.get(Calendar.MINUTE);
  }
  /**
  Costruisce un orario da una 
  @param s stringa del formato hh.mm
  */
  public Orario(String s){
    m=Integer.parseInt(s.substring(0,2))*60+Integer.parseInt(s.substring(3));
  }
  /**
  metodo che controlla se due orari rappresentano la stessa ora.
  @return <code>true</code> se i due orari rappresentano la stessa ora
  */
  public boolean equals(Orario o){
    return this.m == o.m;
  }
  public boolean isMinore(Orario o){
    return this.m < o.m;
  }
  public boolean isMaggiore(Orario o){
    return this.m > o.m;
  }
  public int quantoManca(Orario o){
    //Orario now = new Orario();
    return o.m - this.m;
  }
  public int getOre() {
    return m/60;
  }
  public int getMinuti(){
    return m%60;
  }
  public String toString(){
    return ""+getOre()+" ore, "+getMinuti()+"minuti";
  }
  public int compareTo(Orario o){
    if(this.equals(o))
      return 0;
    else
      if(this.isMinore(o))
        return -1;
      else
        return 1;
  }
}

