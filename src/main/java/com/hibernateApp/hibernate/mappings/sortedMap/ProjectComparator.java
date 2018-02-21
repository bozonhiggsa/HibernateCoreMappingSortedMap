package com.hibernateApp.hibernate.mappings.sortedMap;

import java.util.Comparator;

public class ProjectComparator implements Comparator<String> {

    public int compare(String o1, String o2) {
        final int BEFORE = -1;
        final int AFTER = 1;

        if (o2 == null) {
            return BEFORE * -1;
        }

        Comparable thisProject = o1;
        Comparable thatProject = o2;

        if(thisProject == null) {
            return AFTER * 1;
        } else if(thatProject == null) {
            return BEFORE * -1;
        } else {
            return thisProject.compareTo(thatProject) * -1;
        }
    }
}
