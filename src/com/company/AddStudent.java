package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class AddStudent {

    public static void addStudent(ArrayList<Course> courseArrayList, ArrayList<Student> students) {
        Scanner sc = new Scanner(System.in);

        Student newStudent = new Student();

        if (students.isEmpty()) {
            newStudent.setId(1);
        } else {
            newStudent.setId(students.size() + 1);
        }

        System.out.println("Введите фамилию");
        newStudent.setSurname(sc.nextLine());

        System.out.println("Введите имя");
        newStudent.setName(sc.nextLine());

        System.out.println("Введите отчество");
        newStudent.setLastName(sc.nextLine());

        System.out.println("Введите возраст");
        newStudent.setAge(sc.nextInt());

        System.out.println("Введите пол:\n 1 - FEMALE,\n 2 - MALE");
//        String gender = sc.nextLine();
        switch (sc.nextLine()) {
            case "1":
                newStudent.setGender("FEMALE");
                break;
            case "2":
                newStudent.setGender("MALE");
                break;
        }

        System.out.println("Введите номер курса: \n 1-Java, \n 2-Python, \n 3-C++");
        String course = sc.nextLine();
        switch (course) {
            case "1": {
                newStudent.setCourse(courseArrayList.get(0).name);
                System.out.println("Введите группу 1, 2 или 3");
                String group = sc.nextLine();
                switch (group) {
                    case "1":
                        newStudent.setGroup(String.valueOf(courseArrayList.get(0).group[0]));
                        break;
                    case "2":
                        newStudent.setGroup(String.valueOf(courseArrayList.get(0).group[1]));
                        break;
                    case "3":
                        newStudent.setGroup(String.valueOf(courseArrayList.get(0).group[2]));
                        break;
                }
                break;
            }
            case "2": {
                newStudent.setCourse(courseArrayList.get(1).name);
                System.out.println("Введите группу 1, 2, 3 или 4");
                String group = sc.nextLine();
                switch (group) {
                    case "1":
                        newStudent.setGroup(String.valueOf(courseArrayList.get(1).group[0]));
                        break;
                    case "2":
                        newStudent.setGroup(String.valueOf(courseArrayList.get(1).group[1]));
                        break;
                    case "3":
                        newStudent.setGroup(String.valueOf(courseArrayList.get(1).group[2]));
                        break;
                    case "4":
                        newStudent.setGroup(String.valueOf(courseArrayList.get(1).group[3]));
                        break;
                }
                break;
            }
            case "3": {
                newStudent.setCourse(courseArrayList.get(2).name);
                System.out.println("Введите группу 1 или 2");
                String group = sc.nextLine();
                switch (group) {
                    case "1":
                        newStudent.setGroup(String.valueOf(courseArrayList.get(2).group[0]));
                        break;
                    case "2":
                        newStudent.setGroup(String.valueOf(courseArrayList.get(2).group[1]));
                        break;
                }
                break;
            }
        }
        System.out.println("Студент успешно добавлен");
        System.out.println(newStudent);
        students.add(newStudent);
    }
}
