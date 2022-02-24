package com.company;

import java.util.Arrays;

public class Course implements Comparable<String>{
    public String name;
    public Group[] group;


    public Course(String name, Group... group) {
        this.name = name;
        this.group = group;
    }

    public Group[] getGroup() {
        return group;
    }

    public void setGroup(Group[] group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Course{" +
                "group=" + Arrays.toString(group) +
                '}';
    }

    @Override
    public int compareTo(String o) {
        return 0;
    }
}
