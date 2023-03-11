package com.company;

public class Student extends Human {
    private int groupNumber;
    private static int count;
    public static final int ID = 12;

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public Student (String name) {
        super(name);
        count++;
    }

    public Student(int groupNumber) {
        this.groupNumber = groupNumber;
        count++;
    }

    public static int getCount() {
        return count;
    }
}
