/* isAlive() method */
class ThreadClass4 extends Thread{
    @Override
    public void run(){
        System.out.println("isAlive method program..!");
    }
}
public class IsAliveMethod {
     public static void main(String args[]){

     
    ThreadClass4 t1=new ThreadClass4();
    ThreadClass4 t2=new ThreadClass4();

    System.out.println(t1.isAlive());
    t1.start();
    System.out.println(t1.isAlive());
    t2.start();

  }
}
