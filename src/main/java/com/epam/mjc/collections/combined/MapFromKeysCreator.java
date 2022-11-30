package com.epam.mjc.collections.combined;

import java.util.*;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {

        Map<Integer, Set<String>> createdMap = new HashMap<>();
        for (Map.Entry<String, Integer> e : sourceMap.entrySet()) {
            if (createdMap.containsKey(e.getKey().length())) {
                createdMap.get(e.getKey().length()).add(e.getKey());
            }
            else {
                Set<String> set = new HashSet<>();
                set.add(e.getKey());
                createdMap.put(e.getKey().length(), set);
            }
        }

        return createdMap;
//        throw new UnsupportedOperationException("You should implement this method.");
    }
}
