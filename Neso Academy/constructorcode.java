class A{
    int a; String name;
    /*A(){
      a=4; name=null;
      
    }*/
    void show(){
    System.out.println(a+" "+name);
    }
}   
class constructorcode{
    public static void main(String args[]){
        A ref=new A();
        ref.show();
    }
}