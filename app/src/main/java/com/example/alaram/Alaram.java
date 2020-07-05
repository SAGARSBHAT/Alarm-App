
package com.example.alaram;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.CalendarView;

import android.widget.DatePicker;
import android.widget.TextClock;
import android.widget.TimePicker;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class Alaram extends AppCompatActivity {


    private Calendar calender;

    private DatePicker date;


    private FloatingActionButton addtime;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alaram);

        calender = Calendar.getInstance();
        date = findViewById(R.id.date);
        addtime = findViewById(R.id.addtime);


        addtime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cal().equals(date()))
                {
                    startActivity(new Intent(getApplicationContext(), Time.class));
                }
                else
                {
                    startActivity(new Intent(getApplicationContext(),MainActivity.class));
                }


            }
        });





    }

        public String cal () {

            Integer y = calender.get(Calendar.YEAR);
            Integer m = calender.get(Calendar.MONTH);
            Integer d = calender.get(Calendar.DAY_OF_MONTH);
            String s;

            s = m.toString().concat("-").concat(d.toString()).concat("-").concat(y.toString());


            return s;

        }


        public String date ()
        {
            Integer year = date.getYear();
            Integer month = date.getMonth();
            Integer day = date.getDayOfMonth();


            String s;


            s = month.toString().concat("-").concat(day.toString()).concat("-").concat(year.toString());

            return s;


        }

}





