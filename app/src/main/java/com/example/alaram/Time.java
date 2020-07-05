package com.example.alaram;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextClock;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class Time extends AppCompatActivity {


    private TimePicker alaram;
    private TextClock  time;
    private Button save;
    private Button cancel;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);

        alaram=findViewById(R.id.alaram);
        time=findViewById(R.id.time);
        save=findViewById(R.id.save);
        cancel=findViewById(R.id.cancel);

        final Ringtone r=RingtoneManager.getRingtone(getApplicationContext(),RingtoneManager.getDefaultUri(RingtoneManager.TYPE_RINGTONE));


        final Timer t=new Timer();


        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


        t.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                if(time.getText().toString().equals(Alarm())){

                    r.play();


                }
                else
                {
                    r.stop();
                }
            }
        },0,1000);


        Toast.makeText(getApplicationContext(),"Alarm Set",Toast.LENGTH_SHORT).show();

            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t.scheduleAtFixedRate(
                        new TimerTask() {
                    @Override
                    public void run() {
                        r.stop();

                    }
                },0,1000);

                startActivity(new Intent(getApplicationContext(),DialogActivity.class));
                Toast.makeText(getApplicationContext(),"Alaram Cancelled",Toast.LENGTH_SHORT).show();
            }
        });






    }


    public String Alarm()
        {
            Integer ah=alaram.getCurrentHour();
            Integer am=alaram.getCurrentMinute();

            String sh;
            String s;

            String d;



            if(am<10)
            {
                sh="0";
                sh=sh.concat(am.toString());
            }
            else
            {
                sh=am.toString();
            }


            if(ah>=12)
            {


                ah=ah-12;
                s=ah.toString().concat(":").concat(sh).concat(" PM");
            }
            else
            {
                s=ah.toString().concat(":").concat(sh).concat(" AM");
            }

            return  s;



        }


}