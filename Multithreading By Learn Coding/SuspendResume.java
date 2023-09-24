/*Suspend And Resume Method*/
class ThreadClass2 extends Thread{
    public void run(){
        String name=Thread.currentThread().getName();
        for(int i=1;i<=3;i++){
            System.out.println(name);
        }
    }
}
public class SuspendResume {
    public static void main(String args[]){
        ThreadClass2 t1=new ThreadClass2();
        ThreadClass2 t2=new ThreadClass2();
        ThreadClass2 t3=new ThreadClass2();

        t1.setName("Ayush");
        t2.setName("Aditya");
        t3.setName("Abhishek");

        t1.start();

        t2.start();
        t2.suspend(); //pause

        t3.start();

        t2.resume(); //restart
        

    }
}
