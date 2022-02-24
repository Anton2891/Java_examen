package com.company;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        Course java = new Course("Java", new Group("1J"), new Group("2J"), new Group("3J"));
        Course python = new Course("Python", new Group("1P"), new Group("2P"), new Group("3P"), new Group("4P"));
        Course cPlus = new Course("C++", new Group("1J"), new Group("2J"));

        ArrayList<Course> courseArrayList = new ArrayList<>();
        courseArrayList.add(java);
        courseArrayList.add(python);
        courseArrayList.add(cPlus);

        File fileGroup = new File("groups.json");
        GsonBuilder gsonBuilder1 = new GsonBuilder();
        Gson gson1 = gsonBuilder1.create();
        String json1 = gson1.toJson(courseArrayList);
        try {
            FileUtils.write(fileGroup, json1, StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }

        File fileStudents = new File("students.json");

        ArrayList<Student> students = new ArrayList<>();

        while (true) {
            Gson gs = new Gson();
            try {
                String jsonFromStudents = FileUtils.readFileToString(new File("students.json"), StandardCharsets.UTF_8);
                TypeToken<ArrayList<Student>> typeToken = new TypeToken<ArrayList<Student>>() {
                };
                if (!jsonFromStudents.isEmpty()){
                students = gs.fromJson(jsonFromStudents, typeToken.getType());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            AddStudent.addStudent(courseArrayList, students);

            GsonBuilder gsonBuilder = new GsonBuilder();
            Gson gson = gsonBuilder.create();
            String json = gson.toJson(students);
            System.out.println(json);
            try {
                FileUtils.write(fileStudents, json, StandardCharsets.UTF_8);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
