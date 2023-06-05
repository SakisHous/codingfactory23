package gr.aueb.cf.ch11;

import java.util.Scanner;

/**
 * Definition of a simple Student class.
 * [POJO (Plain Old Java Objects)]
 * Student Java Beans
 */
public class Student {

    private static int studentsCount;
    static Scanner sc = new Scanner(System.in);

    static {
        int num = sc.nextInt();
        studentsCount = (num == 1) ? 1 : 0;
    }

    private int id;
    private String firstname;
    private String lastname;

    // Constructor
    public Student() {
        studentsCount++;
    }

    // Overloaded Constructor
    public Student(int id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        studentsCount++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public static int getStudentsCount() {
        return studentsCount;
    }
}
