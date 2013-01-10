import prog.io.*;
public class Es71{
  public static void main(String args[]){
    ConsoleInputManager in = new ConsoleInputManager();
    ConsoleOutputManager out = new ConsoleOutputManager();
    int n=5;
    int d=3;
    Frazione prova=new Frazione (n,d);
    out.println(prova.inversa());
  }
}
