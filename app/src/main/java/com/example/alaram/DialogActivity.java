package com.example.alaram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

import com.google.firebase.database.FirebaseDatabase;

import java.util.Calendar;

public class DialogActivity extends AppCompatActivity {


    private Button switch1;
    private Button switch2;
    private Button switch3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);

        switch1=findViewById(R.id.switch1);
        switch2=findViewById(R.id.switch2);
        switch3=findViewById(R.id.switch3);



        switch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                    startActivity(new Intent(getApplicationContext(), Time.class));



            }
        });

        switch2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {




                startActivity(new Intent(getApplicationContext(), Calander.class));
            }
        });

        switch3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                startActivity(new Intent(getApplicationContext(),Alaram.class));
            }
        });



    }
}