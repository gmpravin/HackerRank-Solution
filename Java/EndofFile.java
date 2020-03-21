import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

Scanner s = new Scanner(System.in);
int i=1;
    try {
      while (s.hasNextLine()){
          String str=s.nextLine();
          if(str.isEmpty()){
              break;
          }
         System.out.println(i + " " +  str);
      i++;
      }
    }
    finally{
      s.close();
    }


    }
}
