package com.example.taskactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    ImageView reg,courses,trainner,fees,feedback;
    TextView reg2,courses2,trainner2,fees2,feedback2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        reg=findViewById(R.id.reg);
        courses=findViewById(R.id.courses);
        trainner=findViewById(R.id.trainner);
        fees=findViewById(R.id.fees);
        feedback=findViewById(R.id.feedback);
        reg2=findViewById(R.id.reg2);
        courses2=findViewById(R.id.courses2);
        trainner2=findViewById(R.id.trainner2);
        fees2=findViewById(R.id.fees2);
        feedback2=findViewById(R.id.feedback2);


        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,RegActivity.class);
                startActivity(i);
            }
        });
        courses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,CourseActivity.class);
                startActivity(i);
            }
        });
        trainner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,TrainnerActivity.class);
                startActivity(i);
            }
        });
        fees.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,FeesActivity.class);
                startActivity(i);
            }
        });
        feedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,FeedbackActivity.class);
                startActivity(i);
            }
        });
        reg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,RegActivity.class);
                startActivity(i);
            }
        });
        courses2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,CourseActivity.class);
                startActivity(i);
            }
        });
        trainner2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,TrainnerActivity.class);
                startActivity(i);
            }
        });
        fees2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,FeesActivity.class);
                startActivity(i);
            }
        });
        feedback2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,FeedbackActivity.class);
                startActivity(i);
            }
        });
    }
}
