/*Sleep Method*/
class ThreadClass extends Thread{
  public void run(){
      String n=Thread.currentThread().getName();
      try{
          for(int i=1;i<=3;i++){
              System.out.println(n);
              Thread.sleep(3000);
          }
      }
      catch(InterruptedException i){
          System.out.println(i);
      }
  }
}
public class SleepMethod {
    public static void main(String args[]){
         ThreadClass t1=new  ThreadClass();
         ThreadClass t2=new  ThreadClass();
         ThreadClass t3=new  ThreadClass();

         t1.setName("thread 1");
         t2.setName("thread 2");
         t3.setName("thread 3");
         
         t1.start();
         t2.start();
         t3.start();
    }
}
