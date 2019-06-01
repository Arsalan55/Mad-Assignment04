package com.example.assignment3;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

public class custom_adapter extends RecyclerView.Adapter<custom_adapter.MyViewHolder> {
    List<Model> my_list;
    Context context;

    public custom_adapter(List<Model> my_list, Context context) {
        this.my_list = my_list;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.custom_list,viewGroup,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
            final Model model=my_list.get(i);
            myViewHolder.course_name.setText(model.Course_name);
        myViewHolder.course_code.setText(model.Course_code);
        myViewHolder.course_time.setText(model.C_timing);
        myViewHolder.teacher_name.setText(model.C_teacher);
        myViewHolder.img.setImageDrawable(context.getResources().getDrawable(model.getImage()));
        myViewHolder.relative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(context,course_details.class);
                i.putExtra("img",model.getImage());
                i.putExtra("course_name",model.getCourse_name());
                i.putExtra("course_code",model.getCourse_code());
                i.putExtra("course_time",model.getC_timing());
                i.putExtra("teacher_name",model.getC_teacher());
                context.startActivity(i);

            }
        });
    }

    @Override
    public int getItemCount() {
        return my_list.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView img;
        TextView course_name,course_code,course_time,teacher_name;
        RelativeLayout relative;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            img=itemView.findViewById(R.id.img);
            course_name=itemView.findViewById(R.id.course_name);
            course_code=itemView.findViewById(R.id.course_code);
            course_time=itemView.findViewById(R.id.course_time);
            teacher_name=itemView.findViewById(R.id.teacher_name);
            relative=itemView.findViewById(R.id.relative);
        }
    }
}
