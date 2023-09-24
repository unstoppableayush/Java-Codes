/*By IMplementing Runnable Interface*/
class A implements Runnable{
    public void run(){
     for(int i=1; i<5; i++){
         System.out.println("My child Thread");
     }
    }
}
class RunnableInterfaceThread {
    public static void main(String args[]){
        A r=new A();
        Thread t=new Thread(r);
        t.start();
        for(int i=1; i<5; i++){
            System.out.println("My main Thread");
       }
    }
}
