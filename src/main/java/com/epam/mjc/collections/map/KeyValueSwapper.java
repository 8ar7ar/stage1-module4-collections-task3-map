package com.epam.mjc.collections.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> swappedMap = new LinkedHashMap<>();
        for (Map.Entry<Integer, String> entry : sourceMap.entrySet())

            if (swappedMap.get(entry.getValue()) == null ||
                    swappedMap.get(entry.getValue()) > entry.getKey()){
                swappedMap.put(entry.getValue(), entry.getKey());
            }
        return swappedMap;
    }
}
