/*It will display the prime numbers between 1 and 100.*/

class PrimeNumbers
{
   public static void main (String[] args)
   {    
       int i = 0;
       int num = 0;
       int sum = 0;
       //Empty String
       String  primeNumbers = " "; 

       for (i = 1; i <= 100; i++)         
       {           
          int counter=0;     
          for(num =i; num>=1; num--)
         {
             if(i%num==0)
               {   
                counter = counter + 1;
               }
         }
        if (counter ==2)
        {
         //Appended the Prime number to the String
         primeNumbers = primeNumbers + i + " "; 
          sum = sum + i;
        }  
     }  
      System.out.println("Prime numbers from 1 to 100 are :");
       System.out.println(primeNumbers); 
       System.out.println("Sum of Prime numbers from 1 to 22 are :");
       System.out.println(sum);
   }
}