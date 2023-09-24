/*By extending thread class*/
class  A extends Thread{
    
    public void run(){
    try{ for(int i=1;i<=5;i++){
         System.out.println("Ayush");
         Thread.sleep(1000);
       }
    }
    catch(InterruptedException i){
        
    }
    }
}
//Here is only one one thread that is main thread
class SingleThread{
    public static void main(String args[])throws InterruptedException{
        A t=new A();
        t.run();
        for(int i=1;i<=5;i++){
            System.out.println("main thread");
            Thread.sleep(1000);
        }
    }
}