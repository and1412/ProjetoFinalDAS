
class CorridaThreads
{
  public static void main (String args[])
   {
    MeuThread a,b;
    a=new MeuThread("Leonardo Xavier Rossi");
    a.start();
    b=new MeuThread("Andre Augusto Cesta");
    b.start();
    try {a.join(); } catch (InterruptedException ignorada) {}
    try {b.join(); } catch (InterruptedException ignorada) {}
   }
}
