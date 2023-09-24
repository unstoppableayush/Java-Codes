class WithinMainClass{
 int id;
 String name;
 //creating main method inside the Student class
 public static void main(String args[]){
 //Creating an object or instance
 WithinMainClass s1=new WithinMainClass();//creating an object of Student
 //Printing values of the object
 System.out.println(s1.id);//accessing member through reference variable
 System.out.println(s1.name);
 }
}
