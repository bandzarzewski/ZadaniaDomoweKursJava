package ZadaniaDomowe;

import java.util.HashMap;

public class Zad7_KabalistycznyZapisDaty {
    public static void main(String[] args) {
        HashMap<Character, Integer> kalendarz = new HashMap<>();
        kalendarz.put('a', 10);
        kalendarz.put('b', 2);
        kalendarz.put('c', 3);


        String[] input = new String[]{"abc"};
        for (int i = 0; i < input.length; i++) {
            int wynik = 0;
            String word = input[i].toLowerCase();
            char[] lettersInWord = word.toCharArray();
            for (char letter : lettersInWord) {
                int a = kalendarz.get(letter);
                wynik = wynik + a;
            }
            System.out.println(wynik);

        }
    }
}

