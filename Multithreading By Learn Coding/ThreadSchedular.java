class newer extends Thread{
    public void run(){
        String n=Thread.currentThread().getName();
        for(int i=1;i<=3;i++){
            
            System.out.println(n);
        }
    }
}
class ThreadSchedular {
    public static void main(String args[]){
        newer t1=new newer();
        newer t2=new  newer();
        newer t3=new  newer();

        t1.setName("thread 1");
        t2.setName("thread 2");
        t3.setName("thread 3");

        t1.start();
        t2.start();
        t3.start();
       //main thread it is not used to define and start
        String n=Thread.currentThread().getName();
        for(int i=1;i<=3;i++){
            
            System.out.println(n);
        }
        
    }
}