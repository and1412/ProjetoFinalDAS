public class MeuThread extends Thread {
       public MeuThread(String nome)
       {
        super(nome);
       }
       public void run() // o metodo que vai ser executado no thread tem sempre nome run
       {
           //Logar
           for (int i=0; i<5; i++) {
           System.out.println(getName()+ " na etapa:"+i);
           try {
                sleep((int)(Math.random() * 2000)); //milisegundos
               } catch (InterruptedException e) {}
           }
         System.out.println("Corrida de threads terminada:" + getName());
        }
}
