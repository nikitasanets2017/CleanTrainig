package Themes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegularExpressions {
    public static void main(String[] args) {

 /* [abc]  - A single character for exaple a,b or c
    [a-z]  - A single character in a range a to z
    a|b    - Math either a or b
    \d     - a digit [0-9]
    \w     - Word character: [a-zA-Z_0-9]
    .      - Any single character
    a{3}   - Exactly 3 of a: aaa
    a{3, } - 3 or more of a
    a{2,4} - Between 2 or 4 of a: aa, aaa or aaaa
    ^      - The being of a line
    $      - The end of a line
    *      - Math zero or more occurrences
    +      - Math one or more occurrences
    ?      - Math zero or one occurrences
  */

        String string = ("H1o99w7 0a7 Go18od daY!");
        String resultSymbols = string.replaceAll("[A-Za-z!]", "");
        String resultWords = string.replaceAll("[0-9]", "");
        
        System.out.println(resultSymbols + resultWords);
    }
}
