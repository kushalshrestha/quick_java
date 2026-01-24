/*
 * Copyright (c) 2026.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package problem_solving.warmup_1;

/*
* Given a string, return a string made of the first 2 chars (if present),
* however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".

startOz("ozymandias") → "oz"
startOz("bzoo") → "z"
startOz("oxx") → "o"
* */
public class StartOz {
    public String startOz(String text) {
        String subText;
        if (text.length() >= 2)
            subText = text.substring(0,2);
        else {
            subText = text;
            return subText;
        }
        if (subText.startsWith("oz")) return "oz";
        if (subText.startsWith("o")) return "o";
        if (subText.charAt(1) == 'z') return "z";
        return text;
    }

    public static void main (String[] args) {
        StartOz so = new StartOz();

        System.out.println(so.startOz("ozymandias"));
        System.out.println(so.startOz("z"));
        System.out.println(so.startOz("o"));
    }
}
