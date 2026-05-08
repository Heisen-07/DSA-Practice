package com.vaibhav;

import java.util.ArrayList;
import java.util.List;

public class Pangram {
    public static void main(String[] args) {
        String s = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(s));
    }

    static boolean checkIfPangram(String s) {
        List<Character> pa= new ArrayList<Character>();
        if (s == null || s.isEmpty()) {
            return false;
        }
        int count = 0;
        int i=0;
        while(i<s.length()){
            char c = s.charAt(i);
            if(pa.contains(c)) {
                i++;
            }
            else if ((c >= 'a' && c <= 'z')) {
                pa.add(c);
                count++;
                i++;
            }
        }
        if (count == 26) {
            return true;
        } else {
            return false;
        }
    }
}
