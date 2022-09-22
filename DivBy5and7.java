package Rough;

public class DivBy5and7 {
    public static void main(String args[]) {
      int i=1;
      while(i<=200){
          if(i%5==0 && i%7==0){
               System.out.println("Nos. divisible by 5 & 7: " +i);
          }
          if(i%5==0 ){
              System.out.println("Nos. divisible by 5 : " +i);
         }
          
          else if(i%7==0 ){
              System.out.println("Nos. divisible by 7 : " +i);
         }
         
     i++;
          }
      }}