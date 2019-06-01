package com.example.assignment3;

public class Model {
    int image;
    String Course_name, Course_code, C_teacher, C_timing;

    public Model(int image, String course_name, String course_code, String c_teacher, String c_timing) {
        this.image = image;
        Course_name = course_name;
        Course_code = course_code;
        C_teacher = c_teacher;
        C_timing = c_timing;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getCourse_name() {
        return Course_name;
    }

    public void setCourse_name(String course_name) {
        Course_name = course_name;
    }

    public String getCourse_code() {
        return Course_code;
    }

    public void setCourse_code(String course_code) {
        Course_code = course_code;
    }

    public String getC_teacher() {
        return C_teacher;
    }

    public void setC_teacher(String c_teacher) {
        C_teacher = c_teacher;
    }

    public String getC_timing() {
        return C_timing;
    }

    public void setC_timing(String c_timing) {
        C_timing = c_timing;
    }
}