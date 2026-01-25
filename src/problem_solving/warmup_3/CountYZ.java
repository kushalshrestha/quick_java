/*
 * Copyright (c) 2026.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package problem_solving.warmup_3;

/**
 * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy"
 * and the 'z' in "fez" count, but not the 'y' in "yellow" (not case sensitive).
 * We'll say that a y or z is at the end of a word if there is not an alphabetic letter
 * immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
 * <p>
 * <p>
 * countYZ("fez day") → 2
 * countYZ("day fez") → 2
 * countYZ("day fyyyz") → 2
 */
public class CountYZ {
    public int countYZ(String text) {
        String[] splitText = text.split(" ");
        int count = 0;
        for (int i = 0; i < splitText.length; i++){
            Character c = splitText[i].charAt(splitText[i].length()-1);
            if(c == 'y' || c == 'z') count++;
        }

        return count;
    }

    public static void main(String[] args) {
        CountYZ cyz = new CountYZ();

        System.out.println(cyz.countYZ("fez day"));
        System.out.println(cyz.countYZ("day fez"));
        System.out.println(cyz.countYZ("day fyyyz"));
    }
}
