package org.example;

import java.util.HashSet;

public class WordsChecker {
    String[] text;
    HashSet<String> set = new HashSet<>();

    public WordsChecker(String text) {
        this.text = text.split("\\P{IsAlphabetic}+");
        for (String word : this.text) {
            set.add(word);
        }
    }

    public boolean hasWord(String word) {
        return set.contains(word);
    }
}
