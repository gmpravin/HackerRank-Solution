import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        int val=a.length();
        int val2=b.length();
        if(val!=val2){
            return false;
        }
       
        int c[] = new int[26], d[] = new int[26] ;
        a = a.toUpperCase();
        b = b.toUpperCase();
        for(int i=0; i<a.length(); i++){
            c[a.charAt(i) - 'A']++;
            d[b.charAt(i) - 'A']++;
        }
        for(int i =0;i<26; i++)
            if(c[i] != d[i] ){
return false;
            } 
        return true;
    }

  public static void main(String[] args) {
