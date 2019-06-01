package com.example.assignment3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<Model>main_list;
    RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        main_list=new ArrayList<>();
        recyclerView=findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        main_list.add(new Model(R.drawable.cp,"Course Name: Computer Programming","Course Code: CS2562","Teacher: Momal Turk","Timing: SAT 11:45AM-2:45PM"));
        main_list.add(new Model(R.drawable.fa,"Course Name: Financial Accounting","Course Code: CS2015","Teacher: Naeem Shaikh","Timing: Mon 8:30AM-11:20AM"));
        main_list.add(new Model(R.drawable.mp,"Course Name: Microprocessor & Assembly Language","Course Code: CS4211","Teacher: Haji Khan","Timing: Fri & Thur 10:00AM-12:00PM"));
        main_list.add(new Model(R.drawable.spm,"Course Name: Software Project Management","Course Code: CS2534","Teacher: Khawar Abbas","Timing: MON & WED 8:30AM-9:50AM"));
        main_list.add(new Model(R.drawable.db,"Course Name: Database","Course Code:CS2506","Teacher: Syed Yousuf","Timing: Tues & Thurs 11:00AM-12:20PM"));
        main_list.add(new Model(R.drawable.la,"Course Name: Linear Algebra","Course Code:CS3264","Teacher: Asmat Aara","Timing: Mon 8:30AM-11:20AM"));
        main_list.add(new Model(R.drawable.mad,"Course Name: Mobile Applicaation Development","Course Code:CS1068","Teacher: Asad Ahsan","Timing: Sat 11:45AM-2:45PM"));
        main_list.add(new Model(R.drawable.psychology,"Course Name: Psychology","Course Code:CS2614","Teacher: Naeem Shaikh","Timing: Thur 12:00PM-3:00PM"));
        main_list.add(new Model(R.drawable.ob,"Course Name: Organizational Behaviour","Course Code:CS2845","Teacher: Zain Noreen","Timing: Tues & Thurs 2:20PM-3:50PM"));

        adapter=new custom_adapter(main_list,getApplicationContext());
        recyclerView.setAdapter(adapter);
    }
}
