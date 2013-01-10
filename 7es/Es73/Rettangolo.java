public class Rettangolo{
  private double base, altezza;

  public Rettangolo(double x,double y){
  base=x;
  altezza=y;}

  public double getArea(){
    return base*altezza;
  }
  public double getPerimetro(){
    return 2*base+2*altezza;
  }
  public double getBase(){
    return base;
  }
  public double getAltezza(){
    return altezza;
  }
  public boolean equals(Rettangolo r){
    return this.getArea()==r.getArea();
  }
  public boolean haAreaMaggiore(Rettangolo r){
    return this.getArea()>r.getArea();
  }
  public boolean haPerimetroMaggiore(Rettangolo r){
    return this.getPerimetro()>r.getPerimetro();
  }
  public String toString(){
    return "base = "+base+", altezza = "+altezza;
  }
}
