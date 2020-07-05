package com.example.alaram;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.app.AlarmManager;
import android.content.Context;
import android.content.Intent;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;


import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class Calander extends AppCompatActivity {

    private Calendar calender;
    private DatePicker date;
    private Button save;
    private Button cancel;


    private FirebaseAuth mauth;

    private RecyclerView recycle;

    private DatabaseReference data;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calander);



        calender= Calendar.getInstance();
        date=findViewById(R.id.date);
        save=findViewById(R.id.save);
        cancel=findViewById(R.id.cancel);

        recycle=findViewById(R.id.recycle);



        final Ringtone r=RingtoneManager.getRingtone(getApplicationContext(),RingtoneManager.getDefaultUri(RingtoneManager.TYPE_RINGTONE));




        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {




                if (cal().equals(date())) {





                    r.play();






                } else {
                    r.stop();

                }






            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cal().equals(date()))
                {
                    r.stop();

                  data.removeValue();

                }


               startActivity(new Intent(getApplicationContext(),DialogActivity.class));
                Toast.makeText(getApplicationContext(),"Alarm Cancelled",Toast.LENGTH_SHORT).show();

            }
        });



    }


    public String cal()
    {
        Integer m=calender.get(Calendar.MONTH);
        Integer y=calender.get(Calendar.YEAR);
        Integer d=calender.get(Calendar.DAY_OF_MONTH);
        String s;


        s=m.toString().concat("-").concat(d.toString()).concat("-").concat(y.toString());

        return  s;




    }


    public  String date()
    {
        Integer mon=date.getMonth();
        Integer year=date.getYear();
        Integer day=date.getDayOfMonth();


        String s;
        s=mon.toString().concat("-").concat(day.toString()).concat("-").concat(year.toString());

        return  s;
    }




}





