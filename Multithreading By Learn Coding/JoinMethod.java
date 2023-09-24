/*Join Method*/
class ThreadClass1 extends Thread{
    public void run(){
        String n=Thread.currentThread().getName();
        for(int i=1;i<=3;i++){
            System.out.println(n);
        }
    }
}
public class JoinMethod {
    public static void main(String args[]){
        ThreadClass1 t1=new ThreadClass1();
        ThreadClass1 t2=new ThreadClass1();
        ThreadClass1 t3=new ThreadClass1();

        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");
        
        t2.start();
        try{
            t2.join();
        }
        catch(InterruptedException i)
        {

        }
        t1.start();
        t3.start();
        String n=Thread.currentThread().getName();
        for(int i=1;i<=3;i++){
            System.out.println(n);
        }


    }
}
