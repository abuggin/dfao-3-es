import java.util.Calendar;
import java.util.GregorianCalendar;

public class Orario implements Comparable<Orario>{
  private int m;

  public Orario(int hh, int mm){
    m = hh*60+mm;
  }
  public Orario(int x){
    this(1,x);
  }
  public Orario(){
    GregorianCalendar adesso = new GregorianCalendar();
    m= adesso.get(Calendar.HOUR_OF_DAY)*60+adesso.get(Calendar.MINUTE);
  }
  public Orario(String s){
    m=Integer.parseInt(s.substring(0,2))*60+Integer.parseInt(s.substring(3));
  }
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

