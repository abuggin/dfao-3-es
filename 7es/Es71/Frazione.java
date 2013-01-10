public class Frazione {
  private int num, den;

  public Frazione(int x, int y){
    if(y==0) {
      num = 0;
      den = 0;
    } else {
      boolean negativo = (x<0 && y>0) || (x>0 && y<0);
      if (x<0)
        x= -x;
      if (y<0)
        y= -y;
      int m = mcd(x,y);
      if (negativo)
        num = -x/m;
        else
          num = x/m;
        den = y/m;
    }
  }

  public Frazione(int x){
    this(x,1);
  }

  public Frazione piu(Frazione f) {
    int n = this.num*f.den + this.den * f.num;
    int d = this.den*f.den;
    return new Frazione(n,d);
  }

  public Frazione meno(Frazione f){
    int n = this.num*f.den - this.den * f.num;
    int d = this.den*f.den;
    return new Frazione(n,d);
  }

  public Frazione per(Frazione f){
    int n = this.num * f.den;
    int d = this.den * f.den;
    return new Frazione(n,d);
  }

  public Frazione diviso(Frazione f){
    int n = this.num * f.den;
    int d = this.num * f.num;
    return new Frazione(n,d);
  }
  public boolean equals(Frazione f){
  return this.num == f.num && this.den == f.den;
  }

  public boolean isMinore(Frazione f){
  Frazione g = this.meno(f);
  return g.num<0;
  }

  public boolean isMaggiore(Frazione f){
  Frazione g = this.meno(f);
  return g.num>0;
  }
  public String toString(){
    if (den==0)
      return "impossibile";
    else if (den == 1)
      return String.valueOf(num);
    else
      return num + "/" + den;
  }

  public int getNumeratore() {
    return num;
  }
  public int getDenominatore() {
  return den;
  }

  private static int mcd(int a, int b) {
    int resto;
    do{
      resto = a%b;
      a=b;
      b=resto;
    }while (resto!=0);
    return a;
  }

  public Frazione inversa(){
    return new Frazione(this.den,this.num);
  }

}

