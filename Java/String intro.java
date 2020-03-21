import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
       System.out.println(A.length()+B.length());
       int value = A.compareTo(B);
       int value2 = B.compareTo(A);
       
       if(value>value2){
           System.out.println("Yes");
       }else{
           System.out.println("No");
       }
       String s1=A.substring(0,1).toUpperCase();
       String ss1=s1+A.substring(1);
       String s2=B.substring(0,1).toUpperCase();
       String ss2=s2+B.substring(1);
       System.out.println(ss1+" "+ss2);
        
    }
}



