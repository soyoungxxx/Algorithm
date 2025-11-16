import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        char[] spellChars = String.join("", spell).toCharArray();
        Arrays.sort(spellChars);
        String sortedSpell = new String(spellChars);

        for (String word : dic) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            if (sortedSpell.equals(sortedWord)) {
                return 1;
            }
        }

        return 2;
    }
}