package pl.michalPajak.averageNumberOfVowelsInWord;

import java.util.HashSet;
import java.util.Set;

public class Voiwes {

    public boolean isVoiwe (char leter) {

        leter = Character.toLowerCase(leter);

        return (leter == 'a' || leter == 'e' || leter == 'i' || leter == 'o' || leter == 'u');
    }

    public int countVowels(String string) {

        int counter = 0;

        for (int i = 0; i < string.length(); i++) {
            if (isVoiwe(string.charAt(i)))
                counter++;
        }

        return counter;
    }

    public double averageVowels(String string) {

        double average = 0;

        average = (double)string.length() / (double)countVowels(string);

        return average;
    }

    public Set<String> vowelsInWord(String string) {
        Set<String> listVowelsInWord = new HashSet<String>();

        for (int i = 0; i < string.length(); i++) {
            if (isVoiwe(string.charAt(i)))
                listVowelsInWord.add(Character.toString(string.charAt(i)).toLowerCase());
        }

        return listVowelsInWord;
    }
}
