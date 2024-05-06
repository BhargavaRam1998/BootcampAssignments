package BasicPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice {

    public int mostWordsFound(String[] sentences) {

        int maxLength = 0;

        for (String str : sentences) {
            int crrLength = str.split(" ").length;

            if (crrLength > maxLength){
                maxLength = crrLength;
            }
        }
        return maxLength;
    }
    public static void main(String[] args) {

    }
}
