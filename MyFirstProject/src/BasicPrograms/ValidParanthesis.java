package BasicPrograms;

public class ValidParanthesis {

    public static boolean isValid(String s) {

        char r = s.charAt(0);
        char r1 =  s.charAt(1);

        if (r == '('){

           if (r1 == ')'){
               return true;
           }else{
               return false;
           }

        }

        if (r == '['){

            if (r1 == ']'){
                return true;
            }else{
                return false;
            }
        }

        if (r == '{'){

            if (r1 == '}'){
                return true;
            }else{
                return false;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String s = "()[]{}";
        isValid(s);
    }
}
