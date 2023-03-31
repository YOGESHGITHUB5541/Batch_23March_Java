package org.Day_15th_PalindromNumber;

public class Ex3{
    public static void main(String[] args){
    int num=121, rev=0, rem=0;
     int temp=num;
     while(temp>0){
        rem=temp%10;
        rev=rev*10+rem;
        temp=temp/10;
      }
        if(num==rev){
       System.out.println("Number is Palindrome");
      }else{
       System.out.println("Number is Not Palindrome");
   }
}
}