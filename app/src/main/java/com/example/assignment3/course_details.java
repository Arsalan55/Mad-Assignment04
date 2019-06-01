package com.example.assignment3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class course_details extends AppCompatActivity {
    ImageView imageView;
    TextView C_name,C_code,C_teacher_name,C_timing;
    String course_name,course_code,course_time,teacher_name;
    int image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_details);
        C_teacher_name=findViewById(R.id.teacher_name);
        C_timing=findViewById(R.id.course_time);
        imageView=findViewById(R.id.img);
        C_name=findViewById(R.id.course_name);
        C_code=findViewById(R.id.course_code);
        course_time=getIntent().getStringExtra("course_time");
        teacher_name=getIntent().getStringExtra("teacher_name");
        course_name=getIntent().getStringExtra("course_name");
        course_code=getIntent().getStringExtra("course_code");
        image=getIntent().getIntExtra("img",0);
        C_name.setText(course_name);
        C_code.setText(course_code);
        C_timing.setText(course_time);
        C_teacher_name.setText(teacher_name);
        imageView.setImageResource(image);

    }
}
