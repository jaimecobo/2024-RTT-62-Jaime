package com.perscholas.java_basics.PA_303_11_1;

import javax.swing.*;
import java.util.*;

public class JavaSort {
/*
You are given a list of student information: ID, FirstName, and CGPA.
Your task is to rearrange them according to their CGPA in decreasing order.
If two student have the same CGPA, then arrange them according to their first name in alphabetical order.
If those two students also have the same first name, then order them according to their ID. No two students have the same ID.
Hint: You can use comparators to sort a list of objects. See the oracle docs to learn about comparators.

Input Format.-
    The first line of input contains an integer N, representing the total number of students.
    The next N lines contains a list of student information in the following structure:
    ID Name CGPA

Constraints.-
    The name contains only lowercase English letters.
    The ID contains only integer numbers without leading zeros.
    The CGPA will contain, at most, 2 digits after the decimal point.

Output Format.-
    After rearranging the students according to the above rules, print the first name of each student on a separate line.

Sample Input.-
    5
    33 Rumpa 3.68
    85 Ashis 3.85
    56 Samiha 3.75
    19 Samara 3.75
    22 Fahim 3.76

Sample Output.-
    Ashis
    Fahim
    Samara
    Samiha
    Rumpa
*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfStudents = Integer.parseInt(sc.nextLine());
        List<Student> students = new ArrayList<Student>(numberOfStudents);
        for (int i = 0; i < numberOfStudents; i++) {
            // Split the input into an array of strings
            String[] studentData = sc.nextLine().split(" ");
            // Assign values to variables
            int id = Integer.parseInt(studentData[0]);
            String name = studentData[1];
            double grade = Double.parseDouble(studentData[2]);
            students.add(new Student(id, name, grade));
        }

        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                // First sort by grade in descending order
                int gradeComparison = Double.compare(s2.getCGPA(), s1.getCGPA());
                if (gradeComparison!= 0) {
                    return gradeComparison;
                }
                // Then by name alphabetically
                int nameComparison = s1.getName().compareTo(s2.getName());
                if (nameComparison!= 0) {
                    return nameComparison;
                }
                // Finally by ID in ascending order
                return Integer.compare(s1.getId(), s2.getId());
            }
        });

        for (Student student : students) {
            System.out.println(student.getName());
        }

    }
}


class Student{
    int id;
    String name;
    double CGPA;
    public Student(int id, String name, double CGPA) {
        this.id = id;
        this.name = name;
        this.CGPA = CGPA;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getCGPA() {
        return CGPA;
    }
    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }
}