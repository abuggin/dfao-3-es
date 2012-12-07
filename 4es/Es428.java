import prog.io.*;

class Es428 {
  public static void main(String args[]){
    ConsoleInputManager in = new ConsoleInputManager(); 
    ConsoleOutputManager out = new ConsoleOutputManager(); 
    // ax^2+bx+c=0
    Double a = in.readDouble("Inserisci \n\ttermine di grado massimo ");
    Double b = in.readDouble("\ttermine di grado uno ");
    Double c = in.readDouble("\ttermine noto ");
    Double delta = Math.sqrt((b*b) - (4*a*c));
    if( delta > 0){
      //2 soluzioni distinte
      Double sol1= ((b*(-1)+delta)/2*a);
      Double sol2= ((b*(-1)-delta)/2*a);
    out.println("Le due soluzioni sono\n\tx= "+sol1+"\n\tx= "+sol2);}
    else
      if(delta < 0){
        out.println("Le soluzione sono nel campo complesso");
      }
      else{ //delta == 0
        Double sol1=(b*(-1)/2*a);
        out.println("Le 2 soluzioni coincidenti sono\n\tx= "+sol1);
        }
  }
}
