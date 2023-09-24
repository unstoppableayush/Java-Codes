/*By extending thread class*/
class  A extends Thread{
    @Override
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
class B {
    public static void main(String args[])throws InterruptedException{
        A t=new A();
        t.start();
        for(int i=1;i<=5;i++){
            System.out.println("main thread");
            Thread.sleep(1000);
        }
    }
}