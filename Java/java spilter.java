import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        if (s.length() == 0) {
            System.out.println(0);
            return;
        }
        String regex [] = s.split("[^a-zA-Z]+");
        System.out.println(regex.length);
        for (String word : regex) {
            System.out.println(word);
        }

        
        scan.close();
    }
}

