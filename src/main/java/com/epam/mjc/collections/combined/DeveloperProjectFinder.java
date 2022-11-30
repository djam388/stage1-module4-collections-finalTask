package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {

        List<String> foundDeveloperProject = new ArrayList<>();

        for (Map.Entry<String, Set<String>> e : projects.entrySet()) {
            if (e.getValue().contains(developer)) {
                foundDeveloperProject.add(e.getKey());
            }
        }

        foundDeveloperProject.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    o1.compareTo(o2);
                }
                else {

                }
                return 0;
            }
        });
        Collections.sort(foundDeveloperProject, new ProjectNameComparator());
        return foundDeveloperProject;

    }
    class ProjectNameComparator implements Comparator<String> {

        @Override
        public int compare(String o1, String o2) {
            if (o1.length() == o2.length()) {
                return o2.compareTo(o1);
            }
            else if (o1.length() > o2.length()) {
                return -1;
            }
            else {
                return 1;
            }
        }
    }
}
