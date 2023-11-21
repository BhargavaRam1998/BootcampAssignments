package BasicPrograms;

import java.util.HashMap;

public class Roman {
    public static int RomantoInt (String S) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        hashMap.put('I', 1);
        hashMap.put('V', 5);
        hashMap.put('X', 10);
        hashMap.put('L', 50);
        hashMap.put('C', 100);
        hashMap.put('D', 500);
        hashMap.put('M', 1000);

        int length = S.length();
        int converted_number = 0;
        int i ;
        for( i=1; i<length; i++){
            char character = S.charAt(i-1);
            if (character == 'I' && S.charAt(i) == 'V')
            {
                converted_number += 4;
                i++;
            }else if (character == 'I' && S.charAt(i) == 'X')
            {
                converted_number += 9;
                i++;
            }else if (character == 'X' && S.charAt(i) == 'L')
            {
                converted_number += 40;
                i++;
            }else if (character == 'X' && S.charAt(i) == 'C')
            {
                converted_number += 90;
                i++;
            }else if (character == 'C' && S.charAt(i) == 'D')
            {
                converted_number += 400;
                i++;
            }else if (character == 'C' && S.charAt(i) == 'M')
            {
                converted_number += 900;
                i++;
            }else
            {
                converted_number += hashMap.get(character);
            }

        }
        if(i == length)
            converted_number += hashMap.get(S.charAt(length-1));

        return converted_number;

    }
    public static void main(String[] args) {
       int x = Roman.RomantoInt("III");
       System.out.println(x);
    }
}
