package controller;

import datastructures.HashSet;
import model.Student;

import java.util.Scanner;

/**
 * @author Vincent Velthuizen
 * Show how the datastructures.HashSet works
 */
public class HashSetLauncher {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Student> students = new HashSet<>();

        int prevSize = -1;
        while (students.size() > prevSize) {
            prevSize = students.size();
            System.out.print("model.Student number: ");
            int studentNumber = scanner.nextInt();
            System.out.print("Name: ");
            String studentName = scanner.next();

            students.add(new Student(studentNumber, studentName));
            System.out.println(students);
        }
    }
}
