package org.example.week6;

import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary {
    private HashMap<String, String> translations;

    public Dictionary() {
        this.translations = new HashMap<>();
    }

    public String translate(String word) {
        return translations.get(word);
    }

    public void add(String word, String translation) {
        translations.put(word, translation);
    }

    public int amountOfWords() {
        return translations.size();
    }

    public ArrayList<String> translationList() {
        ArrayList<String> translationList = new ArrayList<>();
        for (String key : translations.keySet()) {
            String translation = key + " = " + translations.get(key);
            translationList.add(translation);
        }
        return translationList;
    }
}
