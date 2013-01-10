import prog.io.*;
public class Es73{
  public static void main(String args[]){
    ConsoleInputManager in = new ConsoleInputManager();
    ConsoleOutputManager out = new ConsoleOutputManager();
    int n=5;

    int d=3;
    Rettangolo r = new Rettangolo(n,d);
    out.println(r.toString());
  }
}
