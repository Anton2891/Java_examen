package com.company;

public class Student {
    public Integer id;
    public String surname;
    public String name;
    public String lastName;
    public int age;
    public String gender;
    public String course;
    public String group;

    public Student() {
    }

    public Student(Integer id, String surname, String name, String lastName, int age, String gender, Course course, Group group) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.course = course.name;
        this.group = group.group;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", Surname='" + surname + '\'' +
                ", Name='" + name + '\'' +
                ", LastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", course=" + course +
                ", group=" + group +
                '}';
    }
}
