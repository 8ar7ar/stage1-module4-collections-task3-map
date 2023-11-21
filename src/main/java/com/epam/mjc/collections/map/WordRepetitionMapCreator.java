package com.epam.mjc.collections.map;

import java.util.*;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        StringTokenizer tokens = new StringTokenizer(sentence,
                                                    " ,.",
                                                    false);
        List<String> words = new ArrayList<>();
        while(tokens.hasMoreTokens())
            words.add(tokens.nextToken().toLowerCase());

        Map<String, Integer> wordRepetitionMap = new HashMap<>();

        for (int i = 0; i < words.size(); i++) {
            int count = 1;
            String word = words.get(i);
            for (int j = i+1; j < words.size(); j++){
                if (word.equals(words.get(j))) {
                    words.remove(j);
                    count++;
                }
            }
            wordRepetitionMap.put(word, count);
        }
        return  wordRepetitionMap;
    }
}
