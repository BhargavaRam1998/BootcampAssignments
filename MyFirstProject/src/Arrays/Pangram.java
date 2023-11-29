package Arrays;

public class Pangram {

    public static boolean isPangramorNot(String sentence){

        boolean[] arr = new boolean[26];

        for (int i=0; i<sentence.length(); i++){
            arr[sentence.charAt(i) - 'a'] = true;
        }

        for (int i=0; i<26; i++){
            if(!arr[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
